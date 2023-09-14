package Model;


public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int idade, char sexo) {
        this.setNome(nome);
        this.idade = idade;
        this.sexo = sexo;
    }

    public void trabalhar() {
        System.out.println(getNome() + " está trabalhando.");
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("-------------------------------------------------------------------------------------------------");
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
    
    public char getSexo() {
        return sexo;
    }
}
