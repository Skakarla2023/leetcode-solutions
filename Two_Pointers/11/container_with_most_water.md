# ✅ 11: Container With Most Water

You are given an array of heights. Each height represents a vertical line on the x-axis.

You must pick two lines that, together with the x-axis, form a container that holds the most water.

<img width="822" height="406" alt="image" src="https://github.com/user-attachments/assets/1fa4499a-8924-4f82-8dfe-d244dfe33f70" />


### 🌊 What is “Area” here?

- Think of each pair of lines as forming a container:

  - Width = distance between the two lines

  - Height = the shorter of the two lines (water can’t go above the shorter one)

  - Area = width × minimum height

### 👶 Simple Steps to Solve:

Start with 2 pointers:

- One at the beginning (i = 0)

- One at the end (j = n - 1)

- Calculate area:

  - width = j - i

  - height = min(height[i], height[j])

  - area = width × height

- Keep track of the maximum area found so far

- Move the pointer with the shorter line:

- Because only increasing the shorter line might increase area.

- Repeat until the pointers meet.

### 📌 Why move the shorter one?

If you move the taller one, you're reducing width but not increasing height,
so area can't increase.

#### 🔁 Example:

```java
height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
```

- Start with:

  - i = 0 (height = 1)

  - j = 8 (height = 7)

  - → area = min(1,7) × (8-0) = 1 × 8 = 8

- Now move i (because 1 < 7):

  - i = 1 (height = 8), j = 8 (height = 7)

  - → area = min(8,7) × (8-1) = 7 × 7 = 49

- Keep updating maxArea this way...

- Final answer: 49
