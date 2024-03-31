package com.example.paulo;

public class Livro {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String titulo;

    private String autorPrincipal;

    private int anoPublicacao;

    private int edicao;

    private LocalDateTime dataCriacao;

    private LocalDateTime dataAlteracao;

    // getters and setters

}