package Estruturas_de_repeticao;

/*
Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário.
Exemplo: 5!= 120 (5 x 4 x 3 x 2 x 1)
 */

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial +"! = "); // sem o ln no print para ficar tudo na mesma linha.
        for (int i = fatorial; i >= 1 ; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);

    }
}
