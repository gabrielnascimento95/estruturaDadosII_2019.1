package hashing;

import java.util.List;

public class HashEncadeamentoSeparado {
	
	public static class hash{
		int chave;
		hash prox;
	}
	
	private static int tam;
	private static hash tabela[];
	
	public HashEncadeamentoSeparado(List<Integer> listEntrada) {
		this.tam = listEntrada.size();
		this.tabela = new hash[listEntrada.size()];
	}
	
	public static void inserir(int userID, int movieID){
		hash novo = new hash();
		novo.chave = movieID;
		novo.prox = tabela[userID];
		tabela[userID] = novo;
	}
	
	public static int funcaoHashing(int userID){
		return userID%tam;
	}
	
	public static void mostrarHash(){
		hash aux;
		for(int i =0; i< tam; i++){
			aux = tabela[i];
			while(aux != null){
				System.out.println("Entrada " + i + ": " + aux.chave);
			}
		}
	}
	
	public static void excluirHash(int num){
		int pos = funcaoHashing(num);
		hash aux;
		if (tabela[pos] != null){
			if (tabela[pos].chave == num){
				tabela[pos] = tabela[pos].prox;
			}else{
				aux = tabela[pos].prox;
				hash ant = tabela[pos];
				while (aux != null && aux.chave != num){
					ant = aux;
					aux = aux.prox;
				}
				if (aux != null){
					ant.prox = aux.prox;
				}else{
					System.out.println("Número não encotrado");
				}             
			}         
		}else{
			System.out.println("Número não encontrador");
		}
	}
	
}
