package cl.sodexo.backendsodexo.service;

import cl.sodexo.backendsodexo.exceptions.CustomException;
import cl.sodexo.backendsodexo.model.Favorito;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.Set;

public interface FavoritoService {


    Page<Favorito> BuscarFavoritos(String title, String order, Integer page, Integer size) throws CustomException;

    Set<Favorito> AgregarFavorito(Set<Favorito> favoritos) throws CustomException;

    void EliminarFavorito(Long id) throws CustomException;



}
