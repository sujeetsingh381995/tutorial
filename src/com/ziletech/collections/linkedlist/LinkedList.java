package com.ziletech.collections.linkedlist;

public class LinkedList<T> {

    private Node<T> head; //1 -> 2 -> 3
    private Node<T> tail; //1 -> 2 -> 3

    public void add(T value){ //1
       Node<T> newNode = new Node<>(); //1
       newNode.setValue(value);

       //1->2
       if(head == null){
           head = newNode;
           tail = newNode;
       }else{
           tail.setNext(newNode);
           tail = newNode;
       }


//       if(head == null){
//           head = newNode;
//       }else{
////           1->2->3->4->5->null
////           head -> 1
//           Node<T> lastNode = head;                 //1
//           while(lastNode.getNext() != null){
//               lastNode = lastNode.getNext();   //2 //3 //4 //5
//           }
//           lastNode.setNext(newNode);
//       }
    }

    public void print(){
        Node<T> currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
    }

    public void remove(T t){

        Node<T> preNode = null;
        Node<T> currentNode = head;
        // 1->2->3->4->5->null

        while(currentNode != null && !currentNode.getValue().equals(t)){
            preNode = currentNode;
            currentNode = currentNode.getNext();
        }

        if(currentNode == null){
            throw new IllegalArgumentException("Element is not found : " + t);
        }

        //first element
        if(preNode == null){
            head = currentNode.getNext();
            if(head == null){
                tail = null;
            }
        }else{
            preNode.setNext(currentNode.getNext());
        }
    }
}
