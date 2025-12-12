package cakeshop.dto;

import jakarta.validation.constraints.*;


public record VendaRequestDTO(
        @NotBlank(message = "Sabor é obrigatório")
        @Size(min = 3, max = 50, message = "Sabor deve ter entre 3 e 50 caracteres")
        String sabor,

        @NotNull(message = "Quantidade é obrigatória")
        @Min(value = 1, message = "Quantidade deve ser maior que zero")
        @Max(value = 100, message = "Quantidade máxima é 100")
        Integer quantidade
) {}
