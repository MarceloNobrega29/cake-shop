package cakeshop.enums;

public enum CategoriaGasto {
    INGREDIENTES("Ingredientes"),
    EMBALAGENS("Embalagens"),
    ALUGUEL("Aluguel"),
    ENERGIA("Energia Elétrica"),
    AGUA("Água"),
    GAS("Gás"),
    FUNCIONARIOS("Funcionários"),
    MARKETING("Marketing e Publicidade"),
    EQUIPAMENTOS("Equipamentos e Manutenção"),
    IMPOSTOS("Impostos e Taxas"),
    OUTROS("Outros");

    private final String descricao;

    CategoriaGasto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
