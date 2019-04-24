package com.matera.editorTexto;
import javax.swing.*;

import java.awt.List;
import java.io.*;

public class Arquivo {
	private String diretorio;
	private String leitor;
	private String texto = null;

	public Arquivo(String diretorio) {
		this.diretorio = diretorio;
	}

	public String getDiretorio() {
		return diretorio;
	}

	public void setDiretorio(String diretorio) {
		this.diretorio = diretorio;
	}

	public String lerArquivo() throws IOException {
		FileReader fileReader = new FileReader(this.diretorio);
		BufferedReader reader = new BufferedReader(fileReader);
		String conteudo = reader.readLine();
		String retorno = "";

		while (conteudo != null) {
			retorno = retorno + conteudo;
			JOptionPane.showMessageDialog(null, conteudo);
			conteudo = reader.readLine();

		}

		fileReader.close();
		
		this.texto = retorno;
		return retorno;
	}
	
	private void lerArquivoSomente() throws IOException {
		FileReader fileReader = new FileReader(this.diretorio);
		BufferedReader reader = new BufferedReader(fileReader);
		String conteudo = reader.readLine();
		String retorno = "";

		while (conteudo != null) {
			retorno = retorno + conteudo;
			conteudo = reader.readLine();
		}

		fileReader.close();
		this.texto = retorno;
		System.out.println(this.texto);
	}

	public void sobrescrever() throws IOException {
		try {
			FileReader fileReader = new FileReader(this.diretorio);
			BufferedReader reader = new BufferedReader(fileReader);
			String conteudo = reader.readLine();
			String retorno = "";

			while (conteudo != null) {
				retorno = retorno + conteudo;
				conteudo = reader.readLine();
			}

			fileReader.close();
			this.texto = retorno;
			
			leitor = JOptionPane.showInputDialog(null, "Digite um texto ");
			FileWriter fileWriter = new FileWriter(this.diretorio);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println(leitor);

			fileWriter.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Nao foi possivel sobrescrever o arquivo" + e.getMessage());
		}
	}
	


	public void anexar(){
		try {
			if(this.texto == null){
				this.lerArquivoSomente();
			}
			leitor = JOptionPane.showInputDialog(null, "Digite um texto ");
			FileWriter fileWriter = new FileWriter(this.diretorio);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			String teste = this.texto + leitor;
			printWriter.println(teste);

			fileWriter.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Não foi possivel editar o arquivo" + e.getMessage());
		}
		
	}

}
