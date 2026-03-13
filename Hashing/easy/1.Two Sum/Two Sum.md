# 1. Two Sum

**Link:** https://leetcode.com/problems/two-sum/

**Difficulty:** Easy

**Topic:** Arrays & Hashing

**Date Solved:** 2026-03-12

**Attempts before solving:** 2

---

## Problem Summary
Given an array and a target, return indices of two numbers that add up to target.

---

## Brute Force
- Check every pair using nested loops
- Time: O(n²) | Space: O(1)
- Why it fails: too slow for large inputs

---

## Optimised Approach
- Use a HashMap to store (value → index) as you iterate
- For each number, check if (target - num) already exists in map
- One pass is enough
- Time: O(n) | Space: O(n)

---

## Key Insight
> Traded space for time. HashMap gives O(1) lookup,
> turning a O(n²) problem into O(n).

---

## Pattern
Two Sum pattern — complement lookup using HashMap.
Appears in: 3Sum, 4Sum, Subarray Sum Equals K

---

## Mistakes I Made
- Forgot to check complement BEFORE putting into map (would match with itself)
