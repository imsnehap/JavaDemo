package DS;

import java.util.LinkedList;

public class HashMapImpl {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int N;
        private int n;
        private LinkedList<Node> buckets[];

        HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i] = new LinkedList<>(); //creating empty buckets i.e LL
            }
        }

        private int hashCode(K key) {
            return Math.abs(key.hashCode()) % N;
        }

        private int getDataIndexInLL(int bi, K key) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        private void reHash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldBucket.length; i++) {
                for (int j = 0; j < oldBucket[i].size(); j++) {
                    Node node = oldBucket[i].get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashCode(key);
            int di = getDataIndexInLL(bi, key);
            if (di != -1) {
                buckets[bi].get(di).value = value; //Updating key value for already exists key
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda = n / N; // threshold
            if (lambda > 2.0) {
                reHash();
            }

        }

        public V get(K key) {
            int bi = hashCode(key);
            int di = getDataIndexInLL(bi, key);

            if (di != -1) {
                return buckets[bi].get(di).value;
            } else {
                return null;
            }
        }

        public boolean containsKey(K key) {
            int bi = hashCode(key);

            int di = getDataIndexInLL(bi, key);
            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) {
            int bi = hashCode(key);
            int di = getDataIndexInLL(bi, key);
            if (di == -1) {
                return null;
            } else {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }
    }

    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 4);
        map.put("UK", 2);
        map.put("France'", 10);
        System.out.println("Map Value Of UK :: " + map.get("UK"));


    }


}
