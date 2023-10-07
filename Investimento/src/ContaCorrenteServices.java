import java.util.ArrayList;
import java.util.List;

class ContaCorrenteServices {
    public List<Transacao> filtrarTransacoesInvalidas(ContaCorrente conta) {
        List<Transacao> transacoesInvalidas = new ArrayList<>();

        for (Transacao transacao : conta.getTransacoes()) {
            if (transacao.getValor() < 0) {
                transacoesInvalidas.add(transacao);
            }
        }

        return transacoesInvalidas;
    }
}