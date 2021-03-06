package com.example.hashtable;

import java.util.Arrays;
import java.util.LinkedList;

public class HashTable {

   Node[] hashNode;
    int capacity;
    int size;

    public HashTable(){
        hashNode = new Node[20];
        for (int i = 0; i < hashNode.length ; i++) {
            hashNode[i] = null;
        }
    }

    public HashTable(int capacity) {
        this.capacity = capacity;
        hashNode = new Node[capacity];
        size = 0;
        for (int i = 0; i < this.capacity ; i++) {
            hashNode[i] = null;
        }
    }

    public int hash(Object key){
        return (Math.abs(key.hashCode()*599)) % hashNode.length;
    }

    public void add(Object key, Object value){
        int index = hash(key);
        Node list = hashNode[index];
        while(list !=null){
            if(list.key.equals(key)){
                    break;
            }
            list = list.next;
        }
        if(list!=null){
            list.value = value;
        }else{
            Node newNode = new Node();
            newNode.value= value;
            newNode.key = key;
            newNode.next = hashNode[index];
            hashNode[index] =newNode;
            size++;
        }
    }

    public Object get(Object key){
        int index = hash(key);

        Node list = hashNode[index];
        while(list!=null){
            if(list.key.equals(key)){
                return list.value;
            }
            list = list.next;
        }
        return null;
    }

    public boolean contains(Object key){
        int index = hash(key);

        Node list = hashNode[index];
        while(list!=null){
            if(list.key.equals(key)){
                return true;
            }
            list = list.next;
        }
        return false;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "hashNode=" + Arrays.toString(hashNode) +
                '}';
    }


    //    public void add(String value, int key){
//        int index = hash(key);
//        LinkedList<Node> items = hashNode[index];
//        if(items == null){
//            items = new LinkedList<Node>();
//            Node item = new Node();
//            item.key= key;
//            item.value = value;
//            items.add(item);
//            hashNode[index]  = items;
//        }else{
//            for(Node item : items){
//                if(item.key== key){
//                    item.value = value;
//                    return;
//                }
//            }
//            Node item =  new Node();
//            item.key = key;
//            item.value = value;
//            items.add(item);
//        }
//
//    }

//    public Node getNode(int key){
//        int index = hash(key);
//        LinkedList<Node> items = hashNode[index];
//        if(items == null){
//            return null;
//        }
//        for(Node item : items){
//            if(item.key == key){
//                return item;
//            }
//        }
//        return null;
//    }

//    public String get(int key){
//        Node item = getNode(key);
//        if(item == null){
//            return "Value dose not exist";
//        }else{
//            return item.value;
//        }
//
//    }


//    public boolean contains(int key){
//        int index = hash(key);
//        LinkedList<Node> items = hashNode[index];
//        if(items == null){
//            return false;
//        }
//        for(Node item : items){
//            if(item.key == key){
//                return true;
//            }
//        }
//        return false;
//    }

//    public String toString(){
//        String result = "";
//
//        if(hashNode == null){
//            return "hash Table is Empty";
//        }
//        for (int i = 0; i < hashNode.length; i++) {
//            Node items = hashNode[i];
//            System.out.println(items);
//            if(items!=null){
//                    while (items!=null){
//                        result = result+"Key "+items.key+" Value "+ items.value + " \n";
//                        items = items.next;
//                }
//            }
//        }
//        return result;
//    }


}
