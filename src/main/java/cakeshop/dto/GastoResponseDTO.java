package cakeshop.dto;

import cakeshop.enums.CategoriaGasto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record GastoResponseDTO(
        Long id,
        String descricao,
        BigDecimal valor,
        CategoriaGasto categoria,
        LocalDateTime dataCriacao,
        LocalDateTime dataModificacao
) {}
