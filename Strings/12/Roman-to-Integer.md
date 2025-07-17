# 🧠 12 Roman to Integer

You are given a string made of Roman numeral letters like "X", "V", "I", etc.

Your job is to convert that Roman numeral into an integer.

### 🧮 Roman Symbol Values:

#### Symbol	Value

- I	1
- V	5
- X	10
- L	50
- C	100
- D	500
- M	1000

### 🔑 Main Rule:

Normally, you add the values.

But if a smaller value comes before a bigger value, you subtract it.

#### 📌 Examples:

"III" → 1 + 1 + 1 = 3

"IV" → 5 - 1 = 4

"IX" → 10 - 1 = 9

"MCMXCIV" → 1000 + (1000-100) + (100-10) + (5-1) = 1994

### 🧠 Step-by-Step Logic:

- Create a map of Roman characters to their values.
- Loop through the string from left to right.
- At each letter:
  - If the current letter’s value is less than the next letter, subtract it.
  - Otherwise, add it.
- Return the final total.

### ✅ Example:

```java
Input: "MCMXCIV"
```

- Explanation:
```
M = 1000  
C before M → 100 < 1000 → subtract 100  
X before C → 10 < 100 → subtract 10  
I before V → 1 < 5 → subtract 1  
So: 1000 - 100 + 100 - 10 + 10 - 1 + 5 = 1994
```
