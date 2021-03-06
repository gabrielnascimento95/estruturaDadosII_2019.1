package algoritOrdenacao;

import java.util.List;

public class InsertionSort {
	
	public InsertionSort() {
		
	}
	
	public void ordenaInsertSort(List<Integer> listInteiros){
        for(int i = 1; i < listInteiros.size(); i++){
            for(int j = i; j > 0; j--){
                if(listInteiros.get(j-1) > listInteiros.get(j)){ // vet[j-1] > vet[j]
                	int aux = listInteiros.get(j);
                    listInteiros.set(j, listInteiros.get(j-1));  // vet[j] = vet[j-1]
                    listInteiros.set(j-1, aux);  //vet[j-1] = aux
                }
            }
        }
    }
	
	public void imprimeArray(List<Integer> listInteiros){ 
        for (Integer item : listInteiros){
        	System.out.print(item + " ");
        }             
    } 
	
}
