package algoritOrdenacao;

import java.util.List;

public class HeapSort {
	
	public HeapSort() {
		// TODO Auto-generated constructor stub
	}
	
	public void ordenaHeapSort(List<Integer> listInteiros){
		
		//cria a heap
		for(int i = (listInteiros.size()/2)-1; i >=0; i--){
			heapify(listInteiros, listInteiros.size(), i);
		}
		
		//extrai um elemento por um da heap
		for(int i=listInteiros.size()-1; i>=0; i--){
			int aux = listInteiros.get(0);
			listInteiros.set(0, listInteiros.get(i));
			listInteiros.set(i, aux);
			heapify(listInteiros, i, 0);
		}
	}

	private void heapify(List<Integer> listInteiros, int n, int i) {
		int maior = i;
		int esq = 2*i + 1;
		int dir = 2*i + 2;
		
		//se o filho da esqueda é maior que a raiz
		if(esq < n && listInteiros.get(esq) > listInteiros.get(maior)){
			maior = esq;
		}
		
		//se o filho da direita é maior que a raiz
		if(dir < n && listInteiros.get(dir) > listInteiros.get(maior)){
			maior = dir;
		}
		
		//se o maior não é a raiz
		if(maior != i){
			int aux = listInteiros.get(i);
			listInteiros.set(i, listInteiros.get(maior));
			listInteiros.set(maior, aux);
			heapify(listInteiros, n, maior);
		}
	}
	
	public void imprimeArray(List<Integer> listInteiros){ 
        for (Integer item : listInteiros){
        	System.out.print(item + " ");
        }             
    } 
	
}
