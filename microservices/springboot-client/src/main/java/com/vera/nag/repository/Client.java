package com.vera.nag.repository;


import org.springframework.web.bind.annotation.GetMapping;

import com.vera.nag.model.AdmCliente;

import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient(value="clientes", url="http://localhost:8082/api/v1/clientes")
public interface Client {
    
    @GetMapping
    List<AdmCliente> getClientes();
    
}

