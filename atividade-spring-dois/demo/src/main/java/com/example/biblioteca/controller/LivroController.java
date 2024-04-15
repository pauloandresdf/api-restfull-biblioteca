package com.example.biblioteca.controller;

import com.example.biblioteca.entity.Livro;
import com.example.biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biblioteca")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping("/livro")
    public Livro create(@RequestBody Livro livro) {
        return livroService.create(livro);
    }

    @GetMapping("/livros")
    public List<Livro> findAll() {
        return livroService.findAll();
    }

    @GetMapping("/livro/{id}")
    public Livro findById(@PathVariable Long id) {
        return livroService.findById(id);
    }

    @PutMapping("/livro/{id}")
    public Livro update(@PathVariable Long id, @RequestBody Livro livro) {
        livro.setId(id);
        return livroService.update(livro);
    }

    @DeleteMapping("/livro/{id}")
    public void delete(@PathVariable Long id) {
        livroService.delete(id);
    }
}