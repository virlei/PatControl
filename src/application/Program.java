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
		
		Local local = new Local(10, "Guich� 1");
		
		Localizacao localizacao = new Localizacao("07/07/2020", pat, local);
		
		Movimentacao movimentacao = new Movimentacao(pat, "07/07/2020", 1, "08/07/2020");

		System.out.println(pat);
		System.out.println(local);
		System.out.println(localizacao);
		System.out.println(movimentacao); */

		PatrimonioDao patrimonioDao = DaoFactory.createPatrimonioDao();
		
		System.out.println("=== TESTE N� 1: patrimonio findById ===");
		Patrimonio pat = patrimonioDao.findById(83181);
		System.out.println(pat);
		
		System.out.println("\n=== TESTE N� 2: patrimonio findAll ===");
		List<Patrimonio> list = patrimonioDao.findAll();
		for (Patrimonio obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TESTE N� 3: patrimonio insert ===");
		Equipamento obj = new Equipamento(4,null);
		Patrimonio NovoPatr = new Patrimonio(252444, "Canon", "XP 3150", "Para biometria", (byte) 1, obj );
		patrimonioDao.insert(NovoPatr);
		
		
	}

}
