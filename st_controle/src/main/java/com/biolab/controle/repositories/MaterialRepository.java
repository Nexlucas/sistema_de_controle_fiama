package com.biolab.controle.repositories;

import com.biolab.controle.controllers.MaterialControllers;
import com.biolab.controle.entities.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MaterialRepository extends JpaRepository<Material, Long> {
    List<Material> findBycategoria(String categoria);

    @Query(value = "SELECT categoria,SUM(quantidade * valor_unitario) as valor_total FROM material GROUP BY categoria ORDER BY valor_total DESC", nativeQuery = true)
    List<String> listarValorTotal();

}
