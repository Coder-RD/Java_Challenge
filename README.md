# ☕ 100 Days of Java Challenge 🚀

<p align="center">
  <img src="https://img.shields.io/badge/100%20Days-Java%20Challenge-orange?style=for-the-badge&logo=java&logoColor=white" alt="100 Days of Java Challenge">
  <img src="https://img.shields.io/badge/Language-Java-blue?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Platform-HackerRank-brightgreen?style=for-the-badge&logo=hackerrank&logoColor=white" alt="HackerRank">
  <img src="https://img.shields.io/badge/Progress-92%25-success?style=for-the-badge" alt="92% Progress">
</p>

<p align="center">
  <strong>💻 Learn • Code • Practice • Solve • Grow 🌱</strong>
</p>

<p align="center">
  <strong>📅 92 Days Completed | 8 Days Remaining | 🎯 Goal: 100 Days</strong>
</p>

---

## 👋 About This Repository

Welcome to my **100 Days of Java Challenge!** 🎉

This repository documents my daily Java programming journey through coding challenges, problem-solving exercises, data structures, algorithms, object-oriented programming, and practical programming concepts.

My goal is to improve my Java programming skills, strengthen logical thinking, and develop efficient solutions by practicing consistently every day.

Throughout this challenge, I have worked on problems involving arrays, strings, loops, collections, exception handling, object-oriented programming, recursion, linked lists, stacks, queues, and algorithmic problem-solving.

Each completed challenge represents another step toward becoming a better programmer. 🚀

### 🎯 Challenge Objectives

- ☕ Strengthen Java programming fundamentals.
- 🧠 Improve logical thinking and problem-solving skills.
- 🔢 Practice mathematical and computational problems.
- 🔤 Master string manipulation and pattern matching.
- 📦 Understand Java collections and data structures.
- 🏗️ Strengthen object-oriented programming concepts.
- 🔄 Learn recursion and algorithmic techniques.
- 🔗 Practice linked lists, stacks, queues, and other data structures.
- 🧩 Solve coding interview problems.
- 💻 Write clean, readable, and efficient Java code.
- 📈 Maintain consistency through daily practice.
- 🏆 Complete the 100 Days of Java Challenge.

---

## 🛠️ Technologies & Tools

| Technology | Purpose |
|---|---|
| ☕ Java | Primary programming language |
| 🟢 OpenJDK | Java development environment |
| 💻 HackerRank | Programming challenges |
| 🧩 LeetCode | Data structures and algorithm problems |
| 🗂️ Git | Version control |
| 🐙 GitHub | Code hosting and progress tracking |
| 🧠 DSA | Problem-solving and algorithm practice |
| 📝 Markdown | Documentation |

---

## 📚 Topics Covered

### ☕ Java Fundamentals
- Variables and Data Types
- Operators and Expressions
- Conditional Statements
- Loops and Iteration
- Methods and Parameters
- Arrays and Multidimensional Arrays
- Type Casting
- Input and Output
- Command-Line Arguments

### 🔤 Strings
- String Manipulation
- StringBuilder and StringBuffer
- String Comparison
- String Reversal
- Anagrams
- Palindromes
- String Formatting
- Regular Expressions
- Pattern Matching

### 🏗️ Object-Oriented Programming
- Classes and Objects
- Constructors
- Inheritance
- Polymorphism
- Encapsulation
- Abstraction
- Interfaces
- Abstract Classes
- Method Overloading
- Method Overriding
- Static Members
- Singleton Pattern
- Factory Pattern

### 📦 Java Collections
- ArrayList
- LinkedList
- HashSet
- HashMap
- TreeSet
- PriorityQueue
- Deque
- Stack
- Queue
- Iterators
- Comparable and Comparator

### ⚙️ Advanced Java Concepts
- Exception Handling
- Custom Exceptions
- Generics
- Varargs
- Reflection
- Annotations
- Lambda Expressions
- Functional Interfaces
- Streams
- File Handling
- Date and Time API

### 🧠 Data Structures & Algorithms
- Arrays
- Strings
- Two-Pointer Technique
- Sliding Window
- Linked Lists
- Stacks and Queues
- Recursion
- Backtracking
- Sorting
- Searching
- Hashing
- Binary Search
- Trees
- Graphs
- Dynamic Programming
- Greedy Algorithms
- Priority Queues
- Merge Algorithms
- Time and Space Complexity

### 💡 Problem-Solving Techniques
- Brute Force
- Optimized Algorithms
- In-Place Array Modification
- Two-Pointer Algorithms
- Recursion and Backtracking
- Mathematical Computation
- Frequency Counting
- Hash-Based Lookup
- Edge-Case Handling
- Algorithm Optimization

---

# 📂 Repository Structure

The repository is organized into individual folders to make daily solutions easy to find and review.

