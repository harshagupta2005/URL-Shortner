URL Shortner (Java Project)

This is a simple Java project that takes a long website link (URL) and turns it into a short, easy-to-share link.  
When you open the short link, it redirects you to the original website.

---
 Features
- Converts long links into short links
- Short link redirects to the original website
- Easy to use from the console or GUI
- Can be improved to store and retrieve URLs

---

 Project Structure
URLShortner/
│
├── src/
│ └── Main.java # Main Java program
├── .gitignore # Files to ignore in Git
└── README.md # This file

---

 How to Run the Project
 1. Download or Clone the Project
```bash
git clone https://github.com/harshagupta2005/URLShortner.git
cd URLShortner
Compile the Java File
javac src/Main.java

3. Run the Java Program
java -cp src Main

Example Output
Enter a long URL: https://www.example.com/very/long/link
Shortened URL: http://short.ly/abc123

Technology Used

Language: Java

IDE: VS Code / IntelliJ IDEA / Eclipse

Libraries: Core Java (no external dependencies)

Future Improvements

Add a database to store URLs

Create a web interface

Track how many times a short link is opened

