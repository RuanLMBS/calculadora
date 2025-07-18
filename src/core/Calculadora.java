package core;

public class Calculadora {
    public static Double calcular(Double valor1, Double valor2, String operacao) {
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

}
