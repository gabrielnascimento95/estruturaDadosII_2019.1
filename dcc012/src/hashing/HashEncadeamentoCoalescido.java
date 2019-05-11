package hashing;

public class HashEncadeamentoCoalescido {
          
      private int chave;
      private int valor;
      private HashCoalescido next;

      HashCoalescido(int chave, int valor) {
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
  
      public HashCoalescido getNext() {
            return next;
      }

      public void setNext(HashCoalescido next) {
            this.next = next;
      }
}

public class HashMap {

      private final int tamanhoDaTabela;
      HashCoalescido[] tabela;
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
                  HashCoalescido entrada = tabela[hash];
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
                  tabela[hash] = new HashCoalescido(userID, movieID);
            else {
                  HashCoalescido entrada = tabela[hash];
                  while (entrada.getNext() != null && entrada.getChave() != userID)
                        entrada = entrada.getNext();
                  if (entrada.getChave() == userID)
                        entrada.setValor(movieID);
                  else
                        entrada.setNext(new HashCoalescido(userID, movieID));
            }
      }

      public void remove(int chave) {

            int hash = (chave % tamanhoDaTabela);
            if (tabela[hash] != null) {
                  HashCoalescido entradaAnterior = null;
                  HashCoalescido entrada = tabela[hash];
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
