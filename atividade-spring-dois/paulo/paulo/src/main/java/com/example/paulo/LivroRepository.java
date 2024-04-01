package com.example.paulo;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    Livro findByTituloContainingIgnoreCase(String titulo);

}