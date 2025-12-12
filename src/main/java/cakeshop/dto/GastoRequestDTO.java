package cakeshop.dto;

import cakeshop.enums.CategoriaGasto;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record GastoRequestDTO(
        @NotBlank(message = "Descrição é obrigatória")
        @Size(min = 5, max = 200, message = "Descrição deve ter entre 5 e 200 caracteres")
        String descricao,

        @NotNull(message = "Valor é obrigatório")
        @DecimalMin(value = "0.01", message = "Valor deve ser maior que zero")
        @DecimalMax(value = "999999.99", message = "Valor máximo excedido")
        BigDecimal valor,

        @NotNull(message = "Categoria é obrigatória")
        CategoriaGasto categoria
) {}
