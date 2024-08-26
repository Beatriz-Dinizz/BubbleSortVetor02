package controller;

import br.edu.fateczl.BubbleSort.OrdenacaoBubbleSort;

public class ControllerBubbleSortEx02 {

	public ControllerBubbleSortEx02() {
		super();
	}
	
	public void ordenarVetor02() {
		OrdenacaoBubbleSort bubbleSortEx02 = new OrdenacaoBubbleSort();
		
		int[] vetor = {44, 43, 42, 41, 40, 39, 38};
		
		bubbleSortEx02.ordenacaoBubbleSort(vetor);
		
		int tamanho = vetor.length;
		for(int i = 0; i < tamanho; i ++) {
			System.out.println(vetor[i]);
		}
	}
}
