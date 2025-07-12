# 📚 DSA Concepts – Simple Explanation

This repo contains folders for common **Data Structures and Algorithms (DSA)** topics. Below is a simple explanation of each topic to help beginners understand what each approach is used for.

---

## 📁 Arrays
Arrays are lists of items (numbers, strings, etc.) stored in a row.

🔹 Loop through elements  
🔹 Modify or find specific values

**Example:**  
Find the largest number by checking each element one by one.

---

## 📁 Dynamic Programming
Break big problems into smaller ones, and store answers to avoid doing the same thing again.

🔹 Use previous results  
🔹 Avoid repeated work

**Example:**  
Climbing stairs: `ways(n) = ways(n-1) + ways(n-2)`

---

## 📁 Graph (DFS or BFS)
A graph has nodes and edges (like cities connected by roads).

🔹 **DFS (Depth-First Search):** Go deep first  
🔹 **BFS (Breadth-First Search):** Explore level by level

**Example:**  
Find the number of friend groups using DFS/BFS.

---

## 📁 Greedy
Always choose the best thing *right now*, hoping it leads to the best total solution.

🔹 Make local best choices  
🔹 Prove it works globally

**Example:**  
Making change with the fewest coins by always choosing the biggest one.

---

## 📁 Hash Table
A magical box (HashMap or HashSet) that stores and finds things super fast (average O(1) time).

🔹 Store counts  
🔹 Check for duplicates or fast lookups

**Example:**  
Find if an element has already appeared in an array.

---

## 📁 Prefix Sum
Pre-calculate totals to quickly get the sum of any subarray.

🔹 Use an extra array to store cumulative sums  
🔹 Efficient range queries

**Example:**  
Sum from index 2 to 5 → `prefix[5] - prefix[1]`

---

## 📁 Sorting
Arrange numbers or items in order (ascending/descending).

🔹 Helps with searching and comparisons  
🔹 Used in many problems

**Example:**  
Sort ages from youngest to oldest.

---

## 📁 Stack
A last-in, first-out (LIFO) structure.

🔹 Undo operations  
🔹 Match brackets or track previous states

**Example:**  
Check if a string has valid parentheses using a stack.

---

## 📁 Strings
Work with text or characters.

🔹 Manipulate, search, or compare words  
🔹 Handle substrings or patterns

**Example:**  
Check if two strings are anagrams.

---

## 📁 Tree
A tree is a branching structure where each node can have children.

🔹 Traverse using DFS/BFS  
🔹 Binary Search Trees (BST) follow specific rules

**Example:**  
Count nodes or find height of the tree.

---

## 📁 Two Pointers
Use two markers to scan an array efficiently.

🔹 Often used in sorted arrays  
🔹 Reduce time from O(n²) to O(n)

**Example:**  
Find two numbers in a sorted array that add up to a target.

---

## 📌 Summary Table

| 📁 Topic           | 💡 What It Does Simply                               |
|--------------------|-------------------------------------------------------|
| Arrays             | Go through elements one by one                       |
| Dynamic Programming| Break into small parts and remember results          |
| Graph (DFS/BFS)    | Visit connected items step by step                   |
| Greedy             | Always take the best choice right now                |
| Hash Table         | Store and find items super quickly                   |
| Prefix Sum         | Quickly calculate sums of ranges                     |
| Sorting            | Put things in order                                  |
| Stack              | Remember last used item (LIFO)                       |
| Strings            | Work with letters and text                           |
| Tree               | Solve branching problems                             |
| Two Pointers       | Use two markers to solve array problems faster       |

---

> 🧠 Tip: If you're learning, try solving 5-10 beginner problems for each folder.

Feel free to contribute or suggest problems to add in each section!
