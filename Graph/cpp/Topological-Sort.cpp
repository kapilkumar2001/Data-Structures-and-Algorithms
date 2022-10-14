#include<bits/stdc++.h>
#define N 5
using namespace std;
void AddEdge(vector<int>adj[],int inDegree[],int v,int u)
{
    adj[v].push_back(u);
    inDegree[u]++;
}
void sort(vector<int>adj[],int inDegree[])
{
    bool visited[N];
    queue<int> q;
    for (int i = 0; i < N; i++)
    {
        visited[i] = false;
        if(inDegree[i]==0)
        {
            q.push(i);
        }
    }
    while(!q.empty())
    {
        int a = q.front();
        q.pop();
        cout << a << " ";
        visited[a] = true;
        for(int x:adj[a])
        {
            if(visited[x]==false)
            {
                inDegree[x]--;
                if(inDegree[x]==0)
                {
                    q.push(x);
                }
            }
        }
    }
    
}
int main()
{
    vector<int> adj[N];
    int inDegree[N];
    for (int i = 0; i < N; i++)
    {
        inDegree[i] = 0;
    }
    AddEdge(adj,inDegree,0,2);
    AddEdge(adj,inDegree,0,3);
    AddEdge(adj,inDegree,1,3);
    AddEdge(adj,inDegree,1,4);
    AddEdge(adj,inDegree,2,3);
    sort(adj, inDegree);
}
