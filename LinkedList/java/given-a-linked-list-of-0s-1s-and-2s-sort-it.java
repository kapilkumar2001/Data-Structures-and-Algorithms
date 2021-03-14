// Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list 
// such that all zeros segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.


import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}







class Solution
{
    static Node segregate(Node head)
    {
        int count[] = new int[3];
        
        count[0]=0;
        count[1]=0;
        count[2]=0;
        
        
        Node temp = head;
        
        while(temp!=null)
        {
            count[temp.data]++;
            temp=temp.next;
        }
        
        Node temp2 = head;
        
        
        
        
        int i=0;
        while(temp2!=null)
        {
            if(count[i]==0)
            i++;
            else
            {
                temp2.data = i;
                temp2 = temp2.next;
                count[i]--;
            }
        }

        
        return head;
    }
}



