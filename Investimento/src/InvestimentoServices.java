class InvestimentoServices {

    public String avaliarRisco(Investimento investimento) {
        String statusRisco;

        if (investimento.getTipo() == TipoInvestimento.RENDA_VARIAVEL) {
            statusRisco = "Alto Risco";
        } else {
            statusRisco = "Baixo Risco";
        }

        return statusRisco;
    }
}
