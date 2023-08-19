import java.util.*;
import java.sql.*;

public class StudentCRUD {
	static void addStudent(int id, String name, float marks) throws SQLException {
		String query = "insert into student values(?,?,?)";
		Connection con = DBUtils.getDbConnection();
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setFloat(3, marks);
		ps.executeUpdate();
		System.out.println("Student record added");
	}

	static void deleteStudent() {}
	static void updaetStudentMarks() {}
	
	static List<Student> listStudents() throws SQLException {
		List list = new ArrayList<Student>();
		
		Connection con = DBUtils.getDbConnection();
		String query = "select * from student";
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			float marks = rs.getFloat("marks");
			Student s = new Student(id,name,marks);
			list.add(s);
		}
		return list;
	}
}
