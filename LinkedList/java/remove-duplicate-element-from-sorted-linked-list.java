// Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).

import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class Remove_Duplicate_From_LL
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			Remove_Duplicate_From_LL llist = new Remove_Duplicate_From_LL(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
        GfG g = new GfG();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList();
		
        t--;		
        }
    }}




class GfG
{
    Node removeDuplicates(Node root)
    {
	    if(root==null || root.next==null)
	    return root;
	    
	    
	     Node head = root;
	    while(root!=null && root.next!=null)
	    {
	        
	        if(root.data == root.next.data)
	        {
	            Node temp;
	            if(root.next.next!=null)
	            {
	                 temp = root.next.next;
	                 root.next = temp;
	            }
	            else
	            {
	                 root.next = null;
	            }
	            continue;
	        }
	        
	        
	        
	        root= root.next;
	    }
	  
	    
	    return head;
    }
}

