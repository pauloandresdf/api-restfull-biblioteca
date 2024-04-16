package com.example.biblioteca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.time.LocalDateTime;

@Entity
@Table(name = "livro")
public class Livro {
   
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(length = 100)
    private String titulo;


    @Column( length = 150, name = "autor_principal")
    private String autorPrincipal;

    @Column(name = "ano_publicacao")
    private Integer anoPublicacao;

    @Column
    private Integer edicao;

    @Column( name = "data_criacao")
    private LocalDateTime dataCriacao;

    @Column (name = "data_alteracao")
    private LocalDateTime dataAlteracao;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

        // Getters and setters

        public String getTitulo() {

            return titulo;
    
        }
    
    
        public void setTitulo(String titulo) {
    
            this.titulo = titulo;
    
        }
    
    
        public String getAutorPrincipal() {
    
            return autorPrincipal;
    
        }
    
    
        public void setAutorPrincipal(String autorPrincipal) {
    
            this.autorPrincipal = autorPrincipal;
    
        }
    
    
        public Integer getAnoPublicacao() {
    
            return anoPublicacao;
    
        }
    
    
        public void setAnoPublicacao(Integer anoPublicacao) {
    
            this.anoPublicacao = anoPublicacao;
    
        }
    
    
        public Integer getEdicao() {
    
            return edicao;
    
        }
    
    
        public void setEdicao(Integer edicao) {
    
            this.edicao = edicao;
    
        }
    
    
        public LocalDateTime getDataCriacao() {
    
            return dataCriacao;
    
        }
    
    
        public void setDataCriacao(LocalDateTime dataCriacao) {
    
            this.dataCriacao = dataCriacao;
    
        }
    
    
        public LocalDateTime getDataAlteracao() {
    
            return dataAlteracao;
    
        }
    
    
        public void setDataAlteracao(LocalDateTime dataAlteracao) {
    
            this.dataAlteracao = dataAlteracao;
    
        }

}