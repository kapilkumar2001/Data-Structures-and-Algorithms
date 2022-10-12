/*Given a stack with push(), pop(), empty() operations, delete the middle of the stack without using any additional data structure.
Middle: ceil((size_of_stack+1)/2) (1-based index)

Input: 
Stack = {1, 2, 3, 4, 5}
Output:
ModifiedStack = {1, 2, 4, 5}

*/


  void solve(stack<int>&s, int ctr,int size){
        if(ctr==size/2){
            s.pop();
            return;
        }
        int element=s.top();
        s.pop();
        solve(s,ctr+1,size);
        s.push(element);
    }
    //Function to delete middle element of a stack.
    void deleteMid(stack<int>&s, int sizeOfStack)
    {
        // code here.. 
        solve(s,0,sizeOfStack);
    }
