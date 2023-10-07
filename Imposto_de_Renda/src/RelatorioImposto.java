
class RelatorioImposto {

    public void gerarRelatorio(ImpostoDeRenda imposto, Double impostoDevido) {
        System.out.println("CPF: " + imposto.getCpfContribuinte());
        System.out.println("Rendimentos: " + imposto.getRendimentos());
        System.out.println("Despesas: " + imposto.getDespesas());
        System.out.println("Imposto Devido: " + impostoDevido);
    }

}