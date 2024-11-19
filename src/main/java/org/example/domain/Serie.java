package org.example.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Serie {

    private LocalDateTime fecha;
    private Float valor;
}
