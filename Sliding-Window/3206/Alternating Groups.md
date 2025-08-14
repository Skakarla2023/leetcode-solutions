#  🧠 3206 Alternating Groups I:

- You have a circular row of tiles, each tile colored either 0 or 1.

- A group of 3 consecutive tiles is called alternating if no two neighboring tiles have the same color.

- Because the row is circular, the last tile is also next to the first tile.

- Your task is to count how many such groups of 3 consecutive tiles exist in the circle.

### Example
```
colors = [1, 0, 1, 0, 0]
Circular arrangement:
1 - 0 - 1 - 0 - 0 - (back to 1)
```

Groups of 3:

(1, 0, 1) ✅ alternating

(0, 1, 0) ✅ alternating

(1, 0, 0) ❌ (last two same)

(0, 0, 1) ❌ (first two same)

(0, 1, 0) ✅ alternating

So answer = 3.
