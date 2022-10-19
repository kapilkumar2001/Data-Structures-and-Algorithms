#include<stdio.h>
#include<stdlib.h>
struct Node  {
struct Node *previous;
int item;
struct Node *next;
};
// head pointer holding the address of the first node of list
struct Node *head;
//Creating a new node
struct Node *GetNewNode(int ele) {
struct Node *ptr
= (struct Node*)malloc(sizeof(struct Node));
ptr->item = ele;
ptr->previous = NULL;
ptr->next = NULL;
return ptr;
}
//Inserting a node in the beginning of the list
void InsertBeginning(int ele) {
struct Node *ptr = GetNewNode(ele);
// checking if the list is empty or not
if(head == NULL) {
head = ptr;
return;
}
// if there is some item in the list pointed by head
head->previous = ptr;
ptr->next = head;
head = ptr;
}
//delete a Node from the starting of the list
void DeleteBeginning()
{
struct Node *ptr;
//checking if the list is empty or not
if(head == NULL)
{
printf("\n Sorry there are no items in the list");
}
//if there is only one item present in the list
else if(head->next == NULL)
{
head = NULL;
free(head);
printf("\nCongratulations!! Node has been successfully deleted \n");
}
//if there are more than one item present in the list
else
{
ptr = head;
head = head -> next;
head -> previous = NULL;
free(ptr);
printf("\n Congratulations!! Node has been successfully deleted \n");
}
}
//Printing all the elements of the list in forward direction
void DisplayForward() {
struct Node *ptr1 = head;
if(ptr1 == NULL)
{
printf("\n Sorry there are no items in the list");
}
else
{
printf("Elements in the forward Direction ");
while(ptr1 != NULL) {
printf("%d  ",ptr1->item);
ptr1 = ptr1->next;
}
printf("\n");
}
}
//Printing all the elements in the reverse direction
void DisplayReverse() {
struct Node *ptr1 = head;
if(ptr1 == NULL)
{
printf("\n Sorry there are no items in the list");
}
else
{
// traversing till the last node
while(ptr1->next != NULL) {
ptr1 = ptr1->next;
}
// Traversing backward with the help of previous pointer
printf("Elements in the Reverse Direction ");
while(ptr1 != NULL) {
printf("%d ",ptr1->item);
ptr1 = ptr1->previous;
}
printf("\n");
}
}
//Main function of the program
int main() {
// empty the list
head = NULL;
InsertBeginning(12);
InsertBeginning(23);
InsertBeginning(33);
InsertBeginning(56);
DisplayForward();
DisplayReverse();
DeleteBeginning();
DisplayForward();
DisplayReverse();
}
