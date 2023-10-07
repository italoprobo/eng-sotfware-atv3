import java.util.List;

enum TipoInvestimento {
    RENDA_FIXA, RENDA_VARIAVEL
}

enum TipoTransacao {
    CREDITO, DEBITO
}

class ContaCorrente implements Auditavel{
    private String numero;
    private double saldo;
    private List<Transacao> transacoes;

    public ContaCorrente(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    @Override
    public void realizarAuditoria(){
        if (saldo < 0) {
            System.out.println("Conta Corrente com saldo negativo: " + getNumero());
        }
    
        for (Transacao transacao : transacoes) {
            if (transacao.getValor() > 10000) {
                System.out.println("Transação suspeita na conta corrente " + getNumero() + ": valor alto");
            }
        }
    }
}
