# JDBC + MySQL Connection Guide

## 📚 Project Overview

This project demonstrates **Java Database Connectivity (JDBC)** with MySQL. It covers:
- Database connection setup
- Creating tables (DDL)
- Inserting data (DML)
- Querying data (SELECT)
- Working with ResultSets
- Scrollable ResultSets

---

## 🔧 Prerequisites

### 1. **MySQL Server Installation**
```bash
# Check if MySQL is installed
mysql --version

# Start MySQL (if not running)
brew services start mysql
```

### 2. **Java Development Kit (JDK)**
```bash
# Check Java version
java -version

# Should show Java 25 or higher
```

### 3. **MySQL JDBC Driver**
```bash
# Location: lib/mysql-connector-j-8.0.33.jar
# This JAR file is already in the project
```

---

## 🗄️ Database Setup

### Step 1: Create Database
```bash
# Connect to MySQL
mysql -u root

# Create database
mysql> CREATE DATABASE anpd3911;
mysql> USE anpd3911;
```

### Step 2: Create Tables
Tables created in the database:
- **Student** - Student information
- **Course** - Course details
- **Instructor** - Instructor information
- **Enrollment** - Student-Course-Instructor mapping
- **Score** - Student exam scores
- **users** - Sample table for basic operations

### Step 3: Verify Database
```bash
# Check if database exists
mysql -u root -e "SHOW DATABASES;"

# Check tables
mysql -u root anpd3911 -e "SHOW TABLES;"

# Check table structure
mysql -u root anpd3911 -e "DESC Student;"
```

---

## 🔌 Java JDBC Connection Setup

### Step 1: Import Required Classes
```java
import java.sql.*;
```

### Step 2: Load MySQL Driver
```java
Class.forName("com.mysql.cj.jdbc.Driver");
```

### Step 3: Create Connection
```java
String jdbcurl = "jdbc:mysql://localhost:3306/anpd3911";
String username = "root";
String password = "";  // Empty if no password set

Connection conn = DriverManager.getConnection(jdbcurl, username, password);
System.out.println("Connected to database!");
```

### Step 4: Create Statement and Execute Query
```java
Statement statement = conn.createStatement();
String sql = "SELECT * FROM Student";
ResultSet resultSet = statement.executeQuery(sql);

while(resultSet.next()) {
    String id = resultSet.getString("studentId");
    String name = resultSet.getString("FirstName");
    System.out.println(id + " : " + name);
}

resultSet.close();
statement.close();
conn.close();
```

---

## 📁 Project Structure

```
jdbc_connection/
├── src/
│   ├── ExampleForConnection.java          (Basic connection test)
│   ├── ExampleForStatement.java            (CREATE, INSERT, SELECT)
│   ├── ExampleOfResultset.java             (Iterate through results)
│   ├── ExampleForScrollableResultSet.java  (Navigate result set)
│   ├── ExampleForDDL.java                  (CREATE, ALTER, DROP)
│   └── InsertData.java                     (Populate all tables)
│
├── lib/
│   └── mysql-connector-j-8.0.33.jar        (MySQL JDBC Driver)
│
└── README.md                               (This file)
```

---

## 📋 Java Files Explanation

### 1. **ExampleForConnection.java**
**Purpose:** Test basic database connection

**What it does:**
- Loads MySQL driver
- Connects to database
- Prints success/error message

**Run:**
```bash
javac -cp lib/mysql-connector-j-8.0.33.jar src/ExampleForConnection.java
java -cp lib/mysql-connector-j-8.0.33.jar:src ExampleForConnection
```

**Output:**
```
✅ Connected to database successfully!
```

---

### 2. **ExampleForStatement.java**
**Purpose:** Demonstrate CREATE, INSERT, and SELECT operations

**What it does:**
- Creates a new `users` table
- Inserts 3 rows (Madhu, Vamsi, Iram)
- Retrieves and displays all data

**Run:**
```bash
javac -cp lib/mysql-connector-j-8.0.33.jar src/ExampleForStatement.java
java -cp lib/mysql-connector-j-8.0.33.jar:src ExampleForStatement
```

**Output:**
```
✅ Table created successfully
✅ 3 rows added successfully

📋 User Data:
ID: 1, Name: Madhu
ID: 2, Name: Vamsi
ID: 3, Name: Iram

✅ All operations completed successfully!
```

---

### 3. **ExampleOfResultset.java**
**Purpose:** Demonstrate iterating through ResultSet

**What it does:**
- Queries the `users` table
- Iterates through each row
- Displays ID and Name for each user

