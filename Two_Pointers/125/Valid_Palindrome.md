# ✅ 125 Valid Palindrome

## Goal:

- Check if a string reads the same forward and backward, ignoring:

  - Upper/lowercase differences

  - Spaces, punctuation, or symbols

  - Only letters and digits matter

### 🔍 Simple Example:

```text
Input:  "A man, a plan, a canal: Panama"
Step 1: Remove non-letters/digits → "AmanaplanacanalPanama"
Step 2: Convert to lowercase → "amanaplanacanalpanama"
Step 3: Check if it reads same forward and backward → ✅ Yes → true
```

### ❌ Not a Palindrome Example:

```text
Input: "race a car"
Cleaned: "raceacar"
Reversed: "racacear" → ❌ Not the same → false
```

#### 👣 How the Code Works:

- Convert the string to lowercase.

- Use two pointers: one starting from the beginning (i), one from the end (j).

- Skip characters that are not letters or numbers.

- Compare the valid characters at i and j.

- If all matching pairs are the same, return true.

- If any mismatch is found, return false.


### 🧠 Key Concepts:

- Two-pointer technique: Efficient way to compare from both ends.

- Character filtering: Skip punctuation, spaces, symbols.

- Case-insensitive comparison: 'A' equals 'a'.
