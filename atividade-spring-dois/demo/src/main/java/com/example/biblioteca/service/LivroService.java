package com.example.biblioteca.service;

import com.example.biblioteca.entity.Livro;
import com.example.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository; 

    public Livro create(Livro livro) {
        return livroRepository.save(livro); 
    }

    public List<Livro> findAll() {
        return livroRepository.findAll(); 
    }

    public Livro findById(Long id) {
        return livroRepository.findById(id).orElse(null); 
    }

    public Livro update(Livro livro) {
        // Se o livro já existir, o método save() atualizará o livro existente.
        // Isso depende da lógica de negócios e de como o JPA está configurado.
        return livroRepository.save(livro); // Use a instância
    }

    public void delete(Long id) {
        livroRepository.deleteById(id); // Use a instância
    }
}
