# 💡 594 Longest Harmonious subsequence

A harmonious subsequence is a group of numbers from an array (not necessarily next to each other) where:

The maximum number and minimum number differ by exactly 1.

#### ✅ Example:

Suppose we have an array:

```csharp
[1, 3, 2, 2, 5, 2, 3, 7]
```

Now let's look at possible harmonious subsequences:

```csharp
One example is [3, 2, 2, 2, 3]
```

Min = 2, Max = 3 → Max - Min = 1 ✅

It has 5 elements.

So, the longest harmonious subsequence is of length 5.

### 💬 Important Points:

It’s not about continuous numbers (not a subarray), just any elements from the array in any position.

The only rule: max - min = 1

You want the longest group that follows that rule.

### 🔍 Think of it like:

You're choosing some numbers from the list where the difference between the smallest and the biggest is 1 — and you're trying to pick as many as possible.

