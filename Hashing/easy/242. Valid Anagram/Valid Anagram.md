# 242 . Valid Anagram

**Link** : https://leetcode.com/problems/valid-anagram/

**Difficulty:** Easy

**Topic:** Arrays & Hashing

**Date Solved:** 2026-03-21

**Attempts before solving:** 3

## Problem Summary

Given two strings s and t, return true if t is an anagram of s, and false otherwise.


## Brute Force

- convert the 2 strings into character arrays.
- sort the arrays.
- convert back to strings.
- check if they are equal.
- time : O(nlogn) | space : O(n)
- why it fails : larger time complexity


## Optimised Approach

- use a HashMap to store the characters in the first string, along with their frequencies.
- for every char in string2, if map already contains it remove it.
- And in the end, if map is empty return true.


## Key Insight

> turning a O(nlogn) prolem into O(n).




## Pattern

Valid Anagram - check if 2 strings are anagrams using HashMap.
