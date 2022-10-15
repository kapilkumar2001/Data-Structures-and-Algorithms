#include <iostream>
using namespace std;

struct ListNode
{
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

ListNode *newnode(int x, ListNode *nxt = NULL)
{
    ListNode *newnode = new ListNode;
    newnode->val = x;
    newnode->next = nxt;
    return newnode;
}

ListNode *mergeTwoLists(ListNode *list1, ListNode *list2)
{
    ListNode *head = new ListNode();
    ListNode *t = head;

    ListNode *itr1 = list1, *itr2 = list2;

    while (itr1 != NULL && itr2 != NULL)
    {
        if (itr1->val < itr2->val)
        {
            t->next = itr1;
            itr1 = itr1->next;
        }
        else
        {
            t->next = itr2;
            itr2 = itr2->next;
        }

        t = t->next;
    }

    if (itr1 != NULL)
        t->next = itr1;
    if (itr2 != NULL)
        t->next = itr2;

    return head->next;
}

int main()
{
//demo list 1
    ListNode *t1, *t2, *t3, *t4, *t5;
    t5 = new ListNode(9, NULL);
    t4 = new ListNode(7, t5);
    t3 = new ListNode(5, t4);
    t2 = new ListNode(3, t3);
    t1 = new ListNode(1, t2);
    // t1->next = t2;
    // t2->next = t3;
    // t3->next = t4;
    // t4->next = t5;
    // t5->next = NULL;

//demo list 2
    ListNode *s1, *s2, *s3, *s4, *s5;
    s5 = new ListNode(10, NULL);
    s4 = new ListNode(8, s5);
    s3 = new ListNode(6, s4);
    s2 = new ListNode(4, s3);
    s1 = new ListNode(2, s2);
    // s1->next = s2;
    // s2->next = s3;
    // s3->next = s4;
    // s4->next = s5;
    // s5->next = NULL;

    ListNode *h = mergeTwoLists(t1, s1);
    while (h != NULL)
    {
        cout << h->val << " ";
        h = h->next;
    }

    return 0;
}
