import java.sql.*;

public class TransactionDemo {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:bank.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            conn.setAutoCommit(false);

            try (PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                 PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?")) {

                debit.setDouble(1, 100);
                debit.setInt(2, 1);
                debit.executeUpdate();

                credit.setDouble(1, 100);
                credit.setInt(2, 2);
                credit.executeUpdate();

                conn.commit();
                System.out.println("Transaction successful");

            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Transaction failed, rolled back: " + e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }
}
