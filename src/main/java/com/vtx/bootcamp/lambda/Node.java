package com.vtx.bootcamp.lambda;

import java.util.LinkedList;

public class Node {

  int val ;
  
  Node node;

  public Node getNode(int index){
    Node head = this;
    while( --index > 0){
      head = head.node; // this.node
      //head = this.node.node;
    }
    return head;  
  }
  

  public static void main(String[] args) {
    Node node = new Node();
    LinkedList<String> linked = new LinkedList<>();

    linked.add("abc");
    linked.get(3);// Linked -> 1 -> 2 -> 3 , ArrayList: arr(3)

  }
}
