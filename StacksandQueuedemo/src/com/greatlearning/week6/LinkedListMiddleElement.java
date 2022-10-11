
package com.greatlearning.week6;

import java.util.LinkedList;

public class LinkedListMiddleElement {
	
	    Node head; 
	 
	    class Node
	    {
	        int data;
	        Node next;
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	 
	    /* Function to print middle of linked list */
	    void printMiddle()
	    {
	        Node firstPointer = head;
	        Node secondPointer = head;
	         
	            while (firstPointer != null && firstPointer.next != null)
	            {
	            	firstPointer = firstPointer.next.next;
	            	secondPointer = secondPointer.next;
	            }
	            System.out.println("The middle element is [" +
	            		secondPointer.data + "] \n");
	         
	    }
	 
	   
	    public void push(int new_data)
	    {
	      
	        Node new_node = new Node(new_data);
	        new_node.next = head;
	        head = new_node;
	    }
	 
	   
	    public void printList()
	    {
	        Node tempNode = head;
	        while (tempNode != null)
	        {
	            System.out.print(tempNode.data+"->");
	            tempNode = tempNode.next;
	        }
	        System.out.println("NULL");
	    }
	 
	    public static void main(String [] args)
	    {
	    	LinkedListMiddleElement linkedList = new LinkedListMiddleElement();
	      LinkedList<String> linkedList2 = new LinkedList<String>();
	        for (int i=5; i>0; --i)
	        {
	        	linkedList.push(i);
	        	linkedList.printList();
	        	linkedList.printMiddle();
	        }
	    }
	}


