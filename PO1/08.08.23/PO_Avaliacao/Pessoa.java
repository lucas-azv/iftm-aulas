public class Pessoa {
    private String nome;
    private char sexo;
    private int idade;

    public Pessoa(String nome, char sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String exibe() {
        return "Nome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade;
    }
}
