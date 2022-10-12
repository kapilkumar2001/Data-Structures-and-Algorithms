/*You are given a stack St. You have to reverse the stack using recursion.
EXAMPLE:
Input:
St = {3,2,1,7,6}
Output:
{6,7,1,2,3}
*/

void push_at_btm(stack<int>&s,int a)
{
    if(s.size()==0) {
        s.push(a);
        return;
    }
    int b=s.top();
    s.pop();
    push_at_btm(s,a); //recursion
    s.push(b);
}
void helper(stack<int>&s){
    if(s.size()==0) return;
    int a=s.top();
    s.pop();
    helper(s);  //recursion
    push_at_btm(s,a);
}
stack<int> Reverse(stack<int> st){
    helper(st);
    return st;
}
