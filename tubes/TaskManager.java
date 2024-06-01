/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import javax.swing.SwingUtilities;

public class TaskManager {
    private TaskModel model;
    private TaskView view;
    private TaskController controller;

    public TaskManager(Connection connection) {
        this.model = new TaskModel(connection);
        this.view = new TaskView();
        this.controller = new TaskController(view, model);
    }

    public static void main(String[] args) {
        try {
            // Membuat koneksi ke database (misalnya menggunakan XAMPP)
            Connection connection = (Connection) DatabaseConnection.getConnection();

            // Menjalankan aplikasi dengan koneksi ke database
            SwingUtilities.invokeLater(() -> {
                TaskManager taskManager = new TaskManager(connection);
            });
        } catch (SQLException ex) {
            // Menangani pengecualian SQL
            ex.printStackTrace();
        }
    }
}
