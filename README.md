# 📚 Study_Tracker
A Java-based console application that helps users track their daily study hours, compare them with a target goal, and maintain a record of their progress using file handling.
## 📌 Project Overview
Study_Tracker is designed to help students monitor their daily study habits. The application allows users to enter study hours, compare them with a target, and receive instant feedback on their performance. The study data is stored in a text file for future reference.
## 🚀 Features
1. Accepts daily study hours as input
2. Allows users to set a target study time
3. Compares actual study time with target time
4. Displays performance status:
- Below Target
- Target Achieved
- Above Target
5. Stores study records using file handling
6. Simple and user-friendly console interface
## ⚙️ How It Works
1. The user enters the number of hours studied.
2. The user enters the target study hours.
3. The application compares the study time with the target.
4. The result is displayed:
   - Study Time < Target → Below Target
   - Study Time = Target → Target Achieved
   - Study Time > Target → Above Target
5. The study data is saved in `day.txt`.
6. The user can track daily progress through stored records.
## 🛠️ Technologies Used
- Java
- Scanner Class
- Control Flow Statements (if-else)
- File Handling (`java.io`)
- VS Code
## 📂 Project Structure
Study_Tracker/
│
├── src/
│   └── StudyTracker.java
│
├── day.txt
│
├── README.md
│
├── bin/
│
└── lib/
## ▶️ How to Run
1. Open the project in VS Code.
2. Open the terminal.
3. Compile the program:

```bash
javac src/StudyTracker.java
```
4. Run the program:

```bash
java -cp src StudyTracker
```

---
## 📊 Sample Output

```text
Enter study hours: 3
Enter target hours: 4

Result: Below Target
```

---
## 🌟 Benefits

- Encourages consistent study habits
- Helps users monitor daily progress
- Works completely offline
- Lightweight and easy to use
- Beginner-friendly Java project
- Demonstrates practical use of file handling
##  Future Enhancements
- Daily reminders for missed study sessions
- Weekly and monthly progress reports
- Study streak tracking
- Graphical User Interface (GUI)
- Data visualization using charts
- Multiple user support
## 🎯 Learning Outcomes
Through this project, I learned:
- Java programming fundamentals
- Control flow statements
- User input handling
- File handling concepts
- Project organization
- Git and GitHub basics

## Author

**Jaahnavi Yaganti**  
B.Tech 3rd Year

---
