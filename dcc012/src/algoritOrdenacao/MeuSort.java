package algoritOrdenacao;

import java.util.List;

public class MeuSort {
	
	public MeuSort() {
		// TODO Auto-generated constructor stub
	}
	
	public void ordenaMeuSort(List<Integer> listInteiros){
		int tam = listInteiros.size();
		int v[] = new int[tam];
		
		for (int i = 0; i < tam; i++){
        	v[i] = listInteiros.get(i);
        }  
		
		ordenaAux(v);
		
		for (int i = 0; i < tam; i++){
        	listInteiros.set(i, v[i]);
		}
	}
	
	//Implementação do algoritmo shell sort
	
	public int ordenaAux(int vet[]) 
    { 
        int n = vet.length; 
  
        // Começa com um pulo maior e depois diminui
        for (int pulo = n/2; pulo > 0; pulo /= 2){ 
            for (int i = pulo; i < n; i += 1){ 
                int aux = vet[i]; 
                int j; 
                for (j = i; j >= pulo && vet[j - pulo] > aux; j -= pulo){
                	vet[j] = vet[j - pulo];
                }     
                vet[j] = aux; 
            } 
        } 
        return 0; 
    } 
	
	public void imprimeArray(List<Integer> listInteiros){ 
        for (Integer item : listInteiros){
        	System.out.print(item + " ");
        }             
    } 
}
