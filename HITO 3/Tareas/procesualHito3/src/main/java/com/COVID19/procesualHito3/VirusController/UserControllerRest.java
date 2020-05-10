package com.COVID19.procesualHito3.VirusController;

import com.COVID19.procesualHito3.VirusModel.CasosModel;
import com.COVID19.procesualHito3.VirusService.VirusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class UserControllerRest {

    @Autowired
    private VirusService virusService;


    @GetMapping("/coronaVirus")
    public ResponseEntity<List<CasosModel>> getAllcasos() {
        try {
            List<CasosModel> persons = virusService.getAllcasos();

            if (persons.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(persons, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/coronaVirus/getOne/{idcoronavirus}")
    public ResponseEntity<CasosModel> getcasosByIdcoronavirus(@PathVariable("idcoronavirus") Integer idcoronavirus) {
        try {
            CasosModel cModel = virusService.getcasosByIdcoronavirus(idcoronavirus);

            if (cModel != null) {
                return new ResponseEntity<>(cModel, HttpStatus.OK);
            } else {
                   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/coronaVirus")
    public ResponseEntity save(@RequestBody CasosModel virus){
        try{
            return new ResponseEntity<>(virusService.save(virus), HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }


    @DeleteMapping("/coronaVirus/deleteCV/{idCoronaVirus}")
    public ResponseEntity<String> delete(@PathVariable("idCoronaVirus") Integer idcoronavirus) {
        try {
            virusService.delete(idcoronavirus);
            return new ResponseEntity<>("Departamento successfully deleted", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }


    @PutMapping("/coronaVirus/{idCoronaVirus}")
    public ResponseEntity<CasosModel> updateCasos(@PathVariable("idCoronaVirus") Integer idcoronavirus, @RequestBody CasosModel cModel) {
        try {
            CasosModel cUpdate = virusService.update(cModel, idcoronavirus);
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
