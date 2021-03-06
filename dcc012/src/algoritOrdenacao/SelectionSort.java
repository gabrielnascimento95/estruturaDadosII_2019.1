package algoritOrdenacao;

import java.util.List;

public class SelectionSort {
	
	public SelectionSort() {
		// TODO Auto-generated constructor stub
	}
	
	public void ordenaSelectionSort(List<Integer> listInteiros) {
		int menor;
		for(int i=0; i <= (listInteiros.size()-2); i++) {
			menor = i;
			for(int j = i+1; j < listInteiros.size(); j++) {
				if(listInteiros.get(j) < listInteiros.get(menor)) {
					menor = j;
				}
			}
			int aux = listInteiros.get(i);
			listInteiros.set(i, listInteiros.get(menor));  // vet[i] = vet[menor];
			listInteiros.set(menor, aux);  //vet[menor] = aux;
		}
	}
	
	public void imprimeArray(List<Integer> listInteiros){ 
        for (Integer item : listInteiros){
        	System.out.print(item + " ");
        }             
    }  
}
