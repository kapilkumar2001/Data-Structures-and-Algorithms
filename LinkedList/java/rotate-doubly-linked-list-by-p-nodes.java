// Given a doubly linked list, rotate the linked list counter-clockwise by P nodes. Here P is a given positive integer and 
// is smaller than the count of nodes(N) in a linked list.

import java.util.*;
import java.io.*;

class Node {
    int data;
    Node prev, next;
    
    public Node (int d){
        this.data = d;
        prev = null;
        next = null;
    }
}

public class doubly_LL {
    
    static void display(Node node){
        while(node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
    

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int p = sc.nextInt();
		       
		    //Entering the data
		    Node head = new Node(sc.nextInt());
		    Node curr = head;
		    
		    //Entering the rest of the list
		    for(int i=0; i<n-1; i++){
		        int d = sc.nextInt();
		        curr.next = new Node(d);
		        curr = curr.next;
		    }
            
            Gfg obj = new Gfg();
            display(obj.rotateP(head, p));
		}
	}

}


class Gfg {
    Node rotateP (Node head, int p){
        if(head==null || p==0)
        return head;
        
        int count =1;
        
        Node curr= head;
        while(curr!=null && count<p)
        {
            curr = curr.next;
            count++;
        }
        
        if(curr==null)
        {
            return head;
        }
        
        Node currhead = curr;
        while(curr.next!=null)
        {
            curr = curr.next;
        }
        
        curr.next = head;
        head.prev = curr;
        
        
        head = currhead.next;
        head.prev = null;
        currhead.next=null;
        return head;
    }
}
