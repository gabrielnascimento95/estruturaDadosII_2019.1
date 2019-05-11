package hashing;

import java.util.ArrayList;
import java.util.List;

public class HashEnderecamentoAbertoSondagemLinear {
	
	private final int tamanhoDaTabela;
	private TermoDicionario[] listDicionario;
	public final TermoDicionario eliminado = new TermoDicionario(-1, -1);
	private int colisoes = 0;

	public void imprimirTabelaHash(){
		System.out.println("-----------------------------------------------");
		for (int i=0;i<listDicionario.length;i++){
			if (listDicionario[i] == null){
				System.out.println("[" + i + "]");
			}else{
				System.out.println("[" + i + "] " + listDicionario[i].getUserID());
			}
		}
		System.out.println("Contador de colisoes: " + this.colisoes);
	}
		
	public HashEnderecamentoAbertoSondagemLinear(List<Integer> listEntradas){
		this.tamanhoDaTabela = listEntradas.size();
		this.listDicionario = new TermoDicionario[tamanhoDaTabela];
	}

	public int hash (int valor, int tentativa) {
		return (valor+tentativa) % tamanhoDaTabela;
	}
	
	public boolean insere(int userID, int movieID){
		int indice;
		for (int j=0;j<tamanhoDaTabela;j++){
			indice = hash(userID,j);
			if (listDicionario[indice] == null || listDicionario[indice]== eliminado){
				listDicionario[indice] = new TermoDicionario(userID, movieID);
				return true;
			}else colisoes++;
		}
		return false;
	}
	
	TermoDicionario busca(int chave){
		int indice;
		for (int j=0;j<tamanhoDaTabela;j++){
			indice = hash(chave,j);
			if (listDicionario[indice] == null){
				return null;
			} 
			else if (listDicionario[indice] != eliminado && listDicionario[indice].getUserID()==chave){
				return listDicionario[indice];
			}  
		}
		return null;
	}

	boolean remove(int chave){
		int indice;
		for (int j=0;j<tamanhoDaTabela;j++){
			indice = hash(chave,j);
			if (listDicionario[indice] == null) return false;
			else if (listDicionario[indice] != eliminado && listDicionario[indice].getUserID()==chave) {
				listDicionario[indice] = eliminado;
				return true; 
			}
		}
		return false;
	}
}
