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
                  HashCoalescido entry = tabela[hash];
                  while (entry != null && entry.getChave() != chave)
                        entry = entry.getNext();
                  if (entry == null)
                        return -1;
                  else
                        return entry.getValor();
            }
      }

      public void insere(int userID, int movieID) {
            int hash = (userID % tamanhoDaTabela);
            if (tabela[hash] == null)
                  tabela[hash] = new HashCoalescido(userID, movieID);
            else {
                  HashCoalescido entry = tabela[hash];
                  while (entry.getNext() != null && entry.getChave() != userID)
                        entry = entry.getNext();
                  if (entry.getChave() == userID)
                        entry.setValor(movieID);
                  else
                        entry.setNext(new HashCoalescido(userID, movieID));
            }
      }

      public void remove(int chave) {

            int hash = (chave % tamanhoDaTabela);
            if (tabela[hash] != null) {
                  HashCoalescido prevEntry = null;
                  HashCoalescido entry = tabela[hash];
                  while (entry.getNext() != null && entry.getChave() != chave) {
                        prevEntry = entry;
                        entry = entry.getNext();
                  }
                  if (entry.getChave() == chave) {
                        if (prevEntry == null)
                             tabela[hash] = entry.getNext();
                        else
                             prevEntry.setNext(entry.getNext());
                  }
            }
    }
}
