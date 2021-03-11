import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        
        Node root = new Node(Integer.parseInt(ip[0]));
        
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            Node currNode = queue.peek();
            queue.remove();
                
            String currVal = ip[i];
                
            if(!currVal.equals("N")) {
                    
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
                
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            if(!currVal.equals("N")) {
                    
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s1 = br.readLine();
	            String s2 = br.readLine();
    	    	Node root1 = buildTree(s1);
    	    	Node root2 = buildTree(s2);
        	    BinaryTree tree = new BinaryTree();
        	    if (tree.isIsomorphic(root1, root2) == true) 
                    System.out.println("Yes"); 
                else
                    System.out.println("No");
                t--;
            
        }
    }
  
}


class BinaryTree  
{ 
    boolean isIsomorphic(Node root1, Node root2)  
    { 
        if(root1==null && root2==null)
        return true;
        
        if(root1==null || root2==null)
        return false;
        
        if(root1.data != root2.data)
        return false;
        
        return (isIsomorphic(root1.right,root2.right) && isIsomorphic(root1.left,root2.left)) ||
                (isIsomorphic(root1.left,root2.right) && isIsomorphic(root1.right,root2.left));
    }
    
}    
