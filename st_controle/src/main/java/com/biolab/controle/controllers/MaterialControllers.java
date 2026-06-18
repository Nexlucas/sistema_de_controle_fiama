package com.biolab.controle.controllers;

import com.biolab.controle.entities.Material;
import com.biolab.controle.repositories.MaterialRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping

public class MaterialControllers {
    private final MaterialRepository materialrepository;


    public MaterialControllers(MaterialRepository materialRepository) {
        this.materialrepository = materialRepository;
    }

    @PostMapping
    public Material addmaterial(@RequestBody Material material){
        Material m = new Material(material.getNome(),material.getPeso(),material.getUnidade_medida(),material.getValor_unitario(),material.getQuantidade(),material.getCategoria(),material.getData_entrada());
        materialrepository.save(m);
        return m;
    }

    @GetMapping(value = "/todosmateriais")
    public List<Material> todosMateriais(){
        return materialrepository.findAll();
    }

    @GetMapping("/valortotal")
    public List<String> mostrarValorTotal() {
        return materialrepository.listarValorTotal();
    }

    @GetMapping(value = "/categoria/{categoria}")
    public List<Material> verPorCategoria(@PathVariable String categoria){
        return materialrepository.findBycategoria(categoria);
    }
}
