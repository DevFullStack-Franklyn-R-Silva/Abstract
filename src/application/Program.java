package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {

		// Account x = new Account(1020, "Alex", 1000.0); // Não pode ser instanciada pq
		// é uma classe abstract
		// Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		// Account z = new BusinessAccount(1024, "Bob", 100.0, 500.0);

		/**
		 * Demo: suponha que você queira: • Totalizar o saldo de todas as contas. •
		 * Depositar 10.00 em todas as contas.
		 */
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();

		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);

		for (Account acc : list) {
			acc.deposit(10.0);
		}
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}
