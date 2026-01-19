# 🛠️ Compiler Construction: Lexical & Syntax Analyzer

[![Language](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.oracle.com/java/)
[![Algorithm](https://img.shields.io/badge/Parser-LL(1)-blue.svg)](#)
[![University](https://img.shields.io/badge/Pharos-University-green.svg)](https://www.pua.edu.eg/)
[![Course](https://img.shields.io/badge/Course-EC%20359-red.svg)](#)

## 📖 Project Overview

This project is a functional implementation of the initial phases of a **Compiler**: the **Lexical Analyzer** (Scanner) and the **Syntax Analyzer** (Parser). [cite_start]It was developed to simulate how high-level language code is transformed into machine-readable formats by checking for grammatical correctness and valid token sequences[cite: 330, 493, 639].

[cite_start]The system takes source code as input, tokenizes it, and then validates the structure using an **LL(1) Top-Down Parsing algorithm**[cite: 648].

**Academic Context:**
* [cite_start]**Institution:** Pharos University in Alexandria (PUA), Faculty of Engineering[cite: 295].
* [cite_start]**Department:** Computer Engineering Department[cite: 295].
* [cite_start]**Course:** EC 359 - Programming Languages & Translators[cite: 306, 448].
* **Instructors:** Dr. Abd EL-Hafez & Eng. [cite_start]Sahar Magdy[cite: 311, 312].

## ✨ Key Features

### 1. Lexical Analysis (The Scanner)
[cite_start]The first phase of the compiler reads the source code (character stream) and converts it into a sequence of meaningful **Tokens**[cite: 495].
* **Token Recognition:** Identifies specific language elements including:
    * [cite_start]**Keywords:** `int`, `char`, `main`, `switch`, `case`, `printf`[cite: 513, 594].
    * [cite_start]**Operators:** `+`, `-`, `*`, `/`, `%`, `=`[cite: 517, 598].
    * [cite_start]**Delimiters:** `{`, `}`, `(`, `)`, `;`[cite: 530, 597].
    * [cite_start]**Identifiers:** Variable names (e.g., `x`, `y`, `sol`)[cite: 515, 550].
* [cite_start]**Output:** Generates a list of tokens classified by their type (e.g., `integer`, `Keywords`, `Delimiter`)[cite: 541].

### 2. Syntax Analysis (The Parser)
[cite_start]The second phase verifies if the sequence of tokens forms a valid expression based on the language's grammar[cite: 640].
* [cite_start]**LL(1) Algorithm:** Implements a Top-Down parsing method using a Stack and a Parsing Table[cite: 648, 649].
* [cite_start]**Parse Table:** Utilizes a 2D array matrix to define grammar rules and production checks[cite: 653, 658].
* **Validation:**
    * [cite_start]**Accepted:** If the stack is empty and the input string is fully traversed (reaches `$`)[cite: 669].
    * [cite_start]**Rejected:** Displays error messages if the token sequence violates the grammar rules[cite: 645, 665].

## 🛠️ Technical Stack
* [cite_start]**Programming Language:** Java[cite: 460].
* [cite_start]**Core Logic:** Stack Data Structure (`java.util.Stack`) for parsing and `ArrayList` for token management[cite: 656, 313].
* [cite_start]**I/O:** `BufferedReader` and `BufferedWriter` for reading source files and writing outputs[cite: 531].

### 🧠 Core Logic & Algorithms

#### Lexical Logic
[cite_start]The scanner reads the file line-by-line and splits the text using whitespace delimiters[cite: 583, 584]. [cite_start]It compares each extracted word against pre-defined lists of **Keywords**, **Operators**, and **Delimiters**[cite: 594, 597, 598]. [cite_start]If no match is found among these categories, the scanner treats the word as an **Identifier**[cite: 605, 611].

#### LL(1) Parsing Logic
* [cite_start]**Initialization:** The stack is initialized by pushing the Start Symbol (e.g., `E`) [cite: 662][cite_start], and the input string is appended with the `$` character to mark the end of the stream[cite: 657].
* [cite_start]**Iteration:** The parser continuously compares the **Top of the Stack** with the **Current Input Token**[cite: 663]:
    * [cite_start]**If Top is Non-Terminal:** It looks up the corresponding production rule in the Parsing Table (`table[][]`) [cite: 664] [cite_start]and pushes the rule onto the stack in **reverse order**[cite: 661].
    * [cite_start]**If Top is Terminal:** It checks for a match with the current input token[cite: 665].
        * [cite_start]*Match:* It advances to the next token[cite: 666].
        * [cite_start]*Mismatch:* It reports a syntax error[cite: 665].

## 🚀 Getting Started

### Prerequisites
* Java Development Kit (JDK) installed.
* An IDE like IntelliJ IDEA or Eclipse, or a simple command-line interface.

### Installation & Execution
1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/Maryam-Hussein/Assembler-Simulator.git](https://github.com/Maryam-Hussein/Assembler-Simulator.git)
    ```
2.  **Prepare Source File:**
    * Ensure `Source program.txt` exists in the directory. This file contains the code you want to compile[cite: 581].
3.  **Run the Application:**
    * Compile and run `Main.java`.
    * The program will first execute the **Lexical Analysis**, identifying words and generating `Syntax.txt`[cite: 578].
    * It will then trigger the **LL(1) Parser** to validate the syntax[cite: 486].

## 📂 Repository Structure

```text
├── Main.java       # Entry point, orchestrates Lexical and Syntax phases [cite: 463]
├── Lexical.java    # Reads source code and generates token lists [cite: 307]
├── LL1.java        # Contains the Parsing Algorithm and Grammar Table [cite: 656]
├── Syntax.txt      # Intermediate output generated by the Lexical phase [cite: 531]
└── README.md       # Project Documentation
