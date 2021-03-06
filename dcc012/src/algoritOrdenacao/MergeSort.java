package algoritOrdenacao;

import java.util.List;

public class MergeSort {
	
	public MergeSort() {
		
	}
	
	public void ordenaMergeSort(List<Integer> listInteiros){
		int tam = listInteiros.size();
		int v[] = new int[tam];
		int w[] = new int[tam];
		
		for (int i = 0; i < tam; i++){
        	v[i] = listInteiros.get(i);
        }  
		
		ordenaMergeSortAux(v, w, 0, tam-1);
		
		for (int i = 0; i < tam; i++){
        	listInteiros.set(i, v[i]);
		}
	}
	
	public void ordenaMergeSortAux(int[] v, int[] w, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            ordenaMergeSortAux(v, w, inicio, meio);
            ordenaMergeSortAux(v, w, meio + 1, fim);
            intercala(v, w, inicio, meio, fim);
        }
    }

	private void intercala(int[] v, int[] w,  int inicio, int meio, int fim) {
		for(int k = inicio; k <= fim; k++){
			w[k] = v[k];
		}
		
		int i = inicio;
		int j = meio + 1;
		
		for(int k = inicio; k<=fim; k++){
			if(i > meio){
				v[k] = w[j++];
			}else if(j > fim){
				v[k] = w[i++];
			}else if(w[i] < w[j]){
				v[k] = w[i++];
			}else{
				v[k] = w[j++];
			}
		}
		
	}
	
	public void imprimeArray(List<Integer> listInteiros){ 
        for (Integer item : listInteiros){
        	System.out.print(item + " ");
        }             
    }
}
