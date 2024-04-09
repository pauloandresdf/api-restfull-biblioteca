package com.example.biblioteca.service;

import com.example.biblioteca.entity.Livro;
import com.example.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository; // Instância injetada corretamente

    public Livro create(Livro livro) {
        return livroRepository.save(livro); // Use a instância, não a interface
    }

    public List<Livro> findAll() {
        return livroRepository.findAll(); // Use a instância
    }

    public Livro findById(Long id) {
        return livroRepository.findById(id).orElse(null); // Use a instância
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
