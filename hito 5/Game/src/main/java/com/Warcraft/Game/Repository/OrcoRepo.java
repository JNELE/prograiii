package com.Warcraft.Game.Repository;

import com.Warcraft.Game.Model.OrcoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrcoRepo extends JpaRepository <OrcoModel,Integer> {
    @Query(value = "SELECT nombre FROM orcos WHERE nombre = nombre", nativeQuery = true)
    public  OrcoModel getOrcoUnidades();

    @Query(value = "SELECT * FROM orcos WHERE nombre = :nombre", nativeQuery = true)
    public OrcoModel getOrcoUnidadesComida(@Param("nombre") String nombre);

}