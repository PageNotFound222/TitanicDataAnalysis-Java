# Titanic Data Analysis in Java

This is a simple beginner-level Java project that analyzes the Titanic dataset (`train.csv`) using **Object-Oriented Programming (OOP)** and **basic file handling**.  
It reads passenger data, calculates survival statistics, and prints results to the console.

---

## Project Overview
This project helped me understand:
- How to **read CSV files** in Java
- How to use **classes and objects** (Encapsulation)
- How to **store data in ArrayLists**
- How to perform **basic data analysis** using loops and conditions

---

## Files in the Project
| File | Description |
|------|--------------|
| `Passenger.java` | Defines the Passenger class with attributes and getter methods. |
| `Main.java` | Reads the dataset, stores passengers, and performs analysis. |
| `train.csv` | The Titanic dataset used for testing. |

---

## What the Code Does
1. Reads data from `train.csv`
2. Creates `Passenger` objects for each record
3. Calculates:
   - Total number of passengers  
   - Total survivors  
   - Male vs Female survival count  
4. Prints all results in the console

---

## Example Output
Total passengers: 891
Total survivors: 342
Male survivors: 109
Female survivors: 233


---

## How to Run
1. Clone or download this repository  
2. Make sure `train.csv`, `Passenger.java`, and `Main.java` are in the same folder  
3. Open the folder in **VS Code** (with Java extensions installed)  
4. Run `Main.java`

---

## Credits
Based on a guided example used for learning **Encapsulation, File Handling**, and **OOP in Java**.  
Modified and debugged by **Archius** as a learning project.

---

## Future Improvements
- Add average age and class-wise survival stats  
- Export analysis results to a text or CSV file  
- Use charts or graphs (maybe with a Java library)

