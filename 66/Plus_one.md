# Plus One 🧮
Problem
You are given an array of digits. These digits together form a number.
Your job is to add 1 to this number, and return the result as an array again.

For example:

Input: [1, 2, 3] → This means the number 123

Output: [1, 2, 4] → Because 123 + 1 = 124

Example:
```java
Input:  [4, 3, 2, 1]
Output: [4, 3, 2, 2]
```

```java
Input:  [9, 9, 9]
Output: [1, 0, 0, 0]
```

### How it works

- Start from the last digit (right side).
- If the digit is less than 9, just add 1 and you're done.
- If the digit is 9, change it to 0 and move left to add 1 there.
- If all digits are 9 (like [9,9,9]), we add a new digit at the start.

