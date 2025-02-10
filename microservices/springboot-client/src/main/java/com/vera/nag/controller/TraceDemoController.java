package com.vera.nag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vera.nag.repository.Client;
import com.vera.nag.repository.PythonServiceClient;

@RestController
@RequestMapping("/clientes")
public class TraceDemoController {
    
    @Autowired
    Client client;
    @Autowired
    PythonServiceClient pythonServiceClient;

    @GetMapping
    public String execDemo(){
        return "Obteniendo clientes: "+client.getClientes().toString()+pythonServiceClient.oneMillionEuros("TFM");
    }
    
}
