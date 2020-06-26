package com.Warcraft.Game.Repository;

import com.Warcraft.Game.Model.ElfoModel;
import com.Warcraft.Game.Model.HumanoModel;
import com.Warcraft.Game.Model.MuertoVModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ElfoRepo extends JpaRepository <ElfoModel,Integer> {
    @Query(value = "SELECT nombre FROM elfo_de_la_noche WHERE nombre = nombre", nativeQuery = true)
    public ElfoModel getElfoUnidades();

    @Query(value = "SELECT * FROM elfo_de_la_noche WHERE nombre = :nombre", nativeQuery = true)
    public ElfoModel getElfoUnidadesComida(@Param("nombre") String nombre);
}
