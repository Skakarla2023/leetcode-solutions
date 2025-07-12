# ✅217 Contains Duplicate


## 💬 Problem Statement :

- You are given an array of numbers.
- You need to check if any number appears more than once.

- 👉 If any number repeats, return true.
- 👉 If all numbers are different, return false 

🧠 Example:
```java
Input: [1, 2, 3, 4]
Output: false


Input: [1, 2, 3, 1]
Output: true  // because 1 appears twice
```


- we can solve this problem by using Arrays.sort(arr_name) using which we'll sort the array and it is easy to check for duplicates in a sorted array than a unsorted array.
- if there is any repeating element it appears right next to the element,so we just need to check if any of the elements of the array is equal to its neighbouring element.

