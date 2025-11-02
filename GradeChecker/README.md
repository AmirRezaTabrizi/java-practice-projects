# 🧩 Day 12 – Grade Checker

A simple Java program that takes a student's score (0–20), determines if they passed or failed,  
and assigns a corresponding letter grade (A–F).

---

## 🎯 Concepts Practiced
- Conditional logic (`if`, `else if`, `else`)
- `switch` statement
- Input validation with user input

---

## 💻 Example Output

Enter your score (0-20): 16
Result: Passed ✅
Letter grade: B


---

## 🧠 How It Works
1. The program takes an integer input between 0 and 20.
2. It checks whether the score is a passing grade (`>10`).
3. Then it uses a `switch` statement to assign a letter grade:
    - 18–20 → `A`
    - 15–17 → `B`
    - 12–14 → `C`
    - 10–11 → `D`
    - below 10 → `F`