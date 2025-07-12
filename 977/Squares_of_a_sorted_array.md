# ✅ Squares of a sorted array:

You're given an array of integers that is already sorted (from smallest to biggest). But the array can have negative numbers, and your task is:

Square each number and then return a new array where all the squares are sorted from smallest to biggest.

### 🤔 What's the tricky part?

The tricky part is:
Even though the original array is sorted, squaring the numbers can mess up the order, especially because negative numbers become positive when squared.

### 🧠 Example:

#### Input:
```
[-4, -1, 0, 3, 10]
```

Step 1: Square each element

```
[16, 1, 0, 9, 100]
```

Step 2: Sort the squared array

```
[0, 1, 9, 16, 100]
```

That’s the output you want.

### 🪄 So, how do we solve it smartly (Two Pointer way)?

- Start with two fingers (pointers):
  - One at the beginning (left), and one at the end (right).
  - Square both numbers at left and right.
  - The bigger square must go to the end of the result array.
  - Keep moving the left or right pointer inward.
  - Build the result array from the back to the front.
