package HashTables;

public class HashTable<Key, Value> {

    private class HashTableNode {
        private Key key;
        private Value value;
        private boolean active;
        private boolean tombstoned;

        public HashTableNode() {
            key = null;
            value = null;
            active = false;
            tombstoned = false;
        }

        public HashTableNode(Key initKey, Value initData) {
            key = initKey;
            value = initData;
            active = true;
            tombstoned = false;
        }
    }

    private final static int TABLE_SIZE = 9;
    private Object[] table;

    public HashTable() {
        table = new Object[TABLE_SIZE];
        for (int j = 0; j < TABLE_SIZE; j++) {
            table[j] = new HashTableNode();
        }
    }

    // Simple hash method
    private int hash(Key key) {
        return Math.abs(key.hashCode()) % TABLE_SIZE;
    }

    public Value put(Key key, Value value) {
        int hashIndex = hash(key);

        for (int i = 0; i < TABLE_SIZE; i++) {
            int index = (hashIndex + i) % TABLE_SIZE;

            HashTableNode node = (HashTableNode) table[index];

            // ✅ If the spot is NOT active OR is tombstoned, we can use it
            if (!node.active || node.tombstoned) {
                table[index] = new HashTableNode(key, value);
                return null; // New entry added
            }

            // ✅ If the spot already has the same key, update the value
            if (node.active && node.key.equals(key)) {
                Value oldValue = node.value;
                node.value = value;
                return oldValue; // Return old value
            }
        }

        System.out.println("Table is full, cannot insert key: " + key);
        return null;
    }

    // ✅ Simple method to display the hash table
    public void display() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            HashTableNode node = (HashTableNode) table[i];
            if (node.active) {
                System.out.println(i + " -> " + node.key + " : " + node.value);
            } else {
                System.out.println(i + " -> [empty]");
            }
        }
    }

    // ✅ Main method for testing
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();

        hashTable.put("Alice", 85);
        hashTable.put("Bob", 90);
        hashTable.put("Carol", 78);

        hashTable.display();
    }
}
