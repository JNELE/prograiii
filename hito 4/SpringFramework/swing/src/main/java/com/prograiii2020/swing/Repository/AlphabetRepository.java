package com.prograiii2020.swing.Repository;

import com.prograiii2020.swing.Model.AlphabetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlphabetRepository extends JpaRepository<AlphabetModel, Integer> {
    @Query(value = "select * from alphabet where typer = 'first';", nativeQuery = true)
    public List<AlphabetModel> getFirstRow();

    @Query(value = "select * from alphabet where typer = 'second';", nativeQuery = true)
    public List<AlphabetModel> getSecondRow();

    @Query(value = "select * from alphabet where typer = 'three';", nativeQuery = true)
    public List<AlphabetModel> getThreeRow();
}
