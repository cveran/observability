package com.vera.nag.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




    @FeignClient(value = "pythonService", url = "http://127.0.0.1:8000") // Cambia al puerto donde esté corriendo tu app Python
public interface PythonServiceClient {
    
      
    @GetMapping("/{name}/")
    String oneMillionEuros(@PathVariable("name") String name);
}


