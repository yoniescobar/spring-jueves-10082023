package com.company.intecap.apirestlibros.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class HelloController {

    //crear una clase libro
    public class Libro{
        private String titulo;
        private String autor;
        private String isbn;

        public Libro(String titulo, String autor, String isbn) {
            this.titulo = titulo;
            this.autor = autor;
            this.isbn = isbn;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public String getIsbn() {
            return isbn;
        }
    }


    @RequestMapping("index")
    public String hello(){
        return "Hola mundo<br>Soy Yoni Escobar<br>Bienvenido al curso de Spring Boot<br>Ingeniería de Software<br>Intecap";
    }

    @RequestMapping("libros")
    public List<Libro> libros(){

        //crear una lista de libros libros
        List<Libro> libros = new ArrayList<>();

        //crear 3 libros
        Libro l1 = new Libro("El señor de los anillos", "J.R.R. Tolkien", "978-84-450-7570-9");
        Libro l2 = new Libro("El hobbit", "J.R.R. Tolkien", "978-84-450-7570-9");
        Libro l3 = new Libro("El silmarillion", "J.R.R. Tolkien", "978-84-450-7570-9");

        //agregar los libros a la lista
        libros.add(l1);
        libros.add(l2);
        libros.add(l3);

        return libros;

    }


}
