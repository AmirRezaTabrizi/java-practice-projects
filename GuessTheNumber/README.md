# 🔁 Day 3 – Loops Practice (Sum & Guess Game)

Two small Java console programs to practice **loops** and **conditionals**.

---

## 🧮 1️⃣ Sum from 1 to N
Calculates the total of all numbers from 1 up to a user-provided value.

### Example:
Enter a number: 5
The sum of numbers from 1 to 5 is 15

---

## 🎯 2️⃣ Guess the Number Game
Generates a random number between **1 and 100**.  
The user tries to guess it, and the program gives hints ("Too high" / "Too low") until guessed correctly.

### Example:
I'm thinking of a number between 1 and 100...
Enter your guess: 60
Too low!
Enter your guess: 75
Too high!
Enter your guess: 68
🎉 Correct! You guessed it in 3 tries.

---

## 💡 Concepts Practiced
- `for` loop
- `while` loop
- `if` / `else` conditionals
- Random number generation (`Random.nextInt()`)
- User input with `Scanner`
- Modular programming (separate classes per task)

---

## 🧱 Project Structure
GuessTheNumber/
│
├── Main.java # Main menu (user choice, loop, and navigation)
├── SumNumbers.java # Logic for summing numbers
└── GuessTheNumber.java # Logic for the guessing game