package org.example.application.services;

import org.example.application.ports.in.GetMindicadorUseCase;
import org.example.application.ports.out.GetMindicadorPort;
import org.example.domain.MindicadorUF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MindicadorUFService implements GetMindicadorUseCase {

    @Autowired
    GetMindicadorPort getMindicadorPort;


    @Override
    public MindicadorUF getMinidcador() {
        return getMindicadorPort.getMinidcador();
    }
}
