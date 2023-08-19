import java.sql.*;
import java.util.*;

public class Demo {
	public static void main(String[] args) throws Exception {
		while (true) {
			System.out.println("0: Exit");
			System.out.println("1: Add student");
			System.out.println("2: Update marks");
			System.out.println("3: Delete student");
			System.out.println("4: List students");
			System.out.println("Enter choice: (0-4)");

			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			switch (ch) {
				case 0: DBUtils.closeConnection(); System.exit(0); break;
				case 1: 
					System.out.print("Enter ID:");
					int id = sc.nextInt();
					
					System.out.println("Enter Name:");
					String name = sc.next();
					
					System.out.println("Enter Marks:");
					float marks = sc.nextFloat();
					
					StudentCRUD.addStudent(id, name, marks);
					break;
				case 2: break;
				case 3: break;
				case 4:
					List<Student> list = StudentCRUD.listStudents();
					System.out.println(list);
				break;
				default: System.out.println("Invalid choice");
			}
		}
	}
}








