package cl.sodexo.backendsodexo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "favoritos")
public class Favorito {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    private Long id_noticia;
    private String title;
    private String url;
    private String image_url;
    private String news_site;
    private String summary;
    private String published_at;
    private String updated_at;
    private boolean featured;

}