package org.example.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class MindicadorUF {

    private String version;
    private String autor;
    private String codigo;
    private String nombre;
    @JsonProperty(value = "unidad_medida")
    private String unidadMedida;
    private List<Serie> serie;
}
