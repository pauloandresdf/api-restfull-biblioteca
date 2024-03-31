package com.example.paulo;

@RestController

@RequestMapping("/biblioteca/livro")

public class LivroController {

    @Autowired

    private LivroService livroService;


    @PostMapping

    public ResponseEntity<Livro> cadastrarLivro(@RequestBody Livro livro) {

        return ResponseEntity.status(HttpStatus.CREATED).body(livroService.cadastrarLivro(livro));

    }


    @GetMapping

    public ResponseEntity<List<Livro>> listarLivros() {

        return ResponseEntity.ok(livroService.listarLivros());

    }


    @GetMapping("/{id}")

    public ResponseEntity<Livro> buscarPorId(@PathVariable Long id) {

        return ResponseEntity.ok(livroService.buscarPorId(id));

    }


    @PutMapping("/{id}")

    public ResponseEntity<Livro> atualizarLivro(@PathVariable Long id, @RequestBody Livro livro) {

        return ResponseEntity.ok(livroService.atualizarLivro(id, livro));

    }

@DeleteMapping("/{id}")

    public ResponseEntity<Void> excluirLivro(@PathVariable Long id) {

        livroService.excluirLivro(id);

        return ResponseEntity.noContent().build();

    }


    @GetMapping("/titulo")

    public ResponseEntity<List<Livro>> buscarPorTitulo(@RequestParam String titulo) {

        return ResponseEntity.ok(livroService.buscarPorTitulo(titulo));

    }

}