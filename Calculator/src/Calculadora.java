import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    private final double a;
    private final double b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public List<Double> calcular(List<Operação> operacoes) {
        List<Double> resultados = new ArrayList<>();
        for (Operação operacao : operacoes) {
            double resultado = operacao.executar(this.a, this.b);
            resultados.add(resultado);
        }
        return resultados;
    }

    public static void main(String[] args){
        Calculadora calculadora = new Calculadora(20, 10);
        List<Operação> operacoes = new ArrayList<>();

        operacoes.add(new Soma());
        operacoes.add(new Subtracao());
        operacoes.add(new Multiplicacao());

        List<Double> resultados = calculadora.calcular(operacoes);

        for(Double resultado : resultados){
            System.out.println("Resultado: " + resultado);
        }
    }
}
