📚 Course Registration System
A comprehensive Java-based course registration system with secure authentication, multi-level user access, and robust academic management capabilities. This console application provides administrators with full system control while offering students a streamlined interface for course enrollment and academic tracking.

✨ Features
🔐 Security & Authentication
SHA-256 Password Hashing - No plain-text credentials stored

Mandatory Password Reset - Required at first login for students

Password Policy Enforcement - Requires uppercase, lowercase, digit, special character, and minimum 8 characters

Account Lockout Mechanism - 30-minute lockout after 5 failed login attempts

Password Recovery System - Email-based verification with secure reset process

👨‍💼 Administrative Functions
Student Management - Complete CRUD operations for student records

Course Administration - Full course lifecycle management with enrollment controls

Academic Grading - Comprehensive grade entry, modification, and viewing system

Administrator Management - Role-based admin accounts with privilege controls

🎓 Student Portal
Course Enrollment - Register for courses with waitlist and priority queue support

Academic Records - View grades, completed courses, and academic performance

Registration Management - Modify enrollments with undo functionality

Position Tracking - Monitor waitlist and priority queue status

🛠️ Technical Architecture
Built With
Java 17+ - Utilizing modern language features and enhancements

File-Based Persistence - Serialized objects and CSV files for data storage

Console Interface - Intuitive menu-driven user experience

Modular Design - Separation of concerns with dedicated service layers

System Components
src/

model/ # Data entities (Student, Course, User)

service/ # Business logic and operations

security/ # Authentication and authorization

util/ # Utilities and helpers

Main.java # Application entry point

🚀 Installation & Setup
Prerequisites
Java Development Kit (JDK) 17 or later

Git version control system

Quick Start
Clone the repository:

git clone [https://github.com/your-username/course-registration-system.git](https://github.com/your-username/course-registration-system.git)
cd course-registration-system

Compile the application:

javac -d bin src/**/*.java

Execute the program:

java -cp bin Main

Default Credentials
Administrative Access:

Username: Shanaldo Carty

Password: Cinnamon Bun

Student Demonstration Account:

ID: 2100400

Name: John Doe

Default Password: 2100400 (requires reset at first login)

📖 Usage Guide
Administrator Workflow
Log in with administrative credentials

Navigate through the hierarchical menu system

Manage student records, courses, and academic data

Monitor system activity and user actions

Student Workflow
Authenticate with student credentials

Access personalized academic dashboard

Enroll in available courses

View academic progress and records

🔧 Configuration
Data Storage
The system uses multiple persistence mechanisms:

.dat files - Serialized objects for students, courses, and users

.csv files - Grade records and grading component definitions

Course-specific files - Waitlist and priority queue persistence

Security Settings
Security parameters are managed through the SecurityUtil class:

Password complexity requirements

Hashing algorithms

Login attempt thresholds

🧪 Testing
Run the test suite to verify functionality:

javac -d test-bin -cp bin test/**/*.java
java -cp "bin:test-bin" org.junit.runner.JUnitCore TestSuite

📈 System Architecture
Core Classes
Course: Manages course details, enrollment, waitlists, and grading components

Student: Handles student information, course registrations, and academic history

User: Manages authentication credentials and roles

CourseRegistrationSystem: Main controller class with business logic

SecurityUtil: Handles password hashing and validation

Design Patterns
Singleton Pattern: For system configuration and main controller

Factory Pattern: For object creation and persistence management

Observer Pattern: For notification systems

Strategy Pattern: For different user role behaviors

🚦 Future Enhancements
Planned Features
Transcript Generation - PDF report generation with GPA calculation

Email Integration - SMTP-based notifications for enrollment changes

Web Interface - Spring Boot-based REST API with React frontend

Database Migration - PostgreSQL integration for enterprise deployment

API Development - RESTful endpoints for system integration

Technical Roadmap
Docker containerization for simplified deployment

JUnit test coverage expansion

Performance optimization for large datasets

Role-based access control refinement

👥 Contributing
We welcome contributions to enhance the system:

Fork the repository

Create a feature branch (git checkout -b feature/amazing-feature)

Commit changes (git commit -m 'Add amazing feature')

Push to branch (git push origin feature/amazing-feature)

Open a Pull Request
Please read CONTRIBUTING.md for detailed guidelines.

📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

🛡️ Security
Report vulnerabilities or security concerns to:

Email: security@example.com

Policy: https://example.com/security

🤝 Support
For technical support or questions:

Create an issue on GitHub

Email: support@example.com

Documentation: https://docs.example.com/course-system

👨‍💻 Author
Shanaldo Carty - Initial development & architecture

Completed: June 20, 2025

Email: shanaldo-carty937@gmail.com

GitHub: @shanaldo-carty

🙏 Acknowledgments
Java Platform, Standard Edition Documentation

Cryptographic libraries for secure hashing implementation

Open-source community for best practices and patterns

<div align="center">
⭐ Please star this repository if you find it useful!
</div>
