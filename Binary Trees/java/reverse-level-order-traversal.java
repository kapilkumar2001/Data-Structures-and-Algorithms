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

class GFG {
    
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
            String s = br.readLine();
            Node root = buildTree(s);
            Tree g = new Tree();
            ArrayList<Integer> ans = g.reverseLevelOrder(root);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}




class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        int h = height(node);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=h;i>=1;i--)
        {
            arr=  countlevelnode(arr,node,i);
        }
        return arr;
    }
    
    ArrayList<Integer> countlevelnode(ArrayList<Integer> arr,Node node,int level)
    {
        if(node==null)
        return arr;
        if(level==1)
        {
            arr.add(node.data);
        }
        else if(level>1)
        {
            arr = countlevelnode(arr,node.left,level-1);
            arr = countlevelnode(arr,node.right,level-1);
        }
        return arr;
    }
    
    int height(Node node)
    {
        if(node==null)
        return 0;
        
        int leftheight = height(node.left);
        int rightheight = height(node.right);
        
        if(leftheight>rightheight)
        return leftheight+1;
        else
        return rightheight+1;
    }
}      
