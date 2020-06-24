package com.COVID19.Hito3.Repos;

import com.COVID19.Hito3.Models.ModelCoronaVirusPaciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepo  extends JpaRepository<ModelCoronaVirusPaciente, Integer> {

}