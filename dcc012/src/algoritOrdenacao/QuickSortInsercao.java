package algoritOrdenacao;
import java.util.*;

public class QuickSortInsercao {
	public static void InsertionSort(List <Integer> listInteiros, int inicio, int n) {
		for (int i = inicio + 1; i <= n; i++)
		{
			int valor = listInteiros.get(i);
			int j = i;
			while(j > inicio && listInteiros.get(j-1) > valor)
			{
				listInteiros.set(j, listInteiros.get(j-1));
				j--;
			}
			listInteiros.set(j, valor);
		}
	}
	
	public static int particiona(List<Integer> listInteiros, int inicio, int fim)
	{
		int pivo = listInteiros.get(fim);
		int indice = inicio;
		for(int i = inicio; i < fim; i++)
		{
			if(listInteiros.get(i) <= pivo)
			{
				int temp = listInteiros.get(i);
				listInteiros.set(i, listInteiros.get(indice));
				listInteiros.set(indice, temp);
				indice++;
			}
		}
		int temp = listInteiros.get(fim);
		listInteiros.set(fim, listInteiros.get(indice));
		listInteiros.set(indice, fim);
		return indice;
	}
	
	public static void QuickSort(List<Integer> listInteiros, int inicio, int fim)
	{
		if(inicio >= fim)
			return;
		
		int pivo = particiona(listInteiros, inicio, fim);
		QuickSort(listInteiros, inicio, pivo-1);
		QuickSort(listInteiros, pivo+1, fim);			
	}
	
	public static void QuickSortInsertion(List<Integer> listInteiros, int inicio, int fim)
	{
		while (inicio < fim)
		{
			if(fim-inicio < 10)
			{
				InsertionSort(listInteiros, inicio, fim);
				break;
			}
			else
			{
				int pivo = particiona(listInteiros, inicio, fim);
				if(pivo - inicio < fim - pivo) {
					QuickSortInsertion(listInteiros, inicio, pivo - 1);
					inicio = pivo + 1;
				}
				else
				{
					QuickSortInsertion(listInteiros, pivo + 1, fim);
					fim = pivo - 1;
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
