package algoritOrdenacao;

public class SelectionSort {
	
	public SelectionSort() {
		// TODO Auto-generated constructor stub
	}
	
	public void ordenaSelectionSort(int vet[]) {
		int menor;
		for(int i=0; i <(vet.length-2); i++) {
			menor = i;
			for(int j = i+1; j < vet.length; j++) {
				if(vet[j] < vet[menor]) {
					menor = j;
				}
			}
			int aux = vet[i];
			vet[i] = vet[menor];
			vet[menor] = aux;
		}
	}
	
	public void imprimeArray(int arr[]){ 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
}
