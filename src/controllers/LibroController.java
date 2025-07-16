package controllers;

import models.Book;
import java.util.*;

public class LibroController {

    public Map<Book, Book> procesarLibros(List<Book> libros) {
        Map<Book, Book> map = new TreeMap<>();
        for (Book libro : libros) {
            map.put(libro, libro);
        }
        return map;
    }
}

