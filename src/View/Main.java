package View;

import Model.Aeronave;
import Model.Aeroporto;
import Model.Passageiro;
import Model.Pessoa;
import Model.Piloto;


public class Main {
    public static void main(String[] args) {
    	
        // Criando instâncias de Pessoa, Piloto e Passageiro
        Pessoa pessoa1 = new Pessoa("João", 30, 'M');
        Piloto piloto1 = new Piloto("Maria", 35, 'F', "12345", 2000, 10);
        Passageiro passageiro1 = new Passageiro("Carlos", 25, 'M', "987654", "Econômica", 2);

        pessoa1.trabalhar();
        
        // Criando instâncias de Aeronave
        Aeronave aeronave1 = new Aeronave("Boeing 737", 150, "American Airlines");
        Aeronave aeronave2 = new Aeronave("Airbus A320", 180, "Delta Air Lines");

        // Criando instâncias de Aeroporto
        Aeroporto aeroporto1 = new Aeroporto("Aeroporto Internacional de Los Angeles", "Los Angeles", "EUA");
        Aeroporto aeroporto2 = new Aeroporto("Aeroporto Internacional de Heathrow", "Londres", "Reino Unido");

        // Associando Piloto e Passageiro com Aeronave
        aeronave1.voar();
        piloto1.pilotar();
        passageiro1.comprarBilhete();

        // Associando Aeronave com Aeroporto
        aeronave1.voar();
        aeroporto1.aterrissar(aeronave1);

        aeronave2.voar();
        aeroporto2.aterrissar(aeronave2);
    }
}
