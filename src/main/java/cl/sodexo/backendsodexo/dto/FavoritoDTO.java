package cl.sodexo.backendsodexo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;

import java.util.Date;

public class FavoritoDTO {
    private Long id;
    private Long id_noticia;
    private String title;
    private String url;
    private String image_url;
    private String news_site;
    private String summary;
    private Date published_at;
    private Date updated_at;
    private boolean featured;

}
