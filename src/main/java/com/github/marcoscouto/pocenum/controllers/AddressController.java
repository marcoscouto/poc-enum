package com.github.marcoscouto.pocenum.controllers;

import com.github.marcoscouto.pocenum.clients.AddressClient;
import com.github.marcoscouto.pocenum.dtos.AddressDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/address")
public class AddressController {

    private AddressClient addressClient;

    private Logger log = LoggerFactory.getLogger(AddressController.class);

    public AddressController(AddressClient addressClient) {
        this.addressClient = addressClient;
    }

    @GetMapping("/{cep}")
    public ResponseEntity findAddress(@PathVariable String cep){
        AddressDTO dto = addressClient.findAddress(cep);
        log.info("UF enum value: {}", dto.getUf());
        log.info("UF initials enum: {}", dto.getUf().getUfInitials());
        return ResponseEntity.ok(dto);
    }
}
