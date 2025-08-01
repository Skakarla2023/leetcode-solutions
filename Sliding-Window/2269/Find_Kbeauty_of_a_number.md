# 🧠 2269 Find K-beauty of a number

- A number is said to have a K-beauty if you can find substrings of length k in its digits, such that:

  - Each substring (when turned into a number)

  - Is not zero

- Divides the original number completely (i.e., no remainder)

- You count how many such substrings exist — that’s your K-beauty.

### 🔢 Example:

Let's say:
```
num = 240
k = 2
```

#### Step-by-step:

1. Convert number to string: "240"
2. Get all substrings of length 2:
  - "24" → → 24

  - "40" → → 40

  - Check:

    - 240 % 24 == 0 ✅

    - 240 % 40 == 0 ✅

#### 🎯 So the K-beauty = 2 (because 2 substrings divide the original number)

### ✅ In Simple Code Logic:

1. Convert the number to string
2. Slide a window of size k over the string
3. For each window:
    - Get substring
    - Convert it to a number
4. If it’s not 0 and divides the original number, count it
5. Return the count

