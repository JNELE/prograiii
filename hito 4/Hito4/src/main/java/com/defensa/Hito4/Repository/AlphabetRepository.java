package com.defensa.Hito4.Repository;

import com.defensa.Hito4.Model.AlphabetModel2;
import com.defensa.Hito4.Model.DictionaryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlphabetRepository extends JpaRepository<AlphabetModel2, Integer> {
    @Query(value = "select * from alphabet where typer = 'first';", nativeQuery = true)
    public List<AlphabetModel2> getFirstRow();

    @Query(value = "select * from alphabet where typer = 'second';", nativeQuery = true)
    public List<AlphabetModel2> getSecondRow();

    @Query(value = "select * from alphabet where typer = 'three';", nativeQuery = true)
    public List<AlphabetModel2> getThreeRow();
}