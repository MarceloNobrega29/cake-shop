package cakeshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Venda {

    private Long id;
    private String sabor;
    private Integer quantidade;
    private BigDecimal precoUnitario = new BigDecimal("10.00");
    private BigDecimal valorTotal;
    private LocalDateTime dataVenda;

    public void calcularValorTotal() {
        this.valorTotal = this.precoUnitario
                .multiply(new BigDecimal(this.quantidade));
    }

}
