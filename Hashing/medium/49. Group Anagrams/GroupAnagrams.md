# 49. Group Anagrams

## Problem Statement

Given an array of strings `strs`, group the anagrams together. You can return the answer in any order.

---

## Example

**Input:**

```java
strs = ["eat","tea","tan","ate","nat","bat"]
```

**Output:**

```java
[["bat"],["nat","tan"],["ate","eat","tea"]]
```

**Explanation:**

* `"bat"` has no anagram pair in the list.
* `"nat"` and `"tan"` are anagrams of each other.
* `"ate"`, `"eat"`, and `"tea"` are anagrams of each other.

---

## Intuition

Two strings are anagrams if their sorted characters are identical.

Example:

* `"eat"` → `"aet"`
* `"tea"` → `"aet"`
* `"ate"` → `"aet"`

So if we sort every string and use that sorted version as a key,
all anagrams will map to the same key.

---

## Approach

1. Create a HashMap where:

   * **Key** = Sorted version of the string
   * **Value** = List of all anagrams matching that key
2. Traverse through each string:

   * Sort the string
   * If key does not exist, create a new list
   * Add original string to that list
3. Return all values of the HashMap

---


## Dry Run

**Input:**

```java
["eat","tea","tan","ate","nat","bat"]
```

**HashMap Formation:**

```java
"aet" -> ["eat", "tea", "ate"]
"ant" -> ["tan", "nat"]
"abt" -> ["bat"]
```

**Final Output:**

```java
[["eat","tea","ate"], ["tan","nat"], ["bat"]]
```

---

## Time Complexity

Let:

* `n` = Number of strings
* `k` = Maximum length of a string

**Sorting each string:**
`O(k log k)`

**For all strings:**
`O(n * k log k)`

---

## Space Complexity

`O(n * k)`

Used for storing grouped anagrams in the HashMap.

---

## Key Takeaway

To group anagrams efficiently:

> Convert every string into a canonical form (sorted string)
> and group by that form.
