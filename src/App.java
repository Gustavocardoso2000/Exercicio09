import java.util.Scanner;


public class App {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o valor: ");
        // Faça um Programa que peça a temperatura em graus Fahrenheit,
        // transforme e mostre a temperatura em graus Celsius. C = 5 ((F-32) / 9)
        double temperaturaF;
        double temperaturaC;
        // 1) Ação do usuario: temperatura Fahrenheit
        Scanner teclado = new Scanner(System.in);
        temperaturaF = teclado.nextDouble();   
        teclado.close();
        sc.close();
        // 2) Tarefa do programa: trasformar F em Celsius
        temperaturaC = 5 * ((temperaturaF-32)/9);

        // 3) Resposta do programa: mostrar a temperatura em graus Celsius
        System.out.print("A temperatura em Celsius é ");
        System.out.print(temperaturaC);

    }
}

