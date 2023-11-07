package cl.sodexo.backendsodexo.repository;

import cl.sodexo.backendsodexo.model.Favorito;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


@Repository
@EnableJpaRepositories
public interface FavoritoRepository extends JpaRepository<Favorito, Long> {

    Page<Favorito> findByTitleContainingIgnoreCase(String title, Pageable pageable);

    Boolean existsByIdNoticia(Long idNoticia);

}
