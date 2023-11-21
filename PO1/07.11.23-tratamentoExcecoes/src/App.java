import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class App {

    public static final String senha = "galodoido123";
    public static void main(String[] args) throws Exception {
        try{
        String inputSenha = JOptionPane.showInputDialog("Insira a senha correta");
        validaSenha(senha);
        JOptionPane.showMessageDialog(null, "Senha correta \n\n Seja bem-vinde", senha, 0);
        } catch(InputMismatchException ex) {
            
        }
    }

    public boolean validaSenha(String s){

    }

}
/*
programa em java que leia uma senha
crie uma constante global que contenha a senha valida
crie uma função que ira verificar a senha.
se for invalida, lance uma excecao do tipo exception indicando uma mensagem explicativa
chame a função de validaSenha
*/