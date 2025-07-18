package ui;

import core.Calculadora;
import utils.InputHelper;

public class ConsoleInterface {
    public static void Iniciar() {
        System.out.println("=== Calculadora ===");

        boolean continuar;
        do{
            double resultado = InputHelper.lerNumero("Digite o primeiro número: ");
            while(true) {
                String operador = InputHelper.lerOperador("Digite um operador (+, -, *, /) ou '=' para finalizar: ");
                if(operador.equals("=")) {
                    break;
                }
                double proximoValor = InputHelper.lerNumero("Digite o próximo número: ");
                resultado = Calculadora.calcular(resultado, proximoValor, operador);
                System.out.println("Resultado parcial: "+resultado);

            }

            System.out.println("Resultado Final: "+resultado);
            continuar = InputHelper.confirmar("Deseja realizar outra operação? (S/N): ");

        } while(continuar);

        System.out.println("Obrigado por utilizar a calculadora!");
    }
}
