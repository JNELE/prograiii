package com.goowia.apprest.Controller;

import com.goowia.apprest.Model.PersonaModel;
import com.goowia.apprest.Service.PersonaService;
import com.goowia.apprest.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1")
public class UserControllerRest {
    @Autowired
    private UserService userService;

    @Autowired
    private PersonaService personaService;

    private final String NAME_APP = "GooWia Solutions";

    @GetMapping("/nameApp")
    public String nameApp(){
        return NAME_APP;
    }

    @GetMapping("/saludo")
    public String saludo(@RequestParam(value = "name", defaultValue = "World")String name){
        return userService.getName(name);
    }

    @PostMapping("/persons")
    public ResponseEntity save(@RequestBody PersonaModel persona){
        try{
            return new ResponseEntity<>(personaService.save(persona), HttpStatus.CREATED);
           } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @DeleteMapping("/persons/{idPer}")
    public ResponseEntity<String> delete(@PathVariable("idPer") Integer idPer) {
        try {
            personaService.delete(idPer);
            return new ResponseEntity<>("person successfully deleted", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }




}
