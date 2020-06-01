package com.prograiii2020.swing.Repository;

import com.prograiii2020.swing.Model.ButtonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ButtonRepository extends JpaRepository<ButtonModel, Integer> {
    @Query(value = "SELECT * FROM button ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    public ButtonModel getTitleButtons();
}
