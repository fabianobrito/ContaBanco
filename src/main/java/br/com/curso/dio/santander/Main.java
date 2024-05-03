package br.com.curso.dio.santander;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();

        var scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        conta.setAgencia(scanner.next());

        System.out.println("Por favor, digite o número da Conta:");
        conta.setNumero(scanner.nextInt());

        System.out.println("Por favor, digite o Primeiro Nome do cliente:");
        String noma = scanner.next();

        System.out.println("Por favor, digite o Sobrenome do cliente:");
        String sobrenome = scanner.next();

        conta.setNomeCliente(noma + " " + sobrenome);

        System.out.println("Por favor, digite o Saldo da conta:");
        conta.setSaldo(scanner.nextBigDecimal());

        System.out.println(conta.toString());
    }
}