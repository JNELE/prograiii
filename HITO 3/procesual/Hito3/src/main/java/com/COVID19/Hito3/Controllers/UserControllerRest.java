package com.COVID19.Hito3.Controllers;

import com.COVID19.Hito3.Models.ModelCoronaVirusPaciente;
import com.COVID19.Hito3.Services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class UserControllerRest {

    @Autowired
    private PacienteService pacienteService;


    @GetMapping("/coronaVirusPaciente")
    public ResponseEntity<List<ModelCoronaVirusPaciente>> getAllpaciente() {
        try {
            List<ModelCoronaVirusPaciente> paciente = pacienteService.getAllpaciente();

            if (paciente.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(paciente, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/coronaVirusPaciente/getOne/{id_corona_virus}")
    public ResponseEntity<ModelCoronaVirusPaciente> getcasosById_corona_virus(@PathVariable("id_corona_virus") Integer id_corona_virus) {
        try {
            ModelCoronaVirusPaciente cModel = pacienteService.getcasosById_corona_virus(id_corona_virus);

            if (cModel != null) {
                return new ResponseEntity<>(cModel, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/coronaVirusPaciente")
    public ResponseEntity save(@RequestBody ModelCoronaVirusPaciente paciente){
        try{
            return new ResponseEntity<>(pacienteService.save(paciente), HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PostMapping("/coronaVirusPaciente2")
    public ResponseEntity save2(@RequestBody ModelCoronaVirusPaciente paciente2){
        try{
            return new ResponseEntity<>(pacienteService.save2(paciente2), HttpStatus.EXPECTATION_FAILED);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }



   @DeleteMapping("/coronaVirusPaciente/deleteCV")
    public ResponseEntity<String> delete() {
        try {
            pacienteService.delete();
            return new ResponseEntity<>("Departamento successfully deleted", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }


   @PutMapping("/coronaVirusPaciente/{id_corona_virus}")
    public ResponseEntity<ModelCoronaVirusPaciente> updatePaciente(@PathVariable("id_corona_virus") Integer id_corona_virus, @RequestBody ModelCoronaVirusPaciente cModel) {
        try {
            ModelCoronaVirusPaciente cUpdate = pacienteService.update(cModel, id_corona_virus);
            if (cUpdate != null) {
                return new ResponseEntity<>(cUpdate, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

