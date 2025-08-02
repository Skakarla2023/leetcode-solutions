# 🧩 2379 Minimum Recolors to Get K Consecutive Black Blocks

You are given:

- A string made of only two characters:

  - 'B' means a black block

  - 'W' means a white block

- An integer k, which tells you how many consecutive black blocks you want to have.

### 🎯 Your Goal:

#### 👉 Find the minimum number of white blocks you need to change (recolor) to black,

so that somewhere in the string, there is a group of k black blocks in a row.

### 🔧 What You Can Do:

- You are allowed to change white blocks ('W') into black ('B'), but you want to do this as few times as possible.

- You don’t need to change the whole string — just enough to get k black blocks together somewhere.

### ✅ Example:

Let’s say:

```ini
blocks = "WBBWWB", k = 3
```

We look at every group of 3 blocks:

```
"WBB" → 1 white

"BBW" → 1 white

"BWW" → 2 whites

"WWB" → 2 whites
```

The best group has only 1 white block → so we only need 1 recolor.

#### ✅ Final Answer = 1
