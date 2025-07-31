# 💡 1763 Longest Nice SubString

You are given a string s, and you need to find the longest substring that is "nice".

- A string is called "nice" if, for every letter in the substring:

  - If a lowercase letter appears, its uppercase version must also be there.

  - If an uppercase letter appears, its lowercase version must also be there.


### 🧠 Examples:

1. Input: "YazaAay"
Substrings:

"aAa" is nice → because it has both 'a' and 'A'.

Answer: "aAa"

2. Input: "Bb"
Both 'B' and 'b' are there → it's nice

Answer: "Bb"

3. Input: "c"
Only lowercase 'c' → its uppercase 'C' is missing

Not nice → answer: "" (empty string)

### 🎯 Goal:

Find the longest possible nice substring from the input string.


#### 🧪 How to check if a substring is "nice"?

- For each character:

  - If it is 'a', check if 'A' is also in the substring.
  - If it is 'B', check if 'b' is also in the substring.
  - Do this for all characters in that substring.
  - If all characters pass this test, the substring is nice.

