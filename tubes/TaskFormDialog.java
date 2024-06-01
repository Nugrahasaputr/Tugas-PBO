/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TaskFormDialog extends JDialog {
    private JTextField titleField;
    private JTextArea descriptionArea;
    private JSpinner dateSpinner;
    private JComboBox<String> priorityComboBox;
    private JComboBox<String> statusComboBox;
    private boolean okPressed = false;
    private Task task;

    public TaskFormDialog(JFrame parent) {
        super(parent, "Add Task", true);
        initialize();
    }

    public TaskFormDialog(JFrame parent, Task task) {
        super(parent, "Edit Task", true);
        this.task = task;
        initialize();

        // Mengisi form dengan informasi tugas yang akan diedit
        titleField.setText(task.getTitle());
        descriptionArea.setText(task.getDescription());
        dateSpinner.setValue(task.getDeadline());
        priorityComboBox.setSelectedItem(task.getPriority());
        statusComboBox.setSelectedItem(task.getStatus());
    }

    private void initialize() {
        JPanel panel = new JPanel(new GridLayout(6, 2));

        panel.add(new JLabel("Task Title:"));
        titleField = new JTextField();
        panel.add(titleField);

        panel.add(new JLabel("Description:"));
        descriptionArea = new JTextArea();
        panel.add(new JScrollPane(descriptionArea));

        panel.add(new JLabel("Deadline:"));
        dateSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpinner, "yyyy-MM-dd");
        dateSpinner.setEditor(dateEditor);
        panel.add(dateSpinner);

        panel.add(new JLabel("Priority:"));
        priorityComboBox = new JComboBox<>(new String[]{"High", "Medium", "Low"});
        panel.add(priorityComboBox);

        panel.add(new JLabel("Status:"));
        statusComboBox = new JComboBox<>(new String[]{"Not Started", "In Progress", "Completed"});
        panel.add(statusComboBox);

        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                okPressed = true;
                dispose();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        panel.add(okButton);
        panel.add(cancelButton);

        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);
    }

    public boolean isOkPressed() {
        return okPressed;
    }

    public Task getTask() {
        String title = titleField.getText();
        String description = descriptionArea.getText();
        Date deadline = (Date) dateSpinner.getValue();
        String priority = (String) priorityComboBox.getSelectedItem();
        String status = (String) statusComboBox.getSelectedItem();

        if (task != null) {
            task.setTitle(title);
            task.setDescription(description);
            task.setDeadline(deadline);
            task.setPriority(priority);
            task.setStatus(status);
            return task;
        } else {
            return new Task(title, description);
                    }
    }
}

