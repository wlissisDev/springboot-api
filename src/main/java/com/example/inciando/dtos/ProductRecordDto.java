package com.example.inciando.dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

// dto = tada transfer object
//record sao imutaveis, só possuem metodos Gets

public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {

}
