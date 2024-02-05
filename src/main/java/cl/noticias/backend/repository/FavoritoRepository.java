package cl.noticias.backend.repository;

import cl.noticias.backend.model.Favorito;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;


@Repository
@EnableJpaRepositories
public interface FavoritoRepository extends JpaRepository<Favorito, Long> {

    Page<Favorito> findByTitleContainingIgnoreCase(String title, Pageable pageable);

    Boolean existsByIdNoticia(Long idNoticia);

    Boolean existsByTitle(String title);

}
