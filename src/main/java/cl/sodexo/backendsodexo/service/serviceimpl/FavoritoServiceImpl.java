package cl.sodexo.backendsodexo.service.serviceimpl;

import cl.sodexo.backendsodexo.exceptions.CustomException;
import cl.sodexo.backendsodexo.model.Favorito;
import cl.sodexo.backendsodexo.repository.FavoritoRepository;
import cl.sodexo.backendsodexo.service.FavoritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class FavoritoServiceImpl implements FavoritoService {

    private final FavoritoRepository favoritoRepository;

    @Autowired
    public FavoritoServiceImpl(FavoritoRepository favoritoRepository) {
        this.favoritoRepository = favoritoRepository;
    }

    @Override
    public Page<Favorito> BuscarFavoritos(String title, String order, Integer page, Integer size) throws CustomException {

        if (page.describeConstable().isEmpty() || size.describeConstable().isEmpty()) {
            throw new CustomException("La peticion no viene con un orden valido (asc o desc)");
        }

        Pageable pageable;
        if (order.equals("asc")) {
            pageable = PageRequest.of(page, size, Sort.by("created").ascending());
        }else if (order.equals("desc")  )  {
            pageable = PageRequest.of(page, size, Sort.by("created").descending());
        }else {
            throw new CustomException("La peticion no viene con un orden valido (asc o desc)");
        }

            return favoritoRepository.findByTitleContainingIgnoreCase(title, pageable);

    }

    @Override
    public Set<Favorito> AgregarFavorito(Set<Favorito> favoritos) throws CustomException {
        if (favoritos.isEmpty()) {
            throw new CustomException("No se enviaron favoritos");
        }

        // Use set to automatically handle duplicates
        Set<Favorito> favoritosAgregar = new LinkedHashSet<>();

        favoritos.forEach(favorito -> {
            favorito.setIdNoticia(favorito.getId());
            favorito.setId(null);
            if (!favoritoRepository.existsByIdNoticia(favorito.getIdNoticia())) {
                favoritosAgregar.add(favorito);
            }

        });
        if (favoritosAgregar.isEmpty()) {
            throw new CustomException("No se enviaron favoritos a guardar");
        }
        return new HashSet<>(favoritoRepository.saveAll(favoritosAgregar));
    }
    @Override
    public void EliminarFavorito(Long id) throws CustomException {
        if (favoritoRepository.findById(id).isEmpty()) {
            throw new CustomException("El Registro no existe");
        }

        favoritoRepository.deleteById(id);
    }

}
