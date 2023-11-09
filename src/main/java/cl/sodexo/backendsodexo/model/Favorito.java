package cl.sodexo.backendsodexo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "favoritos")
public class Favorito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private Long idNoticia;
    private String title;
    private String url;
    private String image_url;
    private String news_site;
    @Column(length = 1000)
    private String summary;
    private Date published_at;
    private Date updated_at;
    private boolean featured;

    private Date created;
    @PrePersist
    protected void onCreate() {
        created = new Date();
    }

}