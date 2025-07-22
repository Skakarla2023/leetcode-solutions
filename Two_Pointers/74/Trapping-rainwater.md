# 🌟74 Trapping rainwater

Imagine you have some bars of different heights standing next to each other — like buildings of different sizes. After it rains, some water will get trapped between the buildings, right?

You need to find how much water is trapped between these bars.

#### Example:

Suppose the heights of the bars are like this:

```ini
height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
```

This is how the bars would look from the side. Water gets trapped in the dips between taller bars.

### Key Idea:

At any position i, the water that can be trapped is:

```
water_at_i = min(max_left[i], max_right[i]) - height[i]
max_left[i] = tallest bar to the left of position i

max_right[i] = tallest bar to the right of position i

height[i] = height of the current bar
```

We take the minimum of the left and right max because water can only rise as high as the shorter side.

If the result is negative or zero, we can't trap water there.

### Step-by-step in simple terms:

- For each position, find the tallest bar to the left.

- For each position, find the tallest bar to the right.

- At each position, compute:

  - How much water can sit on top of the bar = min(left_max, right_max) - current_height

  - Add up all such water amounts.

### Visual Analogy:

- Think of these heights as valleys and hills.
- Water collects in valleys.
- The deeper the valley and the higher the surrounding hills, the more water you can trap.

### Real-World Example:

If you have small bowls placed between taller objects on a table, and you pour water, the water will collect only in the bowls, not spill over the taller objects. That’s what this problem models.

