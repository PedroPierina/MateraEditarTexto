import javax.swing.*;



import java.io.*;


/***
 *
 *                      Criar um editor de texto. Ou seja, ler
 *                      o que o usuário digita e salvar em um arquivo
 *                      texto. Usar OO ao fazer esse programinha,
 *
 */

public class Main {
    public static void main(String[] args) throws IOException {
        int cont =0;
        Arquivo arquivo = new Arquivo();
        while(cont==0){


        int op = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Selecione a opção desejada\n1-Abrir conteudo do TxT\n2-Alterar conteudo do TxT\n3-Sair da Aplicação"));
        if(op>=1 && op<=3){
            if (op == 1) {
//                            arquivo.lerEnderecoEArquivoTxt("C:/Usu�rios/user/Documentos/main.txt");
            }else{
                 if(op==2) {

//                     arquivo.editarConteudoArquivo("C:/Usu�rios/user/Documentos/main.txt");

                 }else {
                        if (op == 3) {
                         cont = 1;
                        }
                 }
        }
        }else{
            JOptionPane.showMessageDialog(null,"Não há essa opção, digite outra");
        }
      }
   }
}