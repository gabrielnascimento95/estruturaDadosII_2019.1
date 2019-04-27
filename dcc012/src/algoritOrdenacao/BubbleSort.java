package algoritOrdenacao;

public class BubbleSort {

	public BubbleSort() {
		
	}
	
	public void OrdenaBubbleSort(int arr[]) {
	int n = arr.length; 
		for (int i = 0; i < n-1; i++){
		  boolean troca = false;	
		  for (int j = 0; j < n-i-1; j++) { 
		      if (arr[j] > arr[j+1]){ 
		    	  int temp = arr[j]; 
		          arr[j] = arr[j+1]; 
		          arr[j+1] = temp;
		          troca = true;
		      	}
		  }
		  if(!troca) {
			  break;
		  }
		}
	}
	
	public void imprimeArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
}
