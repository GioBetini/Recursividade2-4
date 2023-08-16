package view;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		int num = 0;
		while (num % 2 == 0) {
			num = Integer
					.parseInt(JOptionPane.showInputDialog("Digite um número ímpar para descobrir seu fatorial duplo."));
		}
		controller.FatImpar fi = new controller.FatImpar();
		int impar = fi.fatorialImpar(num);
		System.out.println("O fatorial duplo de " + num + " é: " + impar);
	}

}
