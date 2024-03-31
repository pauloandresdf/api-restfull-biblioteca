package com.example.paulo;

@Service

public class LivroService {

    @Autowired

    private LivroRepository livroRepository;


    public Livro cadastrarLivro(Livro livro) {

        livro.setDataCriacao(LocalDateTime.now());

        return livroRepository.save(livro);

    }


    public List<Livro> listarLivros() {

        return livroRepository.findAll();

    }


    public Livro buscarPorId(Long id) {

        return livroRepository.findById(id)

                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Livro não encontrado"));

    }


    public Livro atualizarLivro(Long id, Livro livro) {

        Livro livroExistente = buscarPorId(id);

        livroExistente.setTitulo(livro.getTitulo());

        livroExistente.setAutorPrincipal(livro.getAutorPrincipal());

        livroExistente.setAnoPublicacao(livro.getAnoPublicacao());

        livroExistente.setEdicao(livro.getEdicao());

        livroExistente.setDataAlteracao(LocalDateTime.now());

        return livroRepository.save(livroExistente);

    }


    public void excluirLivro(Long id) {

        Livro livroExistente = buscarPorId(id);

        livroRepository.delete(livroExistente);

    }


    public List<Livro> buscarPorTitulo(String titulo) {

        return livroRepository.findByTituloContainingIgnoreCase(titulo);

    }

}