package com.queiroz.Gerenciamento_Categorias.controllers;

import com.queiroz.Gerenciamento_Categorias.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;
}
