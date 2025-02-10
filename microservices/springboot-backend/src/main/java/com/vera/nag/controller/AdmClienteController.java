package com.vera.nag.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.vera.nag.model.AdmCliente;
import com.vera.nag.repository.AdmClienteRepository;
import com.vera.nag.repository.PythonServiceClient;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/clientes")
public class AdmClienteController {
	
    private AdmClienteRepository admClienteRepository;

    Logger logger = LoggerFactory.getLogger(AdmClienteController.class);
    
    //@Autowired
    //PythonServiceClient pythonServiceClient;

    @Autowired
    public AdmClienteController(AdmClienteRepository admClienteRepository) {
        this.admClienteRepository = admClienteRepository;
    }

    @GetMapping
    public Iterable<AdmCliente> getAll(@RequestHeader Map<String, String> headers) {

        headers.forEach( (k,v) ->
            logger.info("Encabezado: " + k + " " + v));
        
        //logger.info("pythonServiceClient transacción OK");
        //logger.info(pythonServiceClient.oneMillionEuros("FIN"));

        return admClienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public AdmCliente getById(@PathVariable Long id) {
        return admClienteRepository.findById(id).get();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AdmCliente create(@RequestBody AdmCliente book) {
        return admClienteRepository.save(book);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public AdmCliente update(@PathVariable Long id, @RequestBody AdmCliente book) {
        return admClienteRepository.save(book);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        admClienteRepository.deleteById(id);
    }


}
