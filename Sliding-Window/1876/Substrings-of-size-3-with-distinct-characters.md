# 🧠 1876. Substrings of Size Three with Distinct Characters

You are given a string s.

You have to look at every 3-letter-long piece (substring) of the string and count how many of them have all 3 letters different.

### ✅ Example:

Let's take this input:

```text
"xyzzaz"
```

We look at all the 3-letter substrings (windows):

"xyz" → ✅ all different → count = 1

"yzz" → ❌ z is repeated → skip

"zza" → ❌ z is repeated → skip

"zaz" → ❌ z is repeated → skip

#### 👉 Final answer = 1 (only "xyz" was a good one)

### 🎯 Your Goal:

Count how many 3-letter slices (substrings) of the string:

Are exactly 3 characters long

Have all different characters

### 🧠 Constraints:

Only 3-letter substrings

Only lowercase letters

Length of s is at least 3
