package cl.noticias.backend.controller;


import cl.noticias.backend.exceptions.CustomException;
import cl.noticias.backend.model.Favorito;
import cl.noticias.backend.service.FavoritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/favoritos")
@CrossOrigin("*")
public class FavoritoController {

    private final FavoritoService favoritoService;

    @Autowired
    public FavoritoController(FavoritoService favoritoService) {
        this.favoritoService = favoritoService;
    }

    @PostMapping("/")
    public ResponseEntity<Set<Favorito>> guardarFavorito(@RequestBody Set<Favorito> favoritos) throws CustomException {
        if (favoritos.isEmpty()) {
            throw new CustomException("No se enviaron favoritos");
        }
        return ResponseEntity.ok( new HashSet<>(favoritoService.AgregarFavorito(favoritos)));
    }

    @GetMapping("/title={title}&order={order}&page={page}&size={size}/")
    public ResponseEntity<Page<Favorito>> obtenerFavoritos(@PathVariable(value = "title", required = false) String title,
                                                           @PathVariable(value = "order", required = false) String order,
                                                           @PathVariable(value = "page", required = false) Integer page,
                                                           @PathVariable(value = "size", required = false) Integer size) throws CustomException {

        return ResponseEntity.ok(favoritoService.BuscarFavoritos(title, order, page, size));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarFavorito(@PathVariable("id") Long id) throws CustomException {
        favoritoService.EliminarFavorito(id);
        return ResponseEntity.ok().build();
    }


}
