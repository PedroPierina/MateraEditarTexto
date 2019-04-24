package com.matera.editorTexto;

import javax.swing.*;

import java.io.*;

/***
 *
 * Criar um editor de texto. Ou seja, ler o que o usuario digita e salvar em um
 * file texto. Usar OO ao fazer esse programinha,
 *
 */

public class Main {
	public static void main(String[] args) throws IOException {
		int menu = 0;
		Arquivo file = new Arquivo("C:/Users/user/Documents/main.txt");

		while (menu == 0) {
			int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu \n 1-Leitura do TXT \n 2-Sobrescrita do TXT \n 3-Anexar \n 4-Exit"));
			switch (escolha) {
			case 1:
				file.lerArquivo();
				break;

			case 2:
				file.sobrescrever();
				break;
				
			case 3:
				file.anexar();
				break;
			
			case 4:
				menu = 1;
				break; 
				
			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida" + ", digite outra");
			}
			
		}
	}
}