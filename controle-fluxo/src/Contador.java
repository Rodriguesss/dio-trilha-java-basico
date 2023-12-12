import Exceptions.ParametrosInvalidosExcetion;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        contar(numero1, numero2);
    }3
    static void contar(int numero1, int numero2) {
        try {
            verificaPrimeiroNumeroCasoMaior(numero1, numero2);

            final int totalOcorrencias = numero2 - numero1;

            for(int indice = 1; indice <= totalOcorrencias; indice++) {
                System.out.println("Imprimindo o número " + indice);
            }
        } catch(ParametrosInvalidosExcetion e) {
            System.out.println(e);
        }
    }

    static void verificaPrimeiroNumeroCasoMaior(int numero1, int numero2) throws ParametrosInvalidosExcetion {
        if(numero1 > numero2) {
            throw new ParametrosInvalidosExcetion("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}