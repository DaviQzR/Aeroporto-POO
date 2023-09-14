package Model;


public class Aeronave {
 private String modelo;
 private int capacidade;
 private String companhia;

 public Aeronave(String modelo, int capacidade, String companhia) {
     this.modelo = modelo;
     this.capacidade = capacidade;
     this.companhia = companhia;
 }

 public void voar() {
     System.out.println("Aeronave modelo " + modelo + " está voando.");
     System.out.println("Capacidade: " + capacidade + " passageiros");
     System.out.println("Companhia: " + companhia);
     System.out.println("-------------------------------------------------------------------------------------------------");
  }
}