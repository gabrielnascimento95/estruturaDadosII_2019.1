package algoritOrdenacao;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	
	public MergeSort() {
		// TODO Auto-generated constructor stub
	}
	
	public void ordenaMergeSort(List<Integer> listInteiros, int inicio, int fim) {
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            ordenaMergeSort(listInteiros, inicio, meio);
            ordenaMergeSort(listInteiros, meio + 1, fim);
            intercala(listInteiros, inicio, meio, fim);
        }
    }

	private void intercala(List<Integer> listInteiros, int inicio, int meio, int fim) {
		int i, j, k;
		List<Integer> listInteirosAux = new ArrayList<Integer>();
        
        for (i = inicio; i < meio; i++) {
            listInteirosAux.set(i, listInteiros.get(i));
        }
        
        for (j = meio + 1; j < fim; j++) {
        	listInteirosAux.set((fim + meio + 1 - j), listInteiros.get(j));
        }
        
        i = inicio;
        j = fim;
        
        for (k = inicio; k < fim; k++) {
            if (listInteirosAux.get(i) <= listInteirosAux.get(j)) {
                listInteiros.set(k, listInteirosAux.get(i));
                i = i + 1;
            } else {
            	listInteiros.set(k, listInteirosAux.get(j));
                j = j - 1;
            }
        }
	}
	
	public void imprimeArray(List<Integer> listInteiros){ 
        for (Integer item : listInteiros){
        	System.out.print(item + " ");
        }             
    }
}
