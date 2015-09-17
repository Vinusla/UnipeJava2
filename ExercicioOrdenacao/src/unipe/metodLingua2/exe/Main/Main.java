package unipe.metodLingua2.exe.Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import unipe.metodLingua2.exe.Model.Conta;
import unipe.metodLingua2.exe.Model.ContaCorrente;

public class Main {

	public static void main(String[] args) {

		List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			ContaCorrente conta = new ContaCorrente();

			System.out.println("Forneca o numero da conta: ");
			conta.setNumero(entrada.next());

			System.out.println("Forneca o nome: ");
			conta.setNome(entrada.next());

			System.out.println("Forneca o saldo: ");
			conta.setSaldo(entrada.nextDouble());

			contas.add(conta);

		}
		System.out.println("\n\n");

		System.out.println("Sem Ordenação");

		for (Conta c : contas) {
			System.out.println(c);

		}

		System.out.println("\n\n\nCom Ordenação\n\nMaior saldo");

		Collections.sort(contas);

		for (Conta c : contas) {
			System.out.println(c);

		}

		System.out.println("\n\nMenor Saldo");

		Collections.reverse(contas);

		for (Conta c : contas) {
			System.out.println(c);

		}

	}

}
