/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public class TaskView extends JFrame {
    private DefaultTableModel tableModel;
    private JTable taskTable;
    private JTextField titleField;
    private JTextArea descriptionArea;

    public TaskView() {
        setTitle("Task Manager");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Create components
        JPanel panel = new JPanel(new BorderLayout());
        tableModel = new DefaultTableModel(new String[]{"ID", "Title", "Description"}, 0);
        taskTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(taskTable);
        JPanel formPanel = new JPanel(new GridLayout(3, 2));
        JLabel titleLabel = new JLabel("Title:");
        titleField = new JTextField();
        JLabel descriptionLabel = new JLabel("Description:");
        descriptionArea = new JTextArea();
        JButton addButton = new JButton("Add");
        JButton editButton = new JButton("Edit");
        JButton deleteButton = new JButton("Delete");

        // Add components to panels
        formPanel.add(titleLabel);
        formPanel.add(titleField);
        formPanel.add(descriptionLabel);
        formPanel.add(descriptionArea);
        formPanel.add(addButton);
        formPanel.add(editButton);
        formPanel.add(deleteButton);

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(formPanel, BorderLayout.SOUTH);

        // Add panel to frame
        add(panel);
    }

    // Method to update task table with data from the database
    public void updateTaskTable(List<Task> tasks) {
        tableModel.setRowCount(0); // Clear table
        for (Task task : tasks) {
            tableModel.addRow(new Object[]{task.getId(), task.getTitle(), task.getDescription()});
        }
    }

    // Method to get the ID of the selected task in the table
    public int getSelectedTaskRow() {
        return taskTable.getSelectedRow();
    }

    // Method to get the title from the input field
    public String getTaskTitle() {
        return titleField.getText();
    }

    // Method to get the description from the text area
    public String getTaskDescription() {
        return descriptionArea.getText();
    }

    // Method to add action listener for add task button
    public void addAddTaskListener(ActionListener listener) {
        // addButton.addActionListener(listener);
    }

    // Method to add action listener for edit task button
    public void addEditTaskListener(ActionListener listener) {
        // editButton.addActionListener(listener);
    }

    // Method to add action listener for delete task button
    public void addDeleteTaskListener(ActionListener listener) {
        // deleteButton.addActionListener(listener);
    }

    Object getTaskTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
