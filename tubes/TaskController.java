/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TaskController {
    private TaskView view;
    private TaskModel model;

    public TaskController(TaskView view, TaskModel model) {
        this.view = view;
        this.model = model;

        // Add action listeners
        view.addAddTaskListener(new AddTaskListener());
        view.addEditTaskListener(new EditTaskListener());
        view.addDeleteTaskListener(new DeleteTaskListener());

        // Update view with initial data from database
        updateTaskTable();
        view.setVisible(true);
    }

    // Listener for adding a task
    class AddTaskListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String title = view.getTaskTitle();
            String description = view.getTaskDescription();
            Task task = new Task(title, description);
            model.addTask(task);
            updateTaskTable();
        }
    }

    // Listener for editing a task
    class EditTaskListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedRow = view.getSelectedTaskRow();
            if (selectedRow != -1) {
                String title = view.getTaskTitle();
                String description = view.getTaskDescription();
                int taskId = (int) view.getTaskTable().getValueAt(selectedRow, 0);
                Task task = new Task(title, description);
                model.updateTask(task);
                updateTaskTable();
            }
        }
    }

    // Listener for deleting a task
    class DeleteTaskListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedRow = view.getSelectedTaskRow();
            if (selectedRow != -1) {
                int taskId = (int) view.getTaskTable().getValueAt(selectedRow, 0);
                model.deleteTask(taskId);
                updateTaskTable();
            }
        }
    }

    // Method to update task table with data from the database
    private void updateTaskTable() {
        List<Task> tasks = model.getAllTasks();
        view.updateTaskTable(tasks);
    }
}
