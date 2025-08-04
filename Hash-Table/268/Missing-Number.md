# 🧩 268 Missing Number

You're given a list of n unique numbers, and they are all from the range 0 to n. But one number is missing from that list.
Your task is to find that missing number.

#### 📦 Example:

If you are given this list:

```java
nums = [3, 0, 1]
```

The numbers from 0 to 3 are:

Copy
Edit
0, 1, 2, 3
But 2 is missing in the list.
So, the answer is:

```
2
```

### 🔍 What’s Really Happening?

- The list is supposed to have all numbers from 0 to n, with just one number missing.

- You're like a detective trying to find which one is gone!

### 🧠 Different Ways to Solve:

#### ✅ 1. Using Math (Smart Trick):

Add all numbers from 0 to n using the formula:

```
sum = n * (n + 1) / 2
```

Then subtract the sum of all numbers in the list.

The difference is the missing number.

### ✅ 2. Using a HashSet or Hashtable:

Store all numbers in a set or hashtable.

Check which number from 0 to n is not present.

That one is missing.

### ✅ 3. Using XOR:

XOR all numbers from 0 to n, and also XOR all numbers in the list.

The result will be the missing number (because duplicates cancel out in XOR).

### 📌 In Summary:

You're given a list of numbers like:

```text
[0, 1, 2, 4, 5]
```

You just need to figure out:

“Hey, what number from 0 to 5 is not in this list?”

Answer: 3
