package ex02;
public class FichaPessoal {
    private String nome;
    private int idade;
    private static int quantidade = 0;

    public FichaPessoal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(int quantidade) {
        FichaPessoal.quantidade = quantidade;
    }
}
