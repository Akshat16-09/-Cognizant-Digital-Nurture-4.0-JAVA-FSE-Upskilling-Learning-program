import java.sql.*;

public class StudentDAO {
    private Connection conn;

    public StudentDAO() throws SQLException {
        conn = DriverManager.getConnection("jdbc:sqlite:students.db");
    }

    public void insertStudent(String name) throws SQLException {
        String sql = "INSERT INTO students(name) VALUES (?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
            System.out.println("Student inserted: " + name);
        }
    }

    public void updateStudent(int id, String newName) throws SQLException {
        String sql = "UPDATE students SET name = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newName);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Student updated: ID " + id + " to " + newName);
        }
    }

    public static void main(String[] args) {
        try {
            StudentDAO dao = new StudentDAO();
            dao.insertStudent("Charlie");
            dao.updateStudent(1, "Alicia");
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }
}
