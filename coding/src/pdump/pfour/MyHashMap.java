package pdump.pfour;

class MyHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private Entry<K, V>[] table;

    static class Entry<K, V> {
        final K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public MyHashMap() {
        table = new Entry[INITIAL_CAPACITY];
    }

    private int hash(K key) {
        return key == null ? 0 : Math.abs(key.hashCode() % INITIAL_CAPACITY);
    }

    public void put(K key, V value) {
        int hash = hash(key);
        Entry<K, V> newEntry = new Entry<>(key, value, null);

        if (table[hash] == null) {
            table[hash] = newEntry;
        } else {
            Entry<K, V> current = table[hash];
            Entry<K, V> prev = null;

            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                prev = current;
                current = current.next;
            }
            prev.next = newEntry;
        }
    }

    public V get(K key) {
        int hash = hash(key);
        Entry<K, V> current = table[hash];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    public void remove(K key) {
        int hash = hash(key);
        Entry<K, V> current = table[hash];
        Entry<K, V> prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[hash] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Value for 'Two': " + map.get("Two")); // Output: 2

        map.remove("Two");
        System.out.println("Value for 'Two' after removal: " + map.get("Two")); // Output: null
    }
}
