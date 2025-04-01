package com.dio;

import java.util.Scanner;

public class ContaTerminal {
  Scanner userInput = new Scanner(System.in);

  public int getAccountNumber() {
    System.out.println("Digite o número da conta:");
    int numero = userInput.nextInt();
    userInput.nextLine();
    return numero;
  }

  public String getAgency() {
    System.out.println("Digite o número da agência (XXX-X):");
    return userInput.nextLine();
  }

  public String getName() {
    System.out.println("Nome Completo:");
    return userInput.nextLine();
  }

  public float getBalance() {
    System.out.println("Digite seu saldo:");
    float saldo = userInput.nextFloat();
    userInput.nextLine();
    return saldo;
  }

  public static void main(String[] args) {
    ContaTerminal conta = new ContaTerminal();

    int accountNumber = conta.getAccountNumber();
    String agency = conta.getAgency();
    String name = conta.getName();
    float balance = conta.getBalance();

    System.out.println(
        "\nOlá "
            + name
            + ", obrigado por criar uma conta no nosso banco. "
            + "Sua agência é "
            + agency
            + ", conta "
            + accountNumber
            + " e seu saldo de R$ "
            + balance
            + " já está disponível para saque.");
  }
}
