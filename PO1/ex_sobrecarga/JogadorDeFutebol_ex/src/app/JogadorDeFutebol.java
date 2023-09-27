/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class JogadorDeFutebol {
    private String nome;
    public int nascimento;
    public double altura;
    public double peso;
    public String nacionalidade;
    public String posicao;

    public JogadorDeFutebol(String nome, int nascimento, double altura, double peso, String nacionalidade,
            String posicao) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.altura = altura;
        this.peso = peso;
        this.nacionalidade = nacionalidade;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int calculaIdade() {
        int idade = 2023 - nascimento;
        return idade;
    }

    public String exibeJogador() {
        return "Nome: " + getNome() + "\nIdade: " + calculaIdade() + "\nAltura: " + altura + "\nPeso: " + peso
                + "\nNacionalidade: " + nacionalidade + "\nPosicao: " + posicao;
    }

    /**
     * @return the nome
     */

}
