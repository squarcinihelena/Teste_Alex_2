import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá :) Digite o primeiro numero: ");
        double n1 = scanner.nextDouble();

        System.out.println("Ok, digite o segundo numero: ");
        double n2 = scanner.nextDouble();

        System.out.println("Agora, digite qual será a operação a ser feita (+, -, /, *): ");
        String op = scanner.next();

         double resultado = 0;

        switch (op){
            case "+":
                resultado = n1 + n2;
                break;

            case"-":
                resultado = n1 - n2;
                break;

            case"/":
                resultado = n1 / n2;
                break;

            case"*":
                resultado = n1 * n2;
                break;

            default:
                System.out.println("Assim não tem como te ajudar amigo!");
        }

        System.out.println("O resultado é: " + resultado + " :D");

    }
}