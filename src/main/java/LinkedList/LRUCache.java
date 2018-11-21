package LinkedList;

import java.util.*;

public class LRUCache<K, V> {

    int limit;
    Node<K, V> head;
    Node<K, V> tail;
    Map<K, Node<K,V>> map;

    public LRUCache(int limit) {
        this.limit = limit;
        map = new HashMap<>();
    }

    public void set(K key,  V value) {
        Node n = null;
        if (map.containsKey(key)) {
            n = map.get(n);
            n.update(key, value);
            remove(n);
        } else if (map.size() < limit){
            n = new Node(key,value);
            map.put(key, n);
        } else {
            n = tail;
            remove(tail);
            n.update(key, value);
        }
        append(n);
    }

    private void append(Node<K, V> n) {
        map.put(n.key, n);
        if (head == null) {
            head = n;
            tail = n;
        }
        else {
            Node curHead = head;
            n.next = curHead;
            curHead.pre = n;
            head = n;
        }
    }

    private void remove(Node<K, V> n) {
        if (n.next != null) {
            n.next.pre = n.pre;
        }
        if (n.pre != null) {
            n.pre.next = n.next;
        }
        if (tail == n) {
            tail = tail.pre;
        }
       if (head == n) {
           head = head.next;
       }
       map.remove(n.key); // !!! imp
       n.next = n.pre = null;

    }
    public V get(K key) {
        Node<K, V> n = map.get(key);
        if (n == null) {
            return null;
        }
        remove(n);
        append(n);
        return n.value;
    }

    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> pre;
        Node<K, V> next;
        Node (K k, V v) {
            key = k;
            value = v;
        }
        void update(K k, V v) {
            this.key = k;
            this.value = v;
        }
    }
}
