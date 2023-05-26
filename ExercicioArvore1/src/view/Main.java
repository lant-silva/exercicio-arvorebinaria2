package view;

import model.Arvore;

public class Main {
	public static void main(String[] args) {
		Arvore a = new Arvore();
		int[] vetor = {33, 15, 41, 38, 47, 34, 49, 43};
		
		for(int index : vetor) {
			a.insert(index);
		}
		
		try {
			a.prefixSearch();
			System.out.println("\n===================================");
			a.infixSearch();
			System.out.println("\n===================================");
			a.postfixSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
