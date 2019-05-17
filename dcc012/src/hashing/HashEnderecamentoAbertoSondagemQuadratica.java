package hashing;

import java.util.List;

public class HashEnderecamentoAbertoSondagemQuadratica {
	
	public final TermoDicionario eliminado = new TermoDicionario(-1, -1);
	private final int tamanhoDaTabela;
	private TermoDicionario[] dicionario;
	private int colisoes = 0;
	
	public void imprimirTabelaHash(){
		System.out.println("-----------------------------------------------");
		for (int i=0;i<dicionario.length;i++){
			if (dicionario[i] == null) System.out.println("[" + i + "]");
			else System.out.println("[" + i + "] " + dicionario[i].getUserID());
		}
		System.out.println("Contador de colisoes: " + colisoes);
	}
		
	public HashEnderecamentoAbertoSondagemQuadratica(int tam){
		this.tamanhoDaTabela = tam;
		dicionario = new TermoDicionario[tam];
	}

	int hash (int valor, int tentativa) {
		return (int)(valor+tentativa*0.5+tentativa*tentativa*0.5) % tamanhoDaTabela;
	}
	
	public boolean insere(int userID, int movieID){
		int indice;
		for (int j=0;j<tamanhoDaTabela;j++){
			indice = hash(userID,j);
			if (dicionario[indice] == null || dicionario[indice]==eliminado){
				dicionario[indice] = new TermoDicionario(userID, movieID);
				return true;
			}else{
				colisoes++;
			} 
		}
		return false;
	}
	
	TermoDicionario busca(int chave){
		int indice;
		for (int j=0;j<tamanhoDaTabela;j++){
			indice = hash(chave,j);
			if (dicionario[indice] == null){
				return null;
			} 
			else if (dicionario[indice] != eliminado && dicionario[indice].getUserID()==chave){
				return dicionario[indice];
			}  
		}
		return null;
	}

	boolean remove(int chave){
		int indice;
		for (int j=0;j<tamanhoDaTabela;j++){
			indice = hash(chave,j);
			if (dicionario[indice] == null) return false;
			else if (dicionario[indice] != eliminado && dicionario[indice].getUserID()==chave) {
				dicionario[indice] = eliminado;
				return true; 
			}
		}
		return false;
	}
	
}
