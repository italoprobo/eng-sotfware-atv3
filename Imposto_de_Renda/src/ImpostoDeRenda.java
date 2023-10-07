import java.util.List;

class ImpostoDeRenda {
    private String cpfContribuinte;
    private List<Double> rendimentos;
    private List<Double> despesas;

    public ImpostoDeRenda(String cpfContribuinte,
            List<Double> rendimentos,
            List<Double> despesas) {
        this.cpfContribuinte = cpfContribuinte;
        this.rendimentos = rendimentos;
        this.despesas = despesas;
    }

    public String getCpfContribuinte() {
        return cpfContribuinte;
    }

    public List<Double> getDespesas() {
        return despesas;
    }

    public List<Double> getRendimentos() {
        return rendimentos;
    }

    public void processar() {

        if (cpfContribuinte == null || cpfContribuinte.length() != 11) {
            System.out.println("CPF inválido.");
            return;
        }

        if (rendimentos.stream().anyMatch(valor -> valor < 0) || despesas.stream().anyMatch(valor -> valor < 0)) {
            System.out.println("Rendimentos e despesas não podem ser negativos.");
            return;
        }

        if (rendimentos.size() > 5) {
            System.out.println("Não podem existir mais que 5 rendimentos.");
            return;
        }

        CalcularImposto calculadorimpostual = new CalcularImposto();
        double impostoDevido = calculadorimpostual.calcularImposto(rendimentos, despesas);

        RelatorioImposto relator = new RelatorioImposto();
        relator.gerarRelatorio(this, impostoDevido);

    }
}
