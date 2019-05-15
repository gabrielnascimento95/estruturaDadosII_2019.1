package algoritOrdenacao;
import java.util.*;

public class QuickSortMediana {
    public static void QuickSortMediana(int[] vet){        
    	QuickSortMediana(vet, 0, vet.length - 1);
    }

    private static void QuickSortMediana(int[] vet, int inicio, int fim){        
        if(inicio < fim){
            int q = particiona(vet, inicio, fim);
            QuickSortMediana(vet, inicio, q - 1);
            QuickSortMediana(vet, q + 1, fim);            
        }
    }
    
    private static int particiona(int[] vet, int inicio, int fim){
        int meio = (inicio + fim)/2;
        int a = vet[inicio];
        int b = vet[meio];
        int c = vet[fim];
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
        troca(vet, medianaIndice, fim);
        
        int pivo = vet[fim];
        int i = inicio - 1;
        for(int j = inicio; j <= fim - 1; j++){
            if(vet[j] <= pivo){
                i = i + 1;
                troca(vet, i, j);
            }
        }
        troca(vet, i + 1, fim);
        return i + 1;
    }
    
    private static void troca(int[] vet, int i, int j){
        int temp = vet[i];
        vet[i] = vet[j];
        vet[j] = temp;
    }    
}

