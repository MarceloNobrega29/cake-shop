package cakeshop.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record VendaResponseDTO(
        Long id,
        String sabor,
        Integer quantidade,
        BigDecimal valorTotal,
        LocalDateTime dataVenda
) {}
