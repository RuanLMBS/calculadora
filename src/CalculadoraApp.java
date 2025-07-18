import java.util.Locale;
import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Double valor1;
        Double valor2;
        boolean continuar;
        do{
            String operacao;
            System.out.println("Digite o primeiro valor:");
            valor1 = scan.nextDouble();
            scan.nextLine();
            System.out.println("Digite a operação:");
            operacao = scan.nextLine();
            System.out.println("Digite o segundo valor:");
            valor2 = scan.nextDouble();
            scan.nextLine();

            Double resultado = Calcular(valor1,valor2,operacao);
            System.out.println("O resultado é: " + resultado);

            continuar = verificarNovo();
        } while (continuar);

    }

    public static Double Calcular(Double valor1, Double valor2, String operacao) {
        Double resultado = 0.0;
        switch (operacao){
            case "+":
                resultado = valor1+valor2;
                break;
            case "-":
                resultado = valor1-valor2;
                break;
            case "*":
                resultado = valor1*valor2;
                break;
            case "/":
                resultado = valor1/valor2;
                break;
            default:
                System.out.println("Operação inválida!");
        }
        return resultado;
    }

    public static boolean verificarNovo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Deseja realizar novas operações? (S / N): ");
        return !scan.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }
}
