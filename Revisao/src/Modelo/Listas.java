package Modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Listas {

	public static void main(String[] args) {
		
		//tipos lista sem ordenamento = Set, HashSet ,HashMap
		//tipos lista com ordenamento = List e ArrayList

		//Sem Generics =permite qualquer tipo de informaçao na lista
		List mala = new ArrayList<>();
		
		mala.add("Camisa");
		mala.add("calça");
		
		for (int i = 0; i < mala.size(); i++) {
			System.out.println(mala.get(i));
			
		}

		for (Object object : mala) {
			String item  = (String) object;
			System.out.println(item);
		}
		
		
		//tem generics = ao tipo de dado que sera trabalhado
		//os itens nao sao ordenados
		Set<String> bolsa  = new HashSet<String>();
		bolsa.add("carteira");
		bolsa.add("chave");
		bolsa.add("celular");

		for (String item : bolsa) {
			System.out.println(item);		
		}

		Map<Integer,String> carteira  = new  HashMap<Integer, String>();
		
		carteira.put(1, "Cartao do banco");
		carteira.put(2, "CNH");
		carteira.put(3, "dinheiro");
		
		System.out.println(carteira.get(1));
		
		
	}

}
