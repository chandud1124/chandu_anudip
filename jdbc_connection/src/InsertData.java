import java.sql.*;

public class InsertData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/anpd3911";
        String user = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to database successfully!");

            // Insert Students
            String insertStudent = "INSERT INTO Student (studentId, FirstName, LastName, DateOfBirth, Gender, Email, Phone, address) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertStudent);

            pstmt.setString(1, "S001");
            pstmt.setString(2, "Rajesh");
            pstmt.setString(3, "Kumar");
            pstmt.setString(4, "2000-05-15");
            pstmt.setString(5, "Male");
            pstmt.setString(6, "rajesh@example.com");
            pstmt.setString(7, "9876543210");
            pstmt.setString(8, "123 Main Street");
            pstmt.executeUpdate();

            pstmt.setString(1, "S002");
            pstmt.setString(2, "Priya");
            pstmt.setString(3, "Singh");
            pstmt.setString(4, "2001-03-20");
            pstmt.setString(5, "Female");
            pstmt.setString(6, "priya@example.com");
            pstmt.setString(7, "9876543211");
            pstmt.setString(8, "456 Oak Avenue");
            pstmt.executeUpdate();

            pstmt.setString(1, "S003");
            pstmt.setString(2, "Amit");
            pstmt.setString(3, "Patel");
            pstmt.setString(4, "2002-07-10");
            pstmt.setString(5, "Male");
            pstmt.setString(6, "amit@example.com");
            pstmt.setString(7, "9876543212");
            pstmt.setString(8, "789 Pine Road");
            pstmt.executeUpdate();

            System.out.println("✅ 3 Students inserted!");

            // Insert Instructors
            String insertInstructor = "INSERT INTO Instructor (InstructorID, Email, FirstName, LastName) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(insertInstructor);

            pstmt.setString(1, "I001");
            pstmt.setString(2, "john@university.edu");
            pstmt.setString(3, "John");
            pstmt.setString(4, "Smith");
            pstmt.executeUpdate();

            pstmt.setString(1, "I002");
            pstmt.setString(2, "sarah@university.edu");
            pstmt.setString(3, "Sarah");
            pstmt.setString(4, "Johnson");
            pstmt.executeUpdate();

            System.out.println("✅ 2 Instructors inserted!");

            // Insert Courses
            String insertCourse = "INSERT INTO Course (CourseID, CourseTitle, Credits) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(insertCourse);

            pstmt.setString(1, "C001");
            pstmt.setString(2, "Java Programming");
            pstmt.setInt(3, 3);
            pstmt.executeUpdate();

            pstmt.setString(1, "C002");
            pstmt.setString(2, "Database Design");
            pstmt.setInt(3, 4);
            pstmt.executeUpdate();

            pstmt.setString(1, "C003");
            pstmt.setString(2, "Web Development");
            pstmt.setInt(3, 3);
            pstmt.executeUpdate();

            System.out.println("✅ 3 Courses inserted!");

            // Insert Enrollments
            String insertEnrollment = "INSERT INTO Enrollment (EnrollmentID, StudentID, CourseID, InstructorID) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(insertEnrollment);

            pstmt.setString(1, "E001");
            pstmt.setString(2, "S001");
            pstmt.setString(3, "C001");
            pstmt.setString(4, "I001");
            pstmt.executeUpdate();

            pstmt.setString(1, "E002");
            pstmt.setString(2, "S002");
            pstmt.setString(3, "C002");
            pstmt.setString(4, "I002");
            pstmt.executeUpdate();

            pstmt.setString(1, "E003");
            pstmt.setString(2, "S003");
            pstmt.setString(3, "C003");
            pstmt.setString(4, "I001");
            pstmt.executeUpdate();

            System.out.println("✅ 3 Enrollments inserted!");

            // Insert Scores
            String insertScore = "INSERT INTO Score (ScoreID, studentID, CourseID, CreditObtained, DateOfExam) VALUES (?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(insertScore);

            pstmt.setString(1, "SC001");
            pstmt.setString(2, "S001");
            pstmt.setString(3, "C001");
            pstmt.setString(4, "A");
            pstmt.setString(5, "2024-01-15");
            pstmt.executeUpdate();

            pstmt.setString(1, "SC002");
            pstmt.setString(2, "S002");
            pstmt.setString(3, "C002");
            pstmt.setString(4, "A+");
            pstmt.setString(5, "2024-01-20");
            pstmt.executeUpdate();

            pstmt.setString(1, "SC003");
            pstmt.setString(2, "S003");
            pstmt.setString(3, "C003");
            pstmt.setString(4, "B");
            pstmt.setString(5, "2024-01-25");
            pstmt.executeUpdate();

            System.out.println("✅ 3 Scores inserted!");

            pstmt.close();
            conn.close();

            System.out.println("\n✅ ALL DATA INSERTED SUCCESSFULLY! ✅");

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
