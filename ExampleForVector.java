import java.util.Vector;
	class Student {
	    int studentId;
	    String studentName;
	    String studentEmail;   
	    Student(int studentId, String studentName, String studentEmail) {
	        this.studentId = studentId;
	        this.studentName = studentName;
	        this.studentEmail = studentEmail;
	    }
	    void display() {
	        System.out.println("ID: " + studentId + ", Name: " + studentName +
	                           ", Email: " + studentEmail);
	    }
	}

	public class ExampleForVector {
	    public static void main(String[] args) {

	      
	        Vector<Student> students = new Vector<>();
	        students.add(new Student(101, "Gangadhar", "gangadhar@gmail.com"));
	        students.add(new Student(102, "Anita", "anita@gmail.com"));
	        students.add(new Student(103, "Kiran", "kiran@gmail.com")); 
	        for (Student s : students) {
	            s.display();
	        }
	    }
	}