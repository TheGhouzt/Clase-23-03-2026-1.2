package com.bibliotecaduoc.repository;
import com.bibliotecaduoc.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {
    private List<Libro> listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibros(){
        return listaLibros;
    }


public Libro buscarPorId(int id){
    for(Libro libro: listaLibros){
        if (libro.getId() == id){
            return libro;
        }
    }
    return null;
}

public Libro buscarPorIsbn(String isbn){
    for(Libro libro: listaLibros){
        if (libro.getIsbn().equals(isbn)){
            return libro;
        }
    }
    return null;
}
}