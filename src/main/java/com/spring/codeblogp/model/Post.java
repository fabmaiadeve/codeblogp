package com.spring.codeblogp.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "tb_post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String tituloDoPost;

    @NotBlank
    private String autorDoPost;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dataDeCriacaoDoPost;

    @NotBlank
    @Lob
    private String textoDoPost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTituloDoPost() {
        return tituloDoPost;
    }

    public void setTituloDoPost(String tituloDoPost) {
        this.tituloDoPost = tituloDoPost;
    }

    public String getAutorDoPost() {
        return autorDoPost;
    }

    public void setAutorDoPost(String autorDoPost) {
        this.autorDoPost = autorDoPost;
    }

    public LocalDate getDataDeCriacaoDoPost() {
        return dataDeCriacaoDoPost;
    }

    public void setDataDeCriacaoDoPost(LocalDate dataDeCriacaoDoPost) {
        this.dataDeCriacaoDoPost = dataDeCriacaoDoPost;
    }

    public String getTextoDoPost() {
        return textoDoPost;
    }

    public void setTextoDoPost(String textoDoPost) {
        this.textoDoPost = textoDoPost;
    }
}
