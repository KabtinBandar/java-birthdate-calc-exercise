# Java Birthdate & Age Calculator

![Java](https://img.shields.io/badge/Language-Java%20SE-ED8B00?logo=openjdk&logoColor=white)
![Build](https://img.shields.io/badge/Build-Apache%20Ant%20%2F%20NetBeans-E05D44)
![License](https://img.shields.io/badge/License-MIT-green)

A lightweight Java application and Apache Ant / NetBeans project demonstrating file stream processing, date parsing (`SimpleDateFormat`), and calendar boundary arithmetic to calculate chronological age from file-persisted birthdates.

---

## Technical Overview

The application demonstrates fundamental Java SE patterns:
- **I/O File Streaming:** Reads persisted date strings from `File.txt` using buffered character readers (`BufferedReader`, `FileReader`) with resource management.
- **Date Parsing & Formatting:** Formats and validates calendar inputs using `SimpleDateFormat("dd/MM/yyyy")` with checked exception handling (`ParseException`).
- **Calendar Boundary Arithmetic:** `calculateAge(Date birthday)` computes exact completed years, adjusting for month differences and day-of-month boundaries.

---

## Project Structure

```
java-birthdate-calc-exercise/
├── src/
│   └── exam/
│       └── Exam.java          # Core execution logic & age calculation algorithm
├── File.txt                   # Input data file containing target birthdate
├── build.xml                  # Apache Ant build script
└── nbproject/                 # NetBeans project configuration metadata
```

---

## Getting Started

### Prerequisites
- Java Development Kit (JDK 8 or higher)
- Apache Ant or NetBeans IDE (optional)

### Compilation & Execution via Terminal

```bash
# Compile
javac -d bin src/exam/Exam.java

# Run (ensure File.txt is in the working directory)
java -cp bin exam.Exam
```

### Sample Output

```text
Your age is: 20 years
```

---

## Author & License

- **Developer:** Hossam Ahmed ([@HossamAhmedSoft](https://github.com/HossamAhmedSoft))
- **License:** MIT
