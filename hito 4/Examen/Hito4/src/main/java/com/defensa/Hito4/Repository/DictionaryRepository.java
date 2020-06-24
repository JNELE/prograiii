package com.defensa.Hito4.Repository;

import com.defensa.Hito4.Model.DictionaryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DictionaryRepository extends JpaRepository<DictionaryModel, Integer> {
    @Query(value = "SELECT * FROM dictionary WHERE word = :wordSelected", nativeQuery = true)
    public DictionaryModel getWordTranslate(@Param("wordSelected") String wordSelected);

    }



