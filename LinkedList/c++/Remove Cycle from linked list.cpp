#include <bits/stdc++.h>

using namespace std;

class NODE
{
public:
    int data;
    NODE *next;

    NODE(int x)
    {
        data = x;
        next = NULL;
    }
};
NODE *insert_front(NODE *head, int x)
{
    NODE *temp = new NODE(x);
    temp->next = head;
    head = temp;

    return head;
}
NODE *insert_rear(NODE *head, int x)
{
    NODE *temp = new NODE(x);
    NODE *temp2=head;
    while(temp2->next!=NULL)
    {
        temp2=temp2->next;
    }
    temp2->next=temp;
    return head;
}
NODE* insertrandom(NODE *head,int pos,int x)
{
       if(pos==1)
       {
           head = insert_front(head,x);
           return head;
       }
       NODE* temp=head;
       int cnt=1;
       while(cnt<pos-1)
       {
           temp=temp->next;
           cnt++;
       }
   NODE *newnode=new NODE(x);
       newnode->next=temp->next;
       temp->next=newnode;

       return head;
}
void print(NODE *head)
{
    NODE *temp;
    temp = head;
    while (temp != NULL)
    {
        cout << temp->data << "->";
        temp = temp->next;
    }
    cout <<"NULL"<<"\n";
}
void makecycle(NODE *head,int pos)
{
    NODE *temp=head;
    NODE *start;
    int cnt=1;
    while(temp->next!=NULL)
    {
          if(cnt==pos)
          {
              start=temp;
          }
          temp=temp->next;
          cnt++;
    }
    temp->next=start;
}
bool detect(NODE *head)
{
    NODE *fast=head;
    NODE *slow=head;
    while(fast!=NULL && fast->next!=NULL)
    {
        slow=slow->next;
        fast=fast->next->next;
        if(fast==slow)
        {
            return true;
        }
    }
    return false;
}
void removecycle(NODE *head)
{
    NODE *fast=head;
    NODE *slow=head;
    do
    {
        slow=slow->next;
        fast=fast->next->next;
    } while(slow!=fast);
    
    fast=head;
    while(slow->next!=fast->next)
    {
        slow=slow->next;
        fast=fast->next;
    }
    slow->next=NULL;   
}
int main()
{
    NODE *head = NULL;
    head = insert_front(head, 10);
    head = insertrandom(head,1,23);
    head = insertrandom(head,3,15);
    head = insertrandom(head,4,16);
    head=insert_rear(head,22);
    makecycle(head,3);
    cout<<detect(head)<<"\n";
    removecycle(head);
    cout<<detect(head)<<"\n";
    print(head);
    return 0;
}
