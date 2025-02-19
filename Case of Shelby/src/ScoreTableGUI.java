import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class ScoreTableGUI extends JFrame {

    public ScoreTableGUI() {
        setTitle("Score Table");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create a DefaultTableModel with columns
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Player");
        model.addColumn("Time");

        // Connect to the database and retrieve data
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acccos", "root", "");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT userName, time FROM acc ORDER BY time");

            // Add data from the ResultSet to the table model
            while (rs.next()) {
                String userName = rs.getString("userName");
                int time = rs.getInt("time");
                model.addRow(new Object[]{userName, time});
            }

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        // Create the JTable with the model
        JTable table = new JTable(model);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        // Add scroll pane to the frame
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(ScoreTableGUI::new);
    }
}
