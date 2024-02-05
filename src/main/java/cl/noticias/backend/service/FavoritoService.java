package cl.noticias.backend.service;

import cl.noticias.backend.exceptions.CustomException;
import cl.noticias.backend.model.Favorito;
import org.springframework.data.domain.Page;

import java.util.Set;

public interface FavoritoService {


    Page<Favorito> BuscarFavoritos(String title, String order, Integer page, Integer size) throws CustomException;

    Set<Favorito> AgregarFavorito(Set<Favorito> favoritos) throws CustomException;

    void EliminarFavorito(Long id) throws CustomException;



}
