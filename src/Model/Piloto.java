package Model;

// Classe Piloto (herda de Pessoa)
public class Piloto extends Pessoa {
    private String licenca;
    private int horasDeVoo;
    private int experiencia;

    public Piloto(String nome, int idade, char sexo, String licenca, int horasDeVoo, int experiencia) {
        super(nome, idade, sexo);
        this.licenca = licenca;
        this.horasDeVoo = horasDeVoo;
        this.experiencia = experiencia;
    }

    public void pilotar() {
        System.out.println(getNome() + " é um piloto com licença: " + licenca);
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Horas de voo: " + horasDeVoo);
        System.out.println("Experiência em anos: " + experiencia);
        System.out.println("-------------------------------------------------------------------------------------------------");
    }
}