import java.util.Scanner;

/*
 @Author Pedro Henrique
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            CashRegister.viewMenu(); // Chama a função para exibir o menu
            option = scanner.nextInt(); // Lê a opção digitada pelo usuário

            switch (option) {
                case 1:
                    CashRegister.checkBalance(); // Chama a função para consultar o saldo
                    break;
                case 2:
                    CashRegister.withdraw(scanner); // Chama a função para realizar um saque
                    break;
                case 3:
                    CashRegister.makeDeposit(scanner); // Chama a função para realizar um depósito
                    break;
                case 4:
                    System.out.println("Encerrando o programa..."); // Encerra o programa
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (option != 4);

        scanner.close();
    }


}