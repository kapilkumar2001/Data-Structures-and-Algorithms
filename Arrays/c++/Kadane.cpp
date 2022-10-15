#include <bits/stdc++.h> 
long long maxSubarraySum(int arr[], int n)
{
  long long int sum_till_now = 0;
  //sum till now as soon as it does not get -ve we 
  long long int max_sum = 0;
   for(int i = 0; i < n;i++){
        sum_till_now = sum_till_now + arr[i];
        if(sum_till_now > max_sum){
            max_sum = sum_till_now;
        }
       if(sum_till_now < 0){
           sum_till_now = 0;
       }
   }
    return max_sum;
}
