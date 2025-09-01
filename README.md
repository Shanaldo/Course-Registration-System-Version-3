📚 Course Registration System
A robust, console-based Java application for managing students, courses, grades, and secure user authentication. The system provides multi-level menus for both Admins (full access) and Students (limited access), with strong security measures including password hashing, lockouts, and comprehensive account management.

✨ Features
🔑 Security & Authentication
SHA-256 password hashing (no plain-text storage)

Default student password = student ID with mandatory change at first login

Strong password enforcement (uppercase, lowercase, digit, special character, 8+ chars)

Account lockout after 5 failed login attempts (30 minute duration)

"Forgot Password" recovery option

👩‍💼 Admin Menu (Full Access)
Student Management: Add/Remove/Modify Students, View All Students, View Individual Student Details

Course Management: Add/Remove/Modify Courses, Enroll Students, Undo Last Registration, Display All Courses, View Course Details, Remove Students from courses/waitlists/priority queues

Grade Management: View Grades for a Course, Enter Grades for a Course, Modify a Student's Grade

Admin Management: Add/Remove/Modify Admins, Display All Admins, View Admin Details

🎓 Student Menu (Limited Access)
Enroll in Courses, View Enrolled Courses, Display All Courses

Undo Last Registration, Remove Course Enrollment

View Completed Courses, Failed Courses, Personal Details

View Course Grades, Waitlist Positions, Priority Queue Positions

🛠️ Technologies Used
Java 17+

Standard I/O (console-based menus)

File storage (.txt or .csv) for persistence

🚀 Getting Started
Prerequisites
Java JDK 17 or later

IDE (IntelliJ, Eclipse, or VS Code) or terminal

Installation & Execution
Clone the repository:

bash
git clone https://github.com/your-username/course-registration-system.git
Navigate to the project directory:

bash
cd course-registration-system
Compile the Java files:

bash
javac Main.java
Run the application:

bash
java Main
Default Login Credentials
Admin Access:

Username: Shanadlo Carty

Password: Cinnamon Bun

Adding a Student Example:

ID: 2100400

Name: John Doe

Email: john.doe@email.com

Default Login: username: John Doe / password: 2100400

📝 Future Enhancements
Student transcripts with GPA calculation

Email notifications (enrollment success, grade updates, waitlist changes)

Graphical User Interface (GUI)

Database support (MySQL/PostgreSQL)

👨‍💻 Author
Shanaldo Carty
Completed Date: June 20, 2025

⭐ Star this repository if you find it helpful!
