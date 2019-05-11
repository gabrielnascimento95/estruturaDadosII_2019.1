package hashing;

public class HashEncadeamentoCoalescido {
          
      private int key;
      private int value;
      private HashCoalescido next;

      HashCoalescido(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
      }
  
      public int getValue() {
            return value;
      }

      public void setValue(int value) {
            this.value = value;
      }

      public int getKey() {
            return key;
      }
  
      public HashCoalescido getNext() {
            return next;
      }

      public void setNext(HashCoalescido next) {
            this.next = next;
      }
}

public class HashMap {

      private final static int TABLE_SIZE = 128;
      HashCoalescido[] table;
      HashMap() {
            table = new HashCoalescido[TABLE_SIZE];
            for (int i = 0; i < TABLE_SIZE; i++)
                  table[i] = null;
      }

      public int get(int key) {
            int hash = (key % TABLE_SIZE);
            if (table[hash] == null)
                  return -1;
            else {
                  HashCoalescido entry = table[hash];
                  while (entry != null && entry.getKey() != key)
                        entry = entry.getNext();
                  if (entry == null)
                        return -1;
                  else
                        return entry.getValue();
            }
      }

      public void put(int key, int value) {
            int hash = (key % TABLE_SIZE);
            if (table[hash] == null)
                  table[hash] = new HashCoalescido(key, value);
            else {
                  HashCoalescido entry = table[hash];
                  while (entry.getNext() != null && entry.getKey() != key)
                        entry = entry.getNext();
                  if (entry.getKey() == key)
                        entry.setValue(value);
                  else
                        entry.setNext(new HashCoalescido(key, value));
            }
      }

      public void remove(int key) {

            int hash = (key % TABLE_SIZE);
            if (table[hash] != null) {
                  HashCoalescido prevEntry = null;
                  HashCoalescido entry = table[hash];
                  while (entry.getNext() != null && entry.getKey() != key) {
                        prevEntry = entry;
                        entry = entry.getNext();
                  }
                  if (entry.getKey() == key) {
                        if (prevEntry == null)
                             table[hash] = entry.getNext();
                        else
                             prevEntry.setNext(entry.getNext());
                  }
            }
      }
}
