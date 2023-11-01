package com.emergentes.modelo;

public class Categorias {
    private int id;
    private int libros_id;
    private String Categoria;

    public Categorias() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLibros_id() {
        return libros_id;
    }

    public void setLibros_id(int libros_id) {
        this.libros_id = libros_id;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    @Override
    public String toString() {
        return "Categorias{" + "id=" + id + ", libros_id=" + libros_id + ", Categoria=" + Categoria + '}';
    }
        
    
}
 