package com.queiroz.Gerenciamento_Categorias.controllers;

import com.queiroz.Gerenciamento_Categorias.models.CategoriaModel;
import com.queiroz.Gerenciamento_Categorias.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<CategoriaModel> criar(CategoriaModel categoriaModel) {
        return ResponseEntity.status(201).body(categoriaService.criar(categoriaModel));
    }

    @GetMapping
    public ResponseEntity<List<CategoriaModel>> listar() {
        return ResponseEntity.ok().body(categoriaService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaModel> buscar(@PathVariable Long id) {
        Optional<CategoriaModel> livro = categoriaService.buscar(id);

        if (livro.isPresent())
            return ResponseEntity.ok().body(livro.get());
        else
            return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CategoriaModel> deletar(@PathVariable Long id) {
        categoriaService.excluir(id);

        return ResponseEntity.noContent().build();
    }
}
