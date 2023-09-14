package Model;

//Classe Passageiro (herda de Pessoa)
public class Passageiro extends Pessoa {
 private String numeroCartao;
 private String classe;
 private int bagagem;

 public Passageiro(String nome, int idade, char sexo, String numeroCartao, String classe, int bagagem) {
     super(nome, idade, sexo);
     this.numeroCartao = numeroCartao;
     this.classe = classe;
     this.bagagem = bagagem;
 }

 public void comprarBilhete() {
     System.out.println(getNome() + " comprou um bilhete com número de cartão: " + numeroCartao);
     System.out.println("Idade: " + getIdade());
     System.out.println("Sexo: " + getSexo());
     System.out.println("Classe: " + classe);
     System.out.println("Bagagem: " + bagagem + " peças");
     System.out.println("-------------------------------------------------------------------------------------------------");
 }
}