// Given two lists sorted in increasing order, create a new list representing the intersection of the two lists. 
// The new list should be made with its own memory — the original lists should not be changed.


import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}

class Remove_Duplicate_From_LL
{
    Node head;  
    Node temp;
	public void addToTheLast(Node node) 
	{

	  if (head == null) 
	  {
	    head = node;
	    temp = node;
	  }
	  else{
	      temp.next = node;
	      temp = node;
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
			
        Solution g = new Solution();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList();
		
        t--;		
        }
    }
}



class Solution
{
    public Node removeDuplicates(Node head) 
    {
        HashSet<Integer> hs = new HashSet<>();
        
        Node root = head;
        Node prev = null;
        
        while(root!=null)
        {
            if(hs.contains(root.data))
            {
                prev.next = root.next;
            }
            else
            {
                hs.add(root.data);
                prev = root;
            }
            root = root.next;
        }
        
        return head;
    }
}

