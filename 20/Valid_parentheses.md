## 🧩 Problem: Valid Parentheses

### 📝 Problem Statement
Given a string containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['`, and `']'`, determine if the input string is valid.

A string is considered **valid** if:
- Open brackets are closed by the same type of brackets.
- Open brackets are closed in the correct order.
- Every closing bracket has a corresponding opening bracket.

### ✅ Example 1:
**Input:** `({[]}[])`  
**Output:** `true`  
**Reason:** All brackets are properly opened and closed in correct order.

### ❌ Example 2:
**Input:** `([)]`  
**Output:** `false`  
**Reason:** `[` is closed by `)`, which is incorrect.

---

### 🧠 How It Works (Explanation)
We use a **stack** to keep track of opening brackets.  
As we read each character:
- If it's an opening bracket (`(`, `{`, `[`), we push it to the stack.
- If it's a closing bracket (`)`, `}`, `]`):
  - We check if the stack is empty (which means no opening bracket to match with).
  - Then, we pop from the stack and verify if it matches the correct type.

At the end, if the stack is empty, it means all brackets were matched correctly.

---

### 🛠️ Data Structure Used
- **Stack** – for Last In First Out (LIFO) matching of brackets.

---

### 💡 Tip
This is a classic **stack problem** commonly asked in coding interviews.

