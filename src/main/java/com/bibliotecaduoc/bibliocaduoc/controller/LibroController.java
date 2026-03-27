package com.bibliotecaduoc.bibliocaduoc.controller;

import com.bibliotecaduoc.bibliocaduoc.model.Libro;
import com.bibliotecaduoc.bibliocaduoc.service.LibroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")

public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> listaLibros(){
        return libroService.getLibros();
    }

    @PostMapping
    public Libro agregaLibro(@RequestBody Libro libro){
        return libroService.saveLibro(libro);
    }

    @GetMapping("id")
    public String eliminarLibro(@PathVariable int id){
        return libroService.deleteLibro(id);
    }
}
