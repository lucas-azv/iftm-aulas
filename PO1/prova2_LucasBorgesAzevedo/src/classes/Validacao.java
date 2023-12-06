package classes;

import java.util.List;

public class Validacao {

    public static boolean validarUsuarioSenha(String usuario, String senha, List<String> validacao) {
        for (String s : validacao) {
            if (s.startsWith(usuario + ":") && s.endsWith(senha) && validaSenha(senha)) {
                return true;
            }
        }
        return false;
    }

    public static boolean validaSenha(String senha) {
        return senha.length() >= 6 && senha.matches(".*[$#@].*") && senha.matches(".*\\d.*");
    }
}
