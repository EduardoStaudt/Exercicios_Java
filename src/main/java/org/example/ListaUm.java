package org.example;
import java.util.Scanner;

public class ListaUm {

    public static void exercicioUm() {
        // Peça ao usuário para digitar sua idade. Diga se ele é maior ou menor de idade.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();
        if (age < 18){
            System.out.println("Voce é menor de idade!");
        }else{
            System.out.println("Voce é maior de idade!");
        }
        scanner.close();
    }

    public static void exercicioDois() {
        // Peça ao usuário para digitar sua idade. Diga se ele é maior ou menor de idade.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num1 = scanner.nextInt();
        System.out.println("Digite um numero:");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.printf("%d eh maior que %d.", num1, num2);
        }else{
            System.out.printf("%d eh maior que %d.", num2, num1);
        }

        scanner.close();
    }

    public static void exercicioTres() {
//        Peça a nota final de um aluno (0 a 10) e classifique como:
//        - Aprovado (≥ 7),
//        - Recuperação (≥ 5 e < 7),
//        - Reprovado (< 5)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota final de 0 a 10");
        float finalNote = scanner.nextFloat();

        if (finalNote >= 7.0){
            System.out.println("Aprovado!");
        }else if (finalNote >= 5 && finalNote <= 7) {
            System.out.println("Recuperação!");
        }else{
            System.out.println("Reprovado!");
        }
        scanner.close();

    }

    public static void exercicioQuatro() {
        // Peça um número inteiro e diga se ele é par ou ímpar.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Par!");
        }else{
            System.out.println("Impar!");
        }
        scanner.close();
    }

    public static void exercicioCinco() {
//    Peça o nome de um usuário e compare se ele digitou
//    "admin".Se sim, diga "Acesso autorizado", senão, "Acesso negado".
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String name = scanner.nextLine();

        String correctly = "admin";
        if (name.equalsIgnoreCase(correctly)){
            System.out.println("Acesso autorizado!");
        }else {
            System.out.println("Acesso negado!");
        }
        scanner.close();
    }

    public static void exercicioSeis() {
        //Imprima os números de 1 a 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void exercicioSete() {
        //Some os números digitados pelo usuário até que ele digite 0.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int soma = 0;
        int number;

        do{
            System.out.println("Digite um numero");
            number = scanner.nextInt();
            soma += number;
        }while (number != 0);

        System.out.println(soma);

        scanner.close();

    }

    public static void exercicioOito() {
        //Peça um número e imprima sua tabuada de 1 a 10.
        for (int i = 1; i<= 10; i++){
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j<= 10; j++){
                System.out.printf("%d X %d = %d.\n", i, j, i * j);
            }
            System.out.println("\n");
        }
    }

    public static void exercicioNove() {
        //Peça um número e calcule o fatorial dele.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para calcular o fatorial:");
        int number = scanner.nextInt();
        int fatorial =1;

        for (int i = number; i > 0; i--){
            fatorial *= i;
            if (i != 1){
                System.out.printf("%d X ", i );
            }else {
                System.out.printf("1 = %d.\n", fatorial);
            }
        }
        scanner.close();
    }

    public static void exercicioDez() {
        //Crie um loop que continue pedindo nomes até que o usuário digite "sair".
        Scanner scanner = new Scanner(System.in);
        String name;

        do {
            System.out.println("Digite um nome");
            name = scanner.nextLine();
        }while (!name.equalsIgnoreCase(name));
    }

    public static void exercicioOnze() {
        //Crie um array de 5 números inteiros e imprima o dobro de cada número.
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i< 5; i++){
            System.out.println("Digite um numero");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++){
            System.out.printf("%d X 2 = %d.\n", numbers[i], numbers[i] * 2);
        }
        scanner.close();
    }

    public static void exercicioDoze() {
        // Peça 3 nomes e armazene em um array. Depois, imprima todos os nomes.
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];

        for (int i = 0; i< 3; i++){
            System.out.println("Digite seu nome");
            names[i] = scanner.nextLine();
        }

        for (int i = 0; i < 3; i++){
            System.out.println(names[i]);
        }

        scanner.close();
    }

    public static void exercicioTreze() {
        //Preencha um array com 4 números e calcule a soma total.
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        int soma = 0;

        for (int i = 0; i < 4; i++){
            numbers[i] = scanner.nextInt();
            soma += numbers[i];
        }

        System.out.println("A soma dos numeros coletados eh " + soma + ".");

        scanner.close();

    }

    public static void exercicioQuatorze() {
        //Peça ao usuário para preencher uma matriz 3x3 e imprima ela no formato de tabela.
        Scanner scanner = new Scanner(System.in);
        int[][] mat = new int[3][3];

        for (int i = 0; i< 3; i++){
            for (int j = 0; j< 3; j++){
                mat[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i< 3; i++){
            for (int j = 0; j< 3; j++){
                System.out.printf("%d ", mat[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }

    public static void exercicioQuinze() {
        // Peça 4 números, armazene em uma matriz 2x2 e diga qual é o maior valor.
        Scanner scanner = new Scanner(System.in);
        int[][] mat = new int[2][2];
        int maior = Integer.MIN_VALUE; // Inicializa com o menor valor possível
        //o ueu pego o primeiro vaolor fora do loop -
                                                   //
        for (int i = 0; i < 2 ; i++){              //
            for (int j = 0; j < 2; j++){           //
                //if (i == 0 && j == 0) continue;  se fisese como ja tendo lido o mat[0][0]
                mat[i][j] = scanner.nextInt();
                if (mat[i][j] > maior){
                    maior = mat[i][j];
                }
            }
        }

        System.out.println(maior);

        scanner.close();

    }

    public static void main(String[] args) {
        exercicioQuinze();
    }
}
