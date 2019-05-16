package algoritOrdenacao;
import java.util.*;

public class QuickSortMediana {
    
    public void QuickSortMediana(List<Integer> listInteiros){        
    	QuickSortMediana(listInteiros, 0, listInteiros.size() - 1);
    }

    private static void QuickSortMediana(List<Integer> listInteiros, int inicio, int fim){        
        if(inicio < fim){
            int q = particiona(listInteiros, inicio, fim);
            QuickSortMediana(listInteiros, inicio, q - 1);
            QuickSortMediana(listInteiros, q + 1, fim);            
        }
    }
    
    private static int particiona(List<Integer> listInteiros, int inicio, int fim){
        int meio = (inicio + fim)/2;
        int a = listInteiros.get(inicio);
        int b = listInteiros.get(meio);
        int c = listInteiros.get(fim);
        int medianaIndice;
        if(a < b){
            if(b < c){
                medianaIndice = meio;
            }else{                
                if(a < c){
                    medianaIndice = fim;
                }else{
                    medianaIndice = inicio;
                }
            }
        }else{
            if(c < b){
                medianaIndice = meio;
            }else{
                if(c < a){
                    medianaIndice = fim;
                }else{
                    medianaIndice = inicio;
                }
            }
        }
        troca(listInteiros, medianaIndice, fim);
        
        int pivo = listInteiros.get(fim);
        int i = inicio - 1;
        for(int j = inicio; j <= fim - 1; j++){
            if(listInteiros.get(j) <= pivo){
                i = i + 1;
                troca(listInteiros, i, j);
            }
        }
        troca(listInteiros, i + 1, fim);
        return i + 1;
    }
    
    private static void troca(List<Integer> listInteiros, int i, int j){
        int temp = listInteiros.get(i);
        listInteiros.set(i, listInteiros.get(j));
        listInteiros.set(j, temp);
    } 
    
    public void imprimeArray(List<Integer> listInteiros){ 
        for (Integer item : listInteiros){
        	System.out.print(item + " ");
        }             
    }
}
