
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaBancaria {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double saldo = 0;
        int escolha;

        do {
            System.out.println("---------------------------");
            System.out.println("Conta Bancaria ");
            System.out.println("--------------------------");
            System.out.println("1. Mostrar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.println("---------------------------");

            System.out.print("Digite sua escolha (1-4): ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1 -> mostrarSaldo(saldo);
                case 2 -> saldo += depositar();
                case 3 -> saldo = sacar(saldo);
                case 4 -> System.out.println("Saindo...........");
                default -> System.out.println("Escolha inválida!");
            }
        }while (escolha != 4);

        sc.close();
    }
    static void mostrarSaldo(double saldo) {
        System.out.println("-----------------------------------------");
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
    }
    static double depositar() {
        double valor;
        System.out.print("Digite o valor para depositar: ");
        valor = sc.nextDouble();
        if (valor <= 0) {
            System.out.println("O valor não pode ser negativo!");
            return 0;
        } else {
            System.out.println("Depósito realizado!");
            return valor;
        }

    }
    static double sacar(double saldo) {
        double sacar;
        System.out.println("Digite o valor para sacar: ");
        sacar = sc.nextDouble();

        if (sacar > saldo) {
            System.out.println("Saldo insuficiente!");
            return 0;
        } else if (sacar <= 0) {
            System.out.println("Saldo não pode ser negativo!");
            return 0;
        }
        else {
            System.out.println("Saque realizado!");
            return saldo -  sacar;
        }
    }
}

