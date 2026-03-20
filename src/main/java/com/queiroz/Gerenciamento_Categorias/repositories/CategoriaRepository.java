package com.queiroz.Gerenciamento_Categorias.repositories;

import com.queiroz.Gerenciamento_Categorias.models.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
}
