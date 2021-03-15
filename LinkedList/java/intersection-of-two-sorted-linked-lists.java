// Given two lists sorted in increasing order, create a new list representing the intersection of the two lists.
// The new list should be made with its own memory — the original lists should not be changed.


import java.io.*;
import java.util.*;
class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}
class GfG
{
    static Scanner sc = new Scanner(System.in);
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
        {
            
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n , m;
                    
                    n = sc.nextInt();
                    m = sc.nextInt();
                    
                    Node head1 = inputList(n);
                    Node head2 = inputList(m);
                    
                    Sol obj = new Sol();
                    
                    Node result = obj.findIntersection(head1, head2);
	    
	                printList(result);
	                System.out.println();
                }
        }
}

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> same  = new HashSet<>();
        while(head1!=null)
        {
            hs.add(head1.data);
            head1= head1.next;
        }
        
        int x=-1;
        while(head2!=null)
        {
            if(hs.contains(head2.data))
            {
               x=head2.data;
               head2=head2.next;
               break;
            }
            head2=head2.next;
        }
        
        if(x==-1)
        {
            return null;
        }
        
        Node temp= new Node(x);
        same.add(x);
        
        Node hd = temp;
        while(head2!=null)
        {
            if(hs.contains(head2.data))
            {
                if(!same.contains(head2.data))
                {
                    temp.next = new Node(head2.data);            
                    temp = temp.next;
                    same.add(head2.data);
                }
               
            }
            head2=head2.next;
        }
        
        return hd;
       
    }
}

