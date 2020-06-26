package com.Warcraft.Game.Repository;

import com.Warcraft.Game.Model.MuertoVModel;
import com.Warcraft.Game.Model.OrcoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MuertoRepo extends JpaRepository <MuertoVModel,Integer> {
    @Query(value = "SELECT nombre FROM muertos_vivientes WHERE nombre = nombre", nativeQuery = true)
    public MuertoVModel getMuertoUnidades();

    @Query(value = "SELECT * FROM muertos_vivientes WHERE nombre = :nombre", nativeQuery = true)
    public MuertoVModel getMuertosUnidadesComida(@Param("nombre") String nombre);
}