**Run:**
```bash
javac -cp lib/mysql-connector-j-8.0.33.jar src/ExampleOfResultset.java
java -cp lib/mysql-connector-j-8.0.33.jar:src ExampleOfResultset
```

**Output:**
```
📋 Fetching data from users table:
------------------------------------
ID : 1, Name : Madhu
ID : 2, Name : Vamsi
ID : 3, Name : Iram
------------------------------------
✅ ResultSet iteration completed!
```

---

### 4. **ExampleForScrollableResultSet.java**
**Purpose:** Navigate ResultSet using cursor methods

**What it does:**
- Queries Student table with scrollable ResultSet
- Demonstrates: `.last()`, `.first()`, `.absolute()`
- Shows how to jump to specific rows

**Run:**
```bash
javac -cp lib/mysql-connector-j-8.0.33.jar src/ExampleForScrollableResultSet.java
java -cp lib/mysql-connector-j-8.0.33.jar:src ExampleForScrollableResultSet
```

**Output:**
```
📋 Demonstrating Scrollable ResultSet:
=====================================

🔽 Last Student ID : S101, Name : Chandu D
🔼 First Student ID : S001, Name : Rajesh Kumar
📍 Absolute(3) Student ID : S003, Name : Amit Patel

✅ Scrollable ResultSet operations completed!
```

---

### 5. **ExampleForDDL.java**
**Purpose:** Demonstrate DDL operations (CREATE, ALTER, DROP)

**What it does:**
- Creates a new table
- Adds a column using ALTER
- Deletes the table using DROP

**Run:**
```bash
javac -cp lib/mysql-connector-j-8.0.33.jar src/ExampleForDDL.java
java -cp lib/mysql-connector-j-8.0.33.jar:src ExampleForDDL
```

**Output:**
```
📋 DDL Operations Demo:
=======================

✅ CREATE: Table 'user' created successfully!
✅ ALTER: Column 'email' added to table!
✅ DROP: Table 'user' dropped successfully!

🎯 All DDL operations completed successfully!
```

---

### 6. **InsertData.java**
**Purpose:** Populate all database tables with sample data

**What it does:**
- Inserts 3 students
- Inserts 2 instructors
- Inserts 3 courses
- Creates 3 enrollments
- Inserts 3 scores

**Run:**
```bash
javac -cp lib/mysql-connector-j-8.0.33.jar src/InsertData.java
java -cp lib/mysql-connector-j-8.0.33.jar:src InsertData
```

**Output:**
```
✅ Connected to database successfully!
✅ 3 Students inserted!
✅ 2 Instructors inserted!
✅ 3 Courses inserted!
✅ 3 Enrollments inserted!
✅ 3 Scores inserted!

✅ ALL DATA INSERTED SUCCESSFULLY! ✅
```

---

## 📊 Database Schema

### **Student Table**
```
+-----------+-------------+----------+---------------------+--------+------------------+
| studentId | FirstName   | LastName | DateOfBirth         | Gender | Email            |
+-----------+-------------+----------+---------------------+--------+------------------+
| S001      | Rajesh      | Kumar    | 2000-05-15          | Male   | rajesh@exam...   |
| S002      | Priya       | Singh    | 2001-03-20          | Female | priya@example.com|
| S003      | Amit        | Patel    | 2002-07-10          | Male   | amit@example.com |
| S101      | Chandu      | D        | 2002-05-14          | Male   | chandu@gmail.com |
+-----------+-------------+----------+---------------------+--------+------------------+
```

### **Course Table**
```
+----------+-----------------------+----------+
| CourseID | CourseTitle           | Credits  |
+----------+-----------------------+----------+
| C001     | Java Programming      | 3        |
| C002     | Database Design       | 4        |
| C003     | Web Development       | 3        |
+----------+-----------------------+----------+
```

### **Instructor Table**
```
+--------------+------------------+-----------+-----------+
| InstructorID | Email            | FirstName | LastName  |
+--------------+------------------+-----------+-----------+
| I001         | john@university. | John      | Smith     |
| I002         | sarah@university.| Sarah     | Johnson   |
+--------------+------------------+-----------+-----------+
```

### **Enrollment Table**
```
+--------------+-----------+----------+--------------+
| EnrollmentID | StudentID | CourseID | InstructorID |
+--------------+-----------+----------+--------------+
| E001         | S001      | C001     | I001         |
| E002         | S002      | C002     | I002         |
| E003         | S003      | C003     | I001         |
+--------------+-----------+----------+--------------+
```

