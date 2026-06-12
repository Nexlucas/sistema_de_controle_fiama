package com.biolab.controle.repositories;

import com.biolab.controle.controllers.MaterialControllers;
import com.biolab.controle.entities.Material;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MaterialRepository extends JpaRepository<Material, Long> {
    List<Material> findBycategoria(String categoria);
}
