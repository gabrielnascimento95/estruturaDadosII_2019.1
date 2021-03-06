package hashing;

import java.util.List;

public class HashEncadeamentoCoalescido {
          
      private int chave;
      private int valor;
      private HashEncadeamentoCoalescido next;

      HashEncadeamentoCoalescido(int chave, int valor) {
            this.chave = chave;
            this.valor = valor;
            this.next = null;
      }
  
      public int getValor() {
            return valor;
      }

      public void setValor(int valor) {
            this.valor = valor;
      }

      public int getChave() {
            return chave;
      }
  
      public HashEncadeamentoCoalescido getNext() {
            return next;
      }

      public void setNext(HashEncadeamentoCoalescido next) {
            this.next = next;
      }
      
      class HashMap {

		private final int tamanhoDaTabela;
		HashEncadeamentoCoalescido[] tabela;

		HashMap(List<Integer> listEntradas) {
			this.tamanhoDaTabela = listEntradas.size();
			for (int i = 0; i < listEntradas.size(); i++)
				tabela[i] = null;
		}

		public int busca(int chave) {
			int hash = (chave % tamanhoDaTabela);
			if (tabela[hash] == null)
				return -1;
			else {
				HashEncadeamentoCoalescido entrada = tabela[hash];
				while (entrada != null && entrada.getChave() != chave)
					entrada = entrada.getNext();
				if (entrada == null)
					return -1;
				else
					return entrada.getValor();
			}
		}

		public void insere(int userID, int movieID) {
			int hash = (userID % tamanhoDaTabela);
			if (tabela[hash] == null)
				tabela[hash] = new HashEncadeamentoCoalescido(userID, movieID);
			else {
				HashEncadeamentoCoalescido entrada = tabela[hash];
				while (entrada.getNext() != null
						&& entrada.getChave() != userID)
					entrada = entrada.getNext();
				if (entrada.getChave() == userID)
					entrada.setValor(movieID);
				else
					entrada.setNext(new HashEncadeamentoCoalescido(userID, movieID));
			}
		}

		public void remove(int chave) {

			int hash = (chave % tamanhoDaTabela);
			if (tabela[hash] != null) {
				HashEncadeamentoCoalescido entradaAnterior = null;
				HashEncadeamentoCoalescido entrada = tabela[hash];
				while (entrada.getNext() != null && entrada.getChave() != chave) {
					entradaAnterior = entrada;
					entrada = entrada.getNext();
				}
				if (entrada.getChave() == chave) {
					if (entradaAnterior == null)
						tabela[hash] = entrada.getNext();
					else
						entradaAnterior.setNext(entrada.getNext());
				}
			}

		}
	}
}
