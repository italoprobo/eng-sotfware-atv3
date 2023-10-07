class TransacaoServices {
    public boolean verificarFraude(Transacao transacao) {

        boolean isFraudulenta = false;

        if (transacao.getValor() > 10000 && transacao.getTipo() == TipoTransacao.CREDITO) {
            isFraudulenta = true;
        }

        return isFraudulenta;
    }
}