package com.emergentes.dao;

import com.emergentes.modelo.Categorias;
import com.emergentes.modelo.Libros;
import java.util.List;

public interface CategoriasDAO {
    
    public void insert(Categorias Categorias) throws Exception;
    public void update(Categorias Categorias) throws Exception;
    public void delete(int id) throws Exception;
    public Categorias getById(int id) throws Exception;
    public List<Categorias> getALL() throws Exception;    

}
