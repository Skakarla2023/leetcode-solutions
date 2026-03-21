# 217. Contains Duplicate

**Link** : https://leetcode.com/problems/contains-duplicate/

**Difficulty:** Easy 

**Topic:** Arrays & Hashing

**Date Solved:** 2026-03-12

**Attempts before solving:** 1

---

## Problem Summary

Given an array nums, return true if it contains duplicates.

--- 

## Brute Force

- sort the array.
- from 1 to n:
- if(nums[i] == nums[i-1])
- return true
- time : O(nlogn) | space : O(1)
- why it fails : larger time complexity

---

## Optimised Approach

- use a HashSet to store the numbers.
- for each number, check it it already exists in the set, as set does not allow duplicates.
- if number already exists in the set, return true.
- Time : O(n) | Space : O(n)


---

## Key Insight

> turning a O(nlogn) prolem into O(n).

---

## Pattern

Contains Duplicate - check if an array contains duplicate using HashSet.

