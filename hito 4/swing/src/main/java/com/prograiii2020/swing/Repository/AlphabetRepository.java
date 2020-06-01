package com.prograiii2020.swing.Repository;

import com.prograiii2020.swing.Model.AlphabetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AlphabetRepository extends JpaRepository<AlphabetModel, Integer> {
    @Query(value = "SELECT * FROM alphabet ORDER BY id LIMIT 1;", nativeQuery = true)
    public AlphabetModel getLetter();
}
