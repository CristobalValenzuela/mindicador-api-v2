package org.example.adapters.web;

import org.example.application.ports.in.GetMindicadorUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/min/uf")
public class MindicatorUFController {

    @Autowired
    GetMindicadorUseCase getMindicadorUseCase;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getIndicatorUF(){
        return ResponseEntity.ok(getMindicadorUseCase.getMinidcador());
    }
}
