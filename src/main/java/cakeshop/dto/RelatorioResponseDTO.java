package cakeshop.dto;

import cakeshop.enums.CategoriaGasto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public record RelatorioResponseDTO(

        Integer totalBolosVendidos,
        BigDecimal receitaTotalVendas,
        BigDecimal totalGastos,
        BigDecimal lucroLiquido,
        BigDecimal margemLucro,


        List<VendaResponseDTO> vendas,
        List<GastoResponseDTO> gastos,


        Map<String, Integer> vendasPorSabor,
        Map<CategoriaGasto, BigDecimal> gastosPorCategoria,


        LocalDate periodoInicio,
        LocalDate periodoFim
) {}

