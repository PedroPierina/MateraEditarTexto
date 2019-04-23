

import javax.swing.*;

import java.awt.List;
import java.io.*;

public class Arquivo {
    private String diretorio;
    private String leitor;

    public String getDiretorio() {
        return diretorio;
    }

    public void setDiretorio(String diretorio) {
        this.diretorio = diretorio;
    }

    public String lerEnderecoEArquivoTxt() throws IOException {
    	
    		String retorno = null;
            this.diretorio= "C:/Users/user/Documents/main.txt";
            FileReader arquivoASerLido = new FileReader(this.diretorio);
            BufferedReader lerOArquivo = new BufferedReader(arquivoASerLido);

            String conteudo = lerOArquivo.readLine();
            retorno = conteudo;
            while (conteudo != null) {
      
                JOptionPane.showMessageDialog(null, conteudo);
                System.out.println(conteudo);
                conteudo =  lerOArquivo.readLine();
                if(conteudo != null){
                	retorno = retorno + conteudo;                	
                }
                                
            }
            System.out.println(conteudo);
            arquivoASerLido.close();
       
       
		
        return retorno;

    }
    public void editarConteudoArquivo() throws IOException {
        try {
        	String info = "C:/Usuários/user/Documentos/main.txt";
        	leitor = JOptionPane.showInputDialog(null, "Digite um texto ");
            FileWriter Arquivotxt = new FileWriter(info);
            PrintWriter txt = new PrintWriter(Arquivotxt);
            txt.println(leitor);


            Arquivotxt.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "NÃ£o foi possivel editar o arquivo" + e.getMessage());
        }
    }
}


