package utils;

import java.util.Locale;
import java.util.Scanner;

public class InputHelper {
    private static final Scanner sc = new Scanner(System.in);

    public static double lerNumero(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                return Double.parseDouble(sc.nextLine().replace(",","."));
            } catch (NumberFormatException e) {
                System.out.println("Erro: " + e);
            }
        }
    }

    public static String lerOperador (String msg) {
        while(true) {
            System.out.println(msg);
            String input = sc.nextLine().trim();
            if (input.matches("[+\\-*/=]")) {
                return input;
            } else {
                System.out.println("Operador inválido!");
            }

        }
    }

    public static boolean confirmar(String msg) {
        System.out.println(msg);
        String resposta = sc.nextLine().trim().toUpperCase(Locale.ROOT);
        return resposta.equals("S");
    }
}
