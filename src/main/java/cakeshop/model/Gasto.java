package cakeshop.model;

import cakeshop.enums.CategoriaGasto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gasto {

    private Long id;
    private String descricao;
    private BigDecimal valor;
    private CategoriaGasto categoria;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;
    
}
