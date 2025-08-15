URL Shortener (Java)

A simple URL shortening tool built in Java. This project takes a long URL and converts it into a shorter, easy-to-share version using the TinyURL API.
 Features

Shorten any valid URL in seconds.

Written in pure Java — no heavy frameworks.

Uses java.net for network calls.

Easy to integrate into other Java applications.

🛠 Prerequisites

Before running this project, make sure you have:

Java JDK 8 or higher installed.

An internet connection (to access the TinyURL API).

How to Run

Clone the repository

git clone https://github.com/harshagupta2005/URL-Shortener-Java


Navigate to the project folder

cd URL-Shortener-Java


Compile the Java file

javac URLShortener.java


Run the program

java URLShortener


Enter your long URL when prompted, and get the shortened version instantly.
 Example Output
Enter the URL: https://www.example.com/very/long/url/path  
Shortened URL: https://tinyurl.com/abc12Libraries Used

java.net.HttpURLConnection → To make HTTP requests.

java.io.BufferedReader → To read API responsFuture Improvements

Add a GUI with Java Swing or JavaFX.

Add support for multiple URL shortening services.

Store and retrieve shortened URLs from a local database.


