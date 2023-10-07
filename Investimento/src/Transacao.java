class Transacao implements Auditavel {
    private int id;
    private double valor;
    private TipoTransacao tipo;

    public Transacao(int id, double valor, TipoTransacao tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;

    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public boolean verificarFraude() {
        double limiteFraude = 10000.0;

        if (getValor() > limiteFraude) {
            return true;
        }

        return false;
    }
    
    @Override
    public void realizarAuditoria() {
        if (verificarFraude()) {
            System.out.println("Transação suspeita: ID " + getId() + ", Tipo: " + getTipo());
        }
    }


}