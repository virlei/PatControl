package application;

import model.entities.Equipamento;
import model.entities.Local;
import model.entities.Localizacao;
import model.entities.Movimentacao;
import model.entities.Patrimonio;

public class Program {

	public static void main(String[] args) {
		
		Equipamento obj = new Equipamento(20,"Teclado");
		
		Patrimonio pat = new Patrimonio (83, "Positivo", "Positivo", "ABNT-2", 1, obj);
		
		Local local = new Local(5, "Cozinha");
		
		Localizacao localizacao = new Localizacao("08/07/2020", pat, local);
		
		Movimentacao movimentacao = new Movimentacao(pat, "07/07/2020", 1, "08/07/2020");
		
		System.out.println(pat);
		System.out.println(local);
		System.out.println(localizacao);
		System.out.println(movimentacao);
	}

}
