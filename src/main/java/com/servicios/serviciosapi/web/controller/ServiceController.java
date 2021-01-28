package com.servicios.serviciosapi.web.controller;

import com.servicios.serviciosapi.domain.TechnicalService;
import com.servicios.serviciosapi.domain.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @GetMapping("/all")
    public ResponseEntity<List<TechnicalService>> getAll(){
        return new ResponseEntity<>(serviceService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{productId}")
    public ResponseEntity<TechnicalService> getProduct(@PathVariable("productId") int productId){
        return serviceService.getProduct(productId)
                .map(product -> new ResponseEntity<>(product, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<TechnicalService> save(@RequestBody TechnicalService technicalService){
        return new ResponseEntity<>(serviceService.save(technicalService), HttpStatus.CREATED);
    }
}
