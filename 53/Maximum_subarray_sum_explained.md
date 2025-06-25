# 53. Maximum Subarray Sum

- Subarray refers to continuos part of any given array.
- Subarrays can be any length.
- for example observe the following array:

```
[1,2,3,4,5]
```
- the subarrays of the above array are:
  - length1: 1,2,3,4,5
  - length2: 12,23,34,45
  - length3: 123,234,345
  - length4: 1234,2345
  - length5: 12345
 
### Subarray Sum

- The sum of the elements of such a part of the array is called subarray sum.
- we have two methods to solve this problem:
    - Brute force
    - Kadane's Algorithm

## Brute Force Approach

- In this approach we calculate all the subarrays of the given array and find each subarray sums and find the maximum of those.

```java
for(int st=0;st<n;st++)
{
  for(int end=0;end<n;end++)
  {
    for(int i=0;i<n;i++)
    {
       // print all the subarrays
       // calculate the curr_sum
       // calculate max sum from them
    }
  }
}
```

- but this approach is not recommended because of its time complexity.
- Time complexity of this approach is:O(n^2)
- To eliminate such large time complexity,we use a more optimised approach known as the Kadane's algorithm.

## Kadane's Algorithm

- This algorithm follows a simple logic that
  - if we add 2 positive numbers the result will be positive.
  - a positive and a negative number:
    - a large positive numner and a small negative number,result will be positive.
    - a large negative number and a positive number,result will be negative.
- So each time the result becomes less than zero, reset the value to 0, because zero is bigger thsn negative value.


```java
for(int i=0;i<n;i++)
{
		curr_sum+=arr[i];
		if(curr_sum<0)
		{
			curr_sum=0;
		}
}
```

- The time-complexity of this algorithm is:O(n).
