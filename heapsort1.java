#include <stdio.h>
void swap(int *a,int *b)
{
	int temp;
	temp=*a;
	*a=*b;
	*b=temp;
}

void heapify(int arr[],int n,int i)
{
	int largest=i;
	int left=2*i+1;
	int right=2*i+2;
	if(left<n && arr[left]>arr[largest])
		largest=left;
	if(right<n && arr[right]>arr[largest])
		largest=right;
	if(largest!=i)
	{
		swap(&arr[i],&arr[largest]);
		heapify(arr,n,largest);

	}
}

	void heapsort(int arr[],int n)
	{
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(arr,n,i);
		}

		for(int i=n-1;i>=0;i--)
		{
			swap(&arr[0],&arr[i]);
			heapify(arr,i,0);
		}
	}

	void display(int arr[],int n)
	{
		for (int i = 0; i < n; ++i)
      	printf("%d ", arr[i]);
    	printf("\n");
	}

	int main()
	{
		int n,i;
		printf("\nEnter size of array: ");
		scanf("%d",&n);
		int arr[n];
		printf("\nEnter %d elements: ",n);
		for(i=0;i<n;i++)
		{
			scanf("%d",&arr[i]);
		}
		heapsort(arr,n);
		printf("\nSorted Array is: ");
		display(arr,n);
	}
