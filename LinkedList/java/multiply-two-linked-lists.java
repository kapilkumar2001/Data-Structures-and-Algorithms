// Given elements as nodes of the two linked lists. The task is to multiply these two linked lists, say L1 and L2. 

// Note: The output could be large take modulo 109+7.


import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

class MultiplyTwoLL{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Node head=null;
			Node phead=null;
			int n=sc.nextInt();
			while(n-->0){
				int n1=sc.nextInt();
				if(head==null)
				head=new Node(n1);
			else{
				addHead(head,n1);
			}
			}
			int m=sc.nextInt();
			while(m-->0){
				int n1=sc.nextInt();
				if(phead==null)
				phead=new Node(n1);
			else{
				addPhead(phead,n1);
			}
			}
		GfG g=new GfG();

System.out.println(g.multiplyTwoLists(head,phead));
		}
	}
    public static void addHead(Node node,int a) {
          if (node == null)
            return;
		if(node.next==null)
			node.next=new Node(a);
		else
			addHead(node.next,a);
	}
	public static void addPhead(Node node,int a){
		 if (node == null)
            return;
		if(node.next==null)
		node.next=new Node(a);
	else
		addPhead(node.next,a);
	}
}
	
	


class GfG{
 
    public long multiplyTwoLists(Node l1,Node l2){
        long prev1 = 0;
        while(l1!=null)
        {
            prev1*=10;
            prev1+=(l1.data);
            prev1=prev1%1000000007;
            l1 = l1.next;
        }
        long prev2=0;
        while(l2!=null)
        {
            prev2*=10;
            prev2+=(l2.data);
            prev2=prev2%1000000007;
            l2 = l2.next;
        }
        long prev = prev1*prev2;
        
        return (prev%1000000007);
    }
}
