package Model;

public class Aeroporto {
	
 private String nome;
 private String cidade;
 private String pais;

 public Aeroporto(String nome, String cidade, String pais) {
	 
     this.nome = nome;
     this.cidade = cidade;
     this.pais = pais;
 }

 public void aterrissar(Aeronave aeronave) {
	 
     System.out.println("Aeronave aterrissou no Aeroporto " + nome + " em " + cidade + ", " + pais);
 }
}
