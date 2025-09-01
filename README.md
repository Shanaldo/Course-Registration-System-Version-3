**📚 Course Registration System**

A console-based Java application for managing students, courses, grades, and secure user authentication.
The system provides multi-level menus for both Admins (full access) and Students (limited access), with strong security measures like password hashing, lockouts, and account management.

**✨ Features**
**🔑 Security & Authentication**

SHA-256 password hashing (no plain-text storage)

Default student password = student ID

Password change required at first login

Strong password enforcement (uppercase, lowercase, digit, special character, 8+ chars)

5 failed login attempts = 30 min lockout

“Forgot Password” recovery option

**👩‍💼 Admin Menu (Full Access)**

**1. Student Management**

Add / Remove / Modify Students

View All Students

View Individual Student Details

**2. Course Management**

Add / Remove / Modify Courses

Enroll Students in Courses

Undo Last Registration

Display All Courses

View Course Details

Remove Students (from courses, waitlists, or priority queues)

View Waitlist by Course ID

View Priority List by Course ID

**3. Grade Management**

View Grades for a Course

Enter Grades for a Course

Modify a Student’s Grade

**4. Admin Management**

Add / Remove / Modify Admins

Display All Admins

View Admin Details

**🎓 Student Menu (Limited Access)**

Enroll in a Course

View Enrolled Courses

Display All Courses

Undo Last Registration

Remove Course Enrollment

View Completed Courses

View Failed Courses

View Personal Details

View Course Grades

View Waitlist Positions

View Priority Queue Positions

**🛠️ Technologies Used**

Java 17+

Standard I/O (console-based menus)

File storage (.txt or .csv) for persistence

**🚀 Getting Started**
Prerequisites

Java JDK 17 or later installed

IDE (IntelliJ, Eclipse, or VS Code) or terminal

Running the Program
javac Main.java
java Main

Default Admin Login

Username: Shanadlo Carty

Password: Cinnamon Bun

Adding a Student Example

ID: 2100400

Name: John Doe

Email: john.doe@email.com

Default Login → username: John Doe / password: 2100400

**📝 Future Enhancements**

Student transcripts (GPA calculation)

Email notifications (enrollment success, grade updates, waitlist changes)

Graphical User Interface (GUI)

Database support (MySQL/PostgreSQL)

**👨‍💻 Author**

Shanaldo Carty

Completed Date: June 20, 2025
