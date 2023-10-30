// Given a linked list of N nodes such that it may contain a loop.

// A loop here means that the last node of the link list is connected to the node at position X(1-based index). If the link list does not have any loop, X=0.

// Remove the loop from the linked list, if it is present, i.e. unlink the last node which is forming the loop.

public class remove_loop_in_ll {
     public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        if(head==null || head.next==null){
            return;
        }
         Node s=head,f=head;
         s=s.next;
         f=f.next.next;
       
        while(f!=null && f.next!=null){
            if(s==f)break;
            s=s.next;
            f=f.next.next;
        }
       
        if(s==f){
            s=head;
            if(s!=f){
                while(s.next!=f.next){
                    s=s.next;
                    f=f.next;
                }
                f.next=null;
            }else{
                while(f.next!=s){
                    f=f.next;
                }
                f.next=null;
            }
        }
}
