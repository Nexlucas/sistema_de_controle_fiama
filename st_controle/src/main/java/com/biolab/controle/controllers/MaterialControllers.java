package com.biolab.controle.controllers;

import com.biolab.controle.entities.Material;
import com.biolab.controle.repositories.MaterialRepository;
import org.springframework.data.domain.Sort;
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
    public String addMaterial(@RequestBody Material material){
        Material m = new Material(material.getNome(),material.getPeso(),material.getUnidade_medida(),material.getValor_unitario(),material.getQuantidade(),material.getCategoria());
        materialrepository.save(m);
        return "Salvo";
    }

    @GetMapping(value = "tete")
    public List<Material> verMateriais1(){
        List<Material> listaMaterial = materialrepository.findAll();
        return listaMaterial;
    }

    @GetMapping
    public List<Material> verMateriais(){
        return materialrepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    @GetMapping("/categoria/{categoria}")
    public List<Material> verPorCategoria(@PathVariable String categoria){
        return materialrepository.findBycategoria(categoria);
    }

}
