package br.com.main;

import br.com.model.Pessoa;
import java.util.ArrayList;




public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Pessoa> list = new ArrayList<>();
		
		Pessoa p1 = new Pessoa("Jo�o", 15);
		Pessoa p2 = new Pessoa("Leandro", 21);
		Pessoa p3 = new Pessoa("Paulo", 17);
		Pessoa p4 = new Pessoa("J�ssica", 18);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		
		for (Pessoa index : list) {
			int aux = 0;
			if(index.getIdade() > aux ) {
				aux = index.getIdade();		
			}
			System.out.println(aux);
		}
		for (Pessoa index : list) {
			System.out.println(index);
		}
		for (Pessoa index : list) {
			if(index.getIdade() < 18 ) {
				list.remove(index);
			}
		}
		for (Pessoa index : list) {
			System.out.println(index);

		}
		for (Pessoa index : list) {
			if(index.getNome() == "Jessica") {
				System.out.println(index.getIdade());
			}
			System.out.println("\nJessica n�o est� na lista!\n");
		}
		
	}
	
}
