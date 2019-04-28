package algoritOrdenacao;

import java.util.List;

public class BubbleSort {

	public BubbleSort() {
		
	}
	
	public void ordenaBubbleSort(List<Integer> listInteiros) {
		int n = listInteiros.size();
		for (int i = 0; i < n-1; i++){
		  boolean troca = false;	
		  for (int j = 0; j < n-i-1; j++) { 
		      if (listInteiros.get(j) > listInteiros.get(j+1)){ // arr[j] > arr[j+1] 
		    	  int aux = listInteiros.get(j); // temp = arr[j]
		          listInteiros.set(j, listInteiros.get(j+1)); // arr[j] = arr[j+1]
		          listInteiros.set((j+1), aux); // arr[j+1] = temp
		          troca = true; 
		      	}
		  }
		  if(!troca) {
			  break;
		  }
		}
	}
	
	public void imprimeArray(List<Integer> listInteiros){ 
        for (Integer item : listInteiros){
        	System.out.print(item + " ");
        }             
    } 
}
