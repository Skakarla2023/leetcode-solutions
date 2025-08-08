# 🧠 Find Pivot Index 

## 📌 What is a Pivot Index?

A pivot index is the position in an array where the sum of all elements to the left is equal to the sum of all elements to the right.

### 📊 For example, in the array:

```ini
nums = [1, 7, 3, 6, 5, 6]
At index 3 (value 6):
```   

- Sum of elements to the left = 1 + 7 + 3 = 11
- Sum of elements to the right = 5 + 6 = 11 
- Since both sides are equal, index 3 is the pivot index.


### 🔍 Why Subtract the Current Element?

To calculate the right side sum, we use:

```ini
rightSum = totalSum - leftSum - nums[i]
```

We subtract nums[i] because the pivot element itself should not be counted on either side.

### ✅ Algorithm (Steps)

- Calculate the total sum of the array.
- Initialize a variable leftSum = 0.
- Loop through the array:
- For each index i, calculate rightSum = totalSum - leftSum - nums[i]

If leftSum == rightSum, return the index — it’s the pivot!

Add nums[i] to leftSum for the next iteration.

If no pivot is found, return -1.

