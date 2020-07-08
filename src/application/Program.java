package application;

import model.entities.Equipamento;
import model.entities.Patrimonio;

public class Program {

	public static void main(String[] args) {
		
		Equipamento obj = new Equipamento(20,"Teclado");
		
		Patrimonio pat = new Patrimonio (83, "Positivo", "Positivo", "ABNT-2", 1, obj);
		
		System.out.println(pat);
	}

}
