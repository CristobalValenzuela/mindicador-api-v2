package org.example.adapters.http;

import org.example.application.ports.out.GetMindicadorPort;
import org.example.domain.MindicadorUF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
public class MindicadorApi implements GetMindicadorPort {

    @Value("${mindicator-url}")
    private String mindicatorUrl;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public MindicadorUF getMinidcador() {
        ResponseEntity<MindicadorUF> response = restTemplate.getForEntity(URI.create(mindicatorUrl), MindicadorUF.class);
        return response.getBody();
    }
}
