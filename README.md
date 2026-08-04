# 🚀 Refresher Training — Java DSA


---

## 📅 Day 1 — Arrays, Strings & HackerRank Kickoff
*(Date: 31-07-2026)*

### 🧠 What Was Covered

#### Data Structures — The Basics
- Got clarity on what Data Structures are and the role they play in building efficient, scalable software.
- Distinguished between **Primitive** types (int, char, etc.) and **Non-Primitive** structures (arrays, lists, maps, etc.).

#### Arrays
Hands-on practice with:
- Traversal and element access
- Insertion and Deletion
- Left Rotation
- Frequency counting
- General manipulation patterns

#### Strings in Java
Worked through key String behaviors:
- Why Strings are **immutable** in Java
- Methods: `indexOf()`, `substring()`, `split()`, `charAt()`
- Common string manipulation patterns

#### Getting Started with HackerRank
- Breaking down problem statements
- Interpreting sample inputs and outputs
- Knowing when to use **Run Code** vs **Submit Code**
- Working with Java's function templates and I/O handling
- Thinking about optimization from the start

---


## � Solution Highlights

**Simple Array Sum** — Iterated through the array and accumulated the total sum.

**Plus Minus** — Counted positives, negatives, and zeros separately, then printed each as a decimal ratio.

**Birthday Cake Candles** — Found the maximum height value and counted its occurrences in one pass.

**CamelCase** — Traversed the string and incremented a counter on each uppercase letter found, plus one for the first word.

**Arrays - DS** — Printed array elements in reverse order without using extra space.

**Left Rotation** — Used index arithmetic `(i + k) % n` to rotate elements without allocating a second full array.

**Java String Tokens** — Stripped leading/trailing whitespace, applied a regex split on non-alphabetic characters, and counted valid tokens.

**Java Anagrams** — Converted both strings to lowercase, sorted their character arrays, and compared for equality.

**Array Manipulation** — Applied the **Difference Array** technique to record range updates in O(1) each, then ran a **Prefix Sum** sweep to find the maximum — bringing overall complexity from O(n × q) down to O(n + q).

**Sherlock and Anagrams** — Generated all substrings, sorted each to normalize it, tracked frequencies in a **HashMap**, and counted valid anagram pairs using `count * (count - 1) / 2`.

👉 [Day 1 - HackerRank Solutions](https://github.com/Deepanshukhoushi/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/src/Day_1/HackerRank_based_Codebase)

---

## 📅 Day 2 — Stacks & Queues
*(Date: 03-08-2026)*

### 🧠 What Was Covered

#### Stack
- Understood the **LIFO** (Last In First Out) principle and when to apply it.
- Used Java's built-in `Stack<T>` class for push, pop, peek, and isEmpty operations.
- Learned how to maintain a **secondary stack** alongside the main stack to track auxiliary information like the current maximum.
- Explored using a stack to store **state history** for undo-type operations.

#### Queue
- Understood the **FIFO** (First In First Out) principle.
- Learned how to **simulate a Queue using two Stacks** — lazy transfer from input stack to output stack only when the output stack is empty.

---

## 🔍 Solution Highlights

**Balanced Brackets** — Pushed every opening bracket onto a stack. For each closing bracket, checked if the top of the stack was the matching opener — if not or stack was empty, returned `NO`. Returned `YES` only if the stack was empty at the end.

**Equal Stacks** — Computed the total sum of all three stacks upfront. Then repeatedly removed the top element from whichever stack had the largest sum until all three sums were equal.

**Queue Using Two Stacks** — Maintained an `input` stack for enqueue and an `output` stack for dequeue/peek. Transferred all elements from input to output (reversing the order) only when output was empty, achieving amortized O(1) per operation.

**Simple Text Editor** — Used a `StringBuilder` for the current text and a `Stack<String>` to save snapshots before every append or delete. Undo simply popped the last saved state and restored it.

**Maximum Element** — Maintained a main stack and a parallel `maxStack`. On push, added to `maxStack` only if the new element was greater than or equal to the current max. On pop, removed from `maxStack` only if the popped element matched the current max. Query always returns `maxStack.peek()` in O(1).

**Truck Tour** — Tracked `currentSurplus` and `totalSurplus` while iterating through pumps. Whenever `currentSurplus` dropped below zero, reset it and moved the candidate start to the next pump. If `totalSurplus >= 0` at the end, the start index is valid.

👉 [Day 2 - HackerRank Solutions](https://github.com/Deepanshukhoushi/BridgeLabz-Training/tree/Refresher-Training/Refresher-Training/src/Day_2/HackerRank_Problems)

---