package com.emergentes.dao;

import com.emergentes.modelo.Libros;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LibrosDAOimpl extends ConexionDB implements LibrosDAO {

    @Override
    public void insert(Libros libro) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("INSERT INTO libros (Titulo,Autor,Disponible,Categoria) values (?,?,?,?)");
            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setString(3, libro.getDisponible());
            ps.setString(4, libro.getCategoria());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(Libros libro) throws Exception {
        try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("UPDATE libros SET Titulo=?, Autor=?, Disponible=?, Categoria=?, where id=?");
            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setString(3, libro.getDisponible());
            ps.setString(4, libro.getCategoria());
            ps.setInt(5, libro.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void delete(int id) throws Exception {
    try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("DELETE FROM libros WHERE id=?");
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Libros getById(int id) throws Exception {
        Libros lib = new Libros();
            try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM libros WHERE id=?");
            ps.setInt(1,id);
            
            ResultSet rs= ps.executeQuery();
            
            if (rs.next()) {
                lib.setId(rs.getInt("id"));
                lib.setTitulo(rs.getString("Titulo"));
                lib.setAutor(rs.getString("Autor"));
                lib.setDisponible(rs.getString("Disponible"));
                lib.setCategoria(rs.getString("Categoria"));
            }
            
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
            return lib;
    }

    @Override
    public List<Libros> getALL() throws Exception {
        List<Libros> lista = null;
            try {
            this.conectar();
            PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM libros ");
                     
            ResultSet rs= ps.executeQuery();
            
            lista = new ArrayList<Libros>();
                    
            while (rs.next()) {
                Libros lib = new Libros();
                lib.setId(rs.getInt("id"));
                lib.setTitulo(rs.getString("Titulo"));
                lib.setAutor(rs.getString("Autor"));
                lib.setDisponible(rs.getString("Disponible"));
                lib.setCategoria(rs.getString("Categoria"));
                
                lista.add(lib);
            }
            rs.close();
            ps.close();
            
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
           return lista;    
    }

}