📁 **Java_Challenge/**

- 📁 Day1-Java/ through Day92/
- 📁 Day-92/
  - 📄 Remove Element.java
  - 📸 Screenshot 2026-10-26 095317.png
- 📁 Day93-Java/ through Day100-Java/ — Upcoming challenges
- 📄 README.md

Each daily folder contains the relevant Java solution and, where applicable, a screenshot of the successful submission.

### 📌 Latest Challenge

| Detail | Information |
|---|---|
| 📅 Day | 92 |
| 💻 Problem | Remove Element |
| 🏆 Platform | LeetCode |
| 🔢 Problem Number | 27 |
| ☕ Language | Java |
| 🧠 Technique | Two Pointers |
| 📦 Data Structure | Array |
| ⚙️ Approach | In-Place Modification |
| 📄 Solution | `Day-92/Remove Element.java` |
| 📸 Screenshot | `Day-92/Screenshot 2026-10-26 095317.png` |
| ✅ Status | Completed |

---

# 🆕 Day 92 – Remove Element 🚀

## 📌 Problem Information

- **Platform:** LeetCode
- **Problem Number:** 27
- **Problem Name:** Remove Element
- **Difficulty:** Easy
- **Language:** Java
- **Topic:** Arrays
- **Technique:** Two Pointers
- **Approach:** In-Place Modification
- **Status:** Completed ✅

## 🎯 Problem Statement

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` from the array in-place.

Return the number of elements that are not equal to `val`.

The first `k` elements of the modified array must contain all the values that are not equal to `val`. The order of these remaining elements does not matter.

The original array must be modified without creating another array for storing the result.

## 💻 Java Solution

    class Solution {
        public int removeElement(int[] nums, int val) {
            int k = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[k] = nums[i];
                    k++;
                }
            }

            return k;
        }
    }

## 🔍 Approach Explained

### 1. Initialize the Pointer

Initialize `k = 0` to represent the position where the next valid element will be placed.

### 2. Traverse the Array

Use a `for` loop to examine each element of the original array.

### 3. Check the Condition

If `nums[i] != val`, the current element should remain in the array's valid portion.

### 4. Replace the Element

Copy the current valid element to `nums[k]`.

### 5. Increment the Pointer

Increase `k` to prepare the position for the next valid element.

### 6. Return the Result

After processing all elements, return `k`, the number of elements that are not equal to `val`.

## 🧪 Example

**Input:**

    nums = [0,1,2,2,3,0,4,2]
    val = 2

**Output:**

    k = 5

**First Five Elements:**

    [0,1,3,0,4]

The first five positions contain all the elements that are not equal to `2`.

The values after the first five positions do not matter.

## ⏱️ Complexity Analysis

- **Time Complexity:** O(n), because the array is traversed once.
- **Space Complexity:** O(1), because the solution modifies the original array using constant extra space.

## 🧠 Key Learnings

- Practiced array traversal.
- Applied the two-pointer technique.
- Learned in-place array modification.
- Removed unwanted elements without creating another array.
- Improved understanding of time and space complexity.
- Practiced returning the valid array length.
- Learned how to handle duplicate values.
- Strengthened problem-solving skills for coding interviews.

**Key Takeaway:** The two-pointer technique allows us to remove unwanted elements efficiently while maintaining constant extra space.

---

# 📅 100 Days of Java Progress Tracker

| Day | Challenge / Topic | Status |
|---|---|---|
| Day 1–10 | Java Fundamentals and Programming Challenges | ✅ Completed |
| Day 11–20 | Java Basics, Strings, and Problem Solving | ✅ Completed |
| Day 21–30 | Java Programming and Object-Oriented Concepts | ✅ Completed |
| Day 31–40 | Java Problem Solving and Advanced Concepts | ✅ Completed |
| Day 41–48 | Java Programming Challenges | ✅ Completed |
| Day 49 | Varargs - Simple Addition | ✅ Completed |
| Day 50 | Reflection - Attributes | ✅ Completed |
| Day 51 | Prime Checker | ✅ Completed |
| Day 52 | Factory Pattern | ✅ Completed |
| Day 53 | Singleton Pattern | ✅ Completed |
| Day 54–55 | Java Programming Challenges | ✅ Completed |
| Day 56 | Dequeue | ✅ Completed |
| Day 57–87 | Java Programming and Problem-Solving Challenges | ✅ Completed |
| Day 88 | Java Coding Challenge | ✅ Completed |
| Day 89 | Generate Parentheses | ✅ Completed |
| Day 90–91 | Java Coding Challenges | ✅ Completed |
| Day 92 | Remove Element | ✅ Completed |
| Day 93 | Upcoming Java Challenge | ⏳ Pending |
| Day 94 | Upcoming Java Challenge | ⏳ Pending |
| Day 95 | Upcoming Java Challenge | ⏳ Pending |
| Day 96 | Upcoming Java Challenge | ⏳ Pending |
| Day 97 | Upcoming Java Challenge | ⏳ Pending |
| Day 98 | Upcoming Java Challenge | ⏳ Pending |
| Day 99 | Upcoming Java Challenge | ⏳ Pending |
| Day 100 | Final Challenge | 🏆 Pending |

---

# 📊 Challenge Statistics

| Metric | Progress |
|---|---|
| 🎯 Total Goal | 100 Days |
| ✅ Completed Days | 92 |
| ⏳ Remaining Days | 8 |
| 📈 Overall Progress | 92% |
| 💻 Programming Language | Java |
| 🧠 Main Focus | Problem Solving and DSA |
| 🔥 Latest Completed Day | Day 92 |
| 🏆 Final Target | Day 100 |

## 📈 Visual Progress

██████████████████░░ **92%**

**92 / 100 Days Completed**

- ✅ Completed: 92 days
- ⏳ Remaining: 8 days
- 🎯 Target: 100 days

---

# 🏆 Important Milestones

| Milestone | Status |
|---|---|
| 🎯 Day 10 | ✅ Completed |
| 🎯 Day 20 | ✅ Completed |
| 🎯 Day 30 | ✅ Completed |
| 🎯 Day 40 | ✅ Completed |
| 🎯 Day 50 | ✅ Completed |
| 🎯 Day 60 | ✅ Completed |
| 🎯 Day 70 | ✅ Completed |
| 🎯 Day 80 | ✅ Completed |
| 🎯 Day 90 | ✅ Completed |
| 🎯 Day 92 | ✅ Completed |
| 🏆 Day 100 | ⏳ Upcoming |

---

# 🧠 Problem-Solving Approach

My approach to solving each programming challenge:

1. 📖 Understand the problem statement.
2. 🔍 Identify the inputs and expected outputs.
3. 🧠 Develop a logical approach.
4. 📝 Write the Java solution.
5. 🧪 Test the solution with sample inputs.
6. 🔎 Check edge cases.
7. ⚙️ Analyze time and space complexity.
8. 🚀 Optimize the solution when necessary.
9. 📂 Save the solution in the appropriate directory.
10. 📸 Add the submission screenshot when available.
11. 📝 Document the important concepts.
12. 🔄 Move on to the next challenge.

---

# 🌱 Skills I'm Developing

- ☕ Java Programming
- 🧠 Logical Reasoning
- 🧩 Problem Solving
- 📦 Data Structures
- ⚙️ Algorithms
- 🔤 String Manipulation
- 🔢 Mathematical Computation
- 🔄 Recursion
- 🔗 Linked Lists
- 📚 Java Collections
- 🏗️ Object-Oriented Programming
- 🧪 Testing and Debugging
- ⏱️ Complexity Analysis
- 💾 Memory-Efficient Programming
- 🔍 Code Optimization
- 🏆 Coding Interview Preparation
- 🐙 Git and GitHub
- 📈 Consistent Learning

---

# 🔥 Why This Challenge Matters

The 100 Days of Java Challenge helps me build a consistent programming habit and improve my ability to solve real-world coding problems.

By solving problems regularly, I am learning to:

- Break complex problems into smaller steps.
- Choose suitable data structures.
- Write clear and maintainable code.
- Understand algorithm efficiency.
- Handle edge cases.
- Debug errors systematically.
- Optimize solutions.
- Explain my problem-solving approach.
- Build a stronger programming portfolio.

Every completed challenge is an opportunity to improve. 🚀

---

# 📅 Upcoming Goals

As I progress toward Day 100, my goals are to:

- Complete the remaining eight days.
- Practice more data structures and algorithms.
- Solve additional array and string problems.
- Improve algorithm optimization skills.
- Strengthen Java collections knowledge.
- Practice linked lists, stacks, and queues.
- Solve more interview-style coding problems.
- Continue documenting my learning journey.
- Complete the 100 Days of Java Challenge. 🏆

---

# 🤝 Connect With Me

Let's connect, learn, and grow together! 🌱

### 🐙 GitHub Profile

**Coder-RD**

https://github.com/Coder-RD

### ☕ Java Challenge Repository

https://github.com/Coder-RD/Java_Challenge/

### 🗄️ SQL Challenge Repository

https://github.com/Coder-RD/SQL-Challenge/

---

# ⭐ Support

If you find this repository useful or inspiring, please consider giving it a ⭐ star.

Your support motivates me to keep learning, practicing, and sharing my programming journey!

---

# 🔖 Tags

#Java #100DaysOfJava #100DaysOfCode #JavaProgramming #LeetCode #HackerRank #DataStructures #Algorithms #DSA #ProblemSolving #CodingChallenge #Arrays #TwoPointers #InPlaceAlgorithm #ObjectOrientedProgramming #JavaCollections #Recursion #LinkedList #Stack #Queue #CodingJourney #GitHub #LearningInPublic #SoftwareDevelopment #Programming #CodeEveryDay

---

# 🚀 Keep Learning. Keep Coding. Keep Growing.

> "Success comes from consistency, practice, and the willingness to learn every day." 💻🔥

<p align="center">
  <strong>☕ 92 Days Completed | 8 Days Remaining | 🎯 100 Days Goal</strong>
</p>

<p align="center">
  <strong>🔥 One Problem at a Time. One Day at a Time. 🔥</strong>
</p>
