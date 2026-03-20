package com.queiroz.Gerenciamento_Categorias.services;

import com.queiroz.Gerenciamento_Categorias.models.CategoriaModel;
import com.queiroz.Gerenciamento_Categorias.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaModel criar(CategoriaModel categoriaModel) {
        return categoriaRepository.save(categoriaModel);
    }

    public List<CategoriaModel> listar() {
        return categoriaRepository.findAll();
    }

    public Optional<CategoriaModel> buscar(Long id) {
        return categoriaRepository.findById(id);
    }

    public void excluir(Long id) {
        categoriaRepository.deleteById(id);
    }

}
