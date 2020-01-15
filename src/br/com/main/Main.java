package br.com.main;

import br.com.model.Pessoa;
import java.util.ArrayList;




public class Main {

	public static void main(String[] args) {
		
		
		Pessoa p1 = new Pessoa("João", 15);
		Pessoa p2 = new Pessoa("Leandro", 21);
		Pessoa p3 = new Pessoa("Paulo", 17);
		Pessoa p4 = new Pessoa("Jessica", 18);
		
		ArrayList<Pessoa> list = new ArrayList<>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		int aux = 0;
		String saux = " ";
		
		for (Pessoa index : list) {
			if(index.getIdade() > aux ) {
				aux = index.getIdade();
				saux = index.getNome();
			}
		}
		System.out.println( saux + " " + aux);
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i ++) {
			if(list.get(i).getIdade() < 18) {
				list.remove(i);
			}
		}
		
		System.out.println(list.size());

		for (Pessoa index : list) {
			if(index.getNome() == "Jessica") {
				System.out.println(index.getIdade());
			}
		}
		
	}
	
}
