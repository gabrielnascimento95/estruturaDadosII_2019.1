package algoritOrdenacao;

import java.util.List;

public class QuickSort {
	
	public QuickSort() {
		// TODO Auto-generated constructor stub
	}
	
	public void ordenaQuickSort(List<Integer> listInteiros, int inicio, int fim){
		if(inicio < fim){
			int index = particionaLista(listInteiros, inicio, fim);
			ordenaQuickSort(listInteiros, inicio, index-1);
			ordenaQuickSort(listInteiros, index+1, fim);
		}
	}

	private int particionaLista(List<Integer> listInteiros, int inicio, int fim) {
		int pivo = listInteiros.get(inicio);
		int i = (inicio);
		
		for(int j = inicio +1; j <= fim; j++){
			if(listInteiros.get(j) <= pivo){
				i++;
				int aux = listInteiros.get(i);
				listInteiros.set(i, listInteiros.get(j));
				listInteiros.set(j, aux);
			}
		}
		int aux = listInteiros.get(i);
		listInteiros.set(i, listInteiros.get(fim));
		listInteiros.set(fim, aux);
		return i;
	}
	
	public void imprimeArray(List<Integer> listInteiros){ 
        for (Integer item : listInteiros){
        	System.out.print(item + " ");
        }             
    }
}

