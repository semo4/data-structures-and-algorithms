package com.example.hashtable;

import java.util.LinkedList;

public class HashTable {

    LinkedList<Node>[] hashNode;
    int capacity;
    int size;

    public HashTable(int capacity) {
        this.capacity = capacity;
        hashNode = new LinkedList[capacity];
        size = 0;
        for (int i = 0; i < this.capacity ; i++) {
            hashNode[i] = null;
        }
    }

    public int hash(int key){
        return (key*599) % this.capacity;
    }

    public void add(String value, int key){
        int index = hash(key);
        LinkedList<Node> items = hashNode[index];
        if(items == null){
            items = new LinkedList<Node>();
            Node item = new Node();
            item.key= key;
            item.value = value;
            items.add(item);
            hashNode[index]  = items;
        }else{
            for(Node item : items){
                if(item.key== key){
                    item.value = value;
                    return;
                }
            }
            Node item =  new Node();
            item.key = key;
            item.value = value;
            items.add(item);
        }

    }

    public Node getNode(int key){
        int index = hash(key);
        LinkedList<Node> items = hashNode[index];
        if(items == null){
            return null;
        }
        for(Node item : items){
            if(item.key == key){
                return item;
            }
        }
        return null;
    }

    public String get(int key){
        Node item = getNode(key);
        if(item == null){
            return "Value dose not exist";
        }else{
            return item.value;
        }

    }


    public boolean contains(int key){
        int index = hash(key);
        LinkedList<Node> items = hashNode[index];
        if(items == null){
            return false;
        }
        for(Node item : items){
            if(item.key == key){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        String result = "";

        if(hashNode == null){
            return "hash Table is Empty";
        }
        for (int i = 0; i < hashNode.length; i++) {
            LinkedList<Node> items = hashNode[i];
            if(items!=null){
                for(Node item : items){
                    while (item!=null){
                        result = result+"Key "+item.key+" Value "+ item.value + " \n";
                        item = item.next;
                    }
                }
            }
        }
        return result;
    }


}
