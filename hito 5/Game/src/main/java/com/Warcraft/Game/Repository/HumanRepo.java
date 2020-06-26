package com.Warcraft.Game.Repository;

import com.Warcraft.Game.Model.HumanoModel;
import com.Warcraft.Game.Model.MuertoVModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepo extends JpaRepository <HumanoModel,Integer> {
    @Query(value = "SELECT nombre FROM humanos WHERE nombre = nombre", nativeQuery = true)
    public HumanoModel getHumanosUnidades();

    @Query(value = "SELECT * FROM humanos WHERE nombre = :nombre", nativeQuery = true)
    public HumanoModel getHumanUnidadesComida(@Param("nombre") String nombre);
}
