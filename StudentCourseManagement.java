package m5.activity3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StudentCourseManagement {

	private static final String URL = "jdbc:postgresql://localhost:5432/training_db";
	private static final String USER = "jcmborlagdan";
	private static final String PASSWORD = "postgres";
	private static int option;
	
	private static Logger logger = LoggerFactory.getLogger(StudentCourseManagement.class);
	
	public static void main(String[] args) throws Exception{
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		PreparedStatement ps = null;
	try {
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
		System.out.println("Connected to PostgreSQL successfully.\n");

		start(conn, rs, stmt, ps);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}

	private static void start(Connection conn, ResultSet rs, Statement stmt, PreparedStatement ps) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while (option != 5) {
			
		try {
			System.out.println("===================================");
			System.out.println("==   STUDENT COURSE MANAGEMENT   ==");
			System.out.println("===================================");
			System.out.println("[1] ADD A STUDENT");
			System.out.println("[2] ADD A COURSE");
			System.out.println("[3] DISPLAY ALL STUDENTS");
			System.out.println("[4] DISPLAY ALL COURSES");
			System.out.println("[5] EXIT");
			System.out.print("ENTER OPTION: ");
			option = input.nextInt();
			input.nextLine();
			
			switch (option) {
				case 1:
					addStudent(conn, ps, input);
					break;
				case 2:
					addCourse(conn, ps, input);
					break;
				case 3:
					viewStudentRecords(conn, rs, stmt);
					break;
				case 4:
					viewCoursesRecords(conn, rs, stmt);
					break;
				case 5:
					conn.close();
					logger.info("Program terminated.");
					break;
				default:
					throw new Exception("Invalid option. Please try again.\n");
			}
		} catch (InputMismatchException e) {
			logger.info("Invalid input; should be numeric.");
			input.nextLine();
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		}
		System.exit(0);
	}

	private static void addStudent(Connection conn, PreparedStatement ps, Scanner input) {
		// TODO Auto-generated method stub
		try {
			
			String studname, studemail;
			int studage;
			
			System.out.print("Enter Name: ");
			studname = input.nextLine();
			
			System.out.print("Enter Age: ");
			studage = input.nextInt();
			input.nextLine();
			
			System.out.print("Enter Email: ");
			studemail = input.nextLine();
			
			ps = conn.prepareStatement("INSERT INTO STUDENTS (NAME, AGE, EMAIL) VALUES (?, ?, ?)");
			ps.setString(1, studname);
			ps.setInt(2, studage);
			ps.setString(3, studemail);
		
			ps.executeUpdate();
		
			logger.info("Enrolled a student.");
			
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void addCourse(Connection conn, PreparedStatement ps, Scanner input) {
		// TODO Auto-generated method stub
		try {
			
			String coursename;
			int studid, studgrade;
			
			System.out.print("Enter Course: ");
			coursename = input.nextLine();
			
			System.out.print("Enter Grade: ");
			studgrade = input.nextInt();
			
			System.out.print("Enter Student ID: ");
			studid = input.nextInt();
			input.nextLine();
			
			ps = conn.prepareStatement("INSERT INTO COURSES (STUDENT_ID, COURSE_NAME, GRADE) VALUES (?, ?, ?)");
			ps.setInt(1, studid);
			ps.setString(2, coursename);
			ps.setInt(3, studgrade);
		
			ps.executeUpdate();
		
			logger.info("Added a course.");
			
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void viewStudentRecords(Connection conn, ResultSet rs, Statement stmt) {
		// TODO Auto-generated method stub
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM students");
			
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String age = rs.getString("age");
				String email = rs.getString("email");
				System.out.println(id + " | " + name + " | " + age + " | " + email);
			}
			
			rs.close();
			stmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void viewCoursesRecords(Connection conn, ResultSet rs, Statement stmt) {
		// TODO Auto-generated method stub
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM STUDENTS, COURSES;");
			
			while (rs.next()) {
				String id = rs.getString("id");
				String course_name = rs.getString("course_name");
				String grade = rs.getString("grade");
				String student_name = rs.getString("name");
				String student_id = rs.getString("student_id");
				if (student_id.equals(id)) {
					System.out.println(id + " | " + course_name + " | " + grade + " | " + student_name);
				}
			}
			
			rs.close();
			stmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