### **Score Table**
```
+---------+-----------+----------+------------------+---------------------+
| ScoreID | studentID | CourseID | CreditObtained   | DateOfExam          |
+---------+-----------+----------+------------------+---------------------+
| SC001   | S001      | C001     | A                | 2024-01-15          |
| SC002   | S002      | C002     | A+               | 2024-01-20          |
| SC003   | S003      | C003     | B                | 2024-01-25          |
+---------+-----------+----------+------------------+---------------------+
```

### **users Table**
```
+----+--------+
| id | name   |
+----+--------+
| 1  | Madhu  |
| 2  | Vamsi  |
| 3  | Iram   |
+----+--------+
```

---

## 🔍 View All Data

```bash
# Connect to MySQL database
mysql -u root anpd3911

# View all students
SELECT * FROM Student;

# View all courses
SELECT * FROM Course;

# View all instructors
SELECT * FROM Instructor;

# View enrollments
SELECT * FROM Enrollment;

# View scores
SELECT * FROM Score;

# View users
SELECT * FROM users;

# Exit MySQL
exit
```

---

## 🚀 Quick Start Commands

### Terminal 1: Verify MySQL is running
```bash
mysql -u root -e "SHOW DATABASES;"
```

### Terminal 2: Compile and run Java programs
```bash
# Navigate to project
cd /Users/chandu/Project/github/chandu_anudip/jdbc_connection

# Test connection
javac -cp lib/mysql-connector-j-8.0.33.jar src/ExampleForConnection.java
java -cp lib/mysql-connector-j-8.0.33.jar:src ExampleForConnection

# Insert sample data
javac -cp lib/mysql-connector-j-8.0.33.jar src/InsertData.java
java -cp lib/mysql-connector-j-8.0.33.jar:src InsertData

# Run other examples
java -cp lib/mysql-connector-j-8.0.33.jar:src ExampleForStatement
java -cp lib/mysql-connector-j-8.0.33.jar:src ExampleOfResultset
java -cp lib/mysql-connector-j-8.0.33.jar:src ExampleForScrollableResultSet
java -cp lib/mysql-connector-j-8.0.33.jar:src ExampleForDDL
```

---

## 🛠️ Troubleshooting

### Error: "No suitable driver found"
**Solution:** Make sure MySQL driver JAR is in the classpath:
```bash
java -cp lib/mysql-connector-j-8.0.33.jar:src YourProgram
```

### Error: "Access denied for user 'root'"
**Solution:** Verify MySQL credentials in your Java code:
```java
String username = "root";
String password = "";  // Change if you set a password
```

### Error: "Table doesn't exist"
**Solution:** Run InsertData.java first to populate the database:
```bash
java -cp lib/mysql-connector-j-8.0.33.jar:src InsertData
```

### Error: "MySQL driver not found"
**Solution:** Make sure you have:
1. `lib/mysql-connector-j-8.0.33.jar` in the project
2. The correct classpath when compiling and running

---

## 📖 Key JDBC Concepts

| Concept | Description |
|---------|-------------|
| **Driver** | Software that allows Java to connect to database |
| **Connection** | Establishes link between Java and database |
| **Statement** | Used to execute SQL queries |
| **ResultSet** | Contains results from a query (like a table) |
| **PreparedStatement** | Safer way to execute queries with parameters |
| **DDL** | Data Definition Language (CREATE, ALTER, DROP) |
| **DML** | Data Manipulation Language (INSERT, UPDATE, DELETE) |
| **DQL** | Data Query Language (SELECT) |

---

## ✅ What We Accomplished

1. ✅ Set up MySQL database `anpd3911`
2. ✅ Created 6 tables with relationships
3. ✅ Downloaded MySQL JDBC driver
4. ✅ Created Java connection class
5. ✅ Demonstrated Statement execution
6. ✅ Showed ResultSet iteration
7. ✅ Demonstrated scrollable ResultSet
8. ✅ Showed DDL operations
9. ✅ Populated database with sample data
10. ✅ Verified all data in database

---

## 📚 Additional Resources

- [MySQL Documentation](https://dev.mysql.com/doc/)
- [JDBC API Documentation](https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html)
- [MySQL Connector/J Documentation](https://dev.mysql.com/doc/connector-j/8.0/en/)

---

## 🎯 Next Steps

You can now:
- Modify the Java programs to perform other operations
- Create your own tables and insert data
- Build more complex applications using JDBC
- Learn about PreparedStatements for safer queries
- Explore transactions and connection pooling

Happy coding! 🚀
