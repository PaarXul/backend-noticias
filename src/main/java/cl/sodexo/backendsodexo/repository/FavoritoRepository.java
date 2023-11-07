package cl.sodexo.backendsodexo.repository;

import cl.sodexo.backendsodexo.model.Favorito;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import java.util.Set;

@Repository
@EnableJpaRepositories
public interface FavoritoRepository extends JpaRepository<Favorito, Long> {

   // Favorito findById_noticia(Long id_noticia);

    Page<Favorito> findByTitleContainingIgnoreCase(String title, Pageable pageable);

}
