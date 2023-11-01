package com.emergentes.modelo;

public class Libros {
    private int id;
    private String Titulo;
    private String Autor;
    private String Disponible;
    private String Categoria;

    public Libros() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getDisponible() {
        return Disponible;
    }

    public void setDisponible(String Disponible) {
        this.Disponible = Disponible;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    @Override
    public String toString() {
        return "Libros{" + "id=" + id + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Disponible=" + Disponible + ", Categoria=" + Categoria + '}';
    }
     
    
}
