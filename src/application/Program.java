package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.PatrimonioDao;
import model.entities.Equipamento;
import model.entities.Patrimonio;

public class Program {

	public static void main(String[] args) {
		
/*		Equipamento obj = new Equipamento(20,"Teclado");
		
		Patrimonio pat = new Patrimonio (83181, "Positivo", "Positivo", "ABNT-2", (byte) 1, obj);
		
		Local local = new Local(10, "Guichê 1");
		
		Localizacao localizacao = new Localizacao("07/07/2020", pat, local);
		
		Movimentacao movimentacao = new Movimentacao(pat, "07/07/2020", 1, "08/07/2020");

		System.out.println(pat);
		System.out.println(local);
		System.out.println(localizacao);
		System.out.println(movimentacao); */

		PatrimonioDao patrimonioDao = DaoFactory.createPatrimonioDao();
		
		System.out.println("=== TESTE Nº 1: Patrimonio findById ===");
		Patrimonio pat = patrimonioDao.findById(83181);
		System.out.println(pat);
		
		System.out.println("\n=== TESTE Nº 2: Patrimonio findAll ===");
		List<Patrimonio> list = patrimonioDao.findAll();
		for (Patrimonio obj: list) {
			System.out.println(obj);
		}
		
		
		System.out.println("\n=== TESTE Nº 3: Patrimonio insert ===");
		Equipamento obj = new Equipamento(7,null);
		Patrimonio NovoPatr = new Patrimonio(201789, "Giroflex", "Candall 64", "com descanço de braço", (byte) 1, obj );
		patrimonioDao.insert(NovoPatr);
		System.out.println("Inserido novo Patrimônio");
		
		System.out.println("\n=== TESTE Nº 4: Patrimonio update ===");
		pat = patrimonioDao.findById(201789);
		pat.getTipEquip().setId(9);
		patrimonioDao.update(pat);
		System.out.println("Patrimônio alterado");
		

		System.out.println("\n=== TESTE Nº 5: Patrimonio delete ===");
		patrimonioDao.deleteById(201789);
		System.out.println("Patrimônio deletado");

		
	}

}
