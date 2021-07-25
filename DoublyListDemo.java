package com.neosoft.basicPrograms;

public class DoublyListDemo {
	Node head;
	
	class Node{
		int data;
		Node previous;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	public void push(int new_data) {
		Node new_Node=new Node(new_data);
		
		
		new_Node.previous=null;
		new_Node.next=head;
		
		if(head!=null) {
			head.previous=new_Node;
		}
		
		head=new_Node;
	}
	
	public void insertAfter(Node prev_node,int new_data) {
		if(prev_node==null) {
			System.out.println("The given Previous Node cannot be Null!");
			return;
		}
		Node new_node=new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
		new_node.previous=prev_node;
		
		if(new_node.next!=null) {
			new_node.next=new_node;
		}
		
		
	}
	
	public void append(int new_data) {
		Node new_node = new Node(new_data);
		 
        Node last = head;
        new_node.next = null;
 
        if (head == null) {
            new_node.previous = null;
            head = new_node;
            return;
        }
 
        while (last.next != null)
            last = last.next;
 
    
        last.next = new_node;
 
     
        new_node.previous = last;
    }
	
	public void printlist(Node node)
    {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.previous;
        }
    }
	
	
	public static void main(String[] args) {
		DoublyListDemo dld=new DoublyListDemo();
		dld.push(5);
		dld.push(3);
		dld.append(5);
		dld.printlist(dld.head);
	}
}
