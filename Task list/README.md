### Description
This Java program includes two main classes: `Task` and `TaskListApp`.

#### Task Class
- **Attributes**:
  - `ArrayList<String> tasks`: Stores the list of tasks.
- **Methods**:
  - `addTask(String name)`: Adds a new task to the list and prints a confirmation message.
  - `removeTask(int taskNumber)`: Removes a task based on its position in the list, if the task number is valid.
  - `listTasks()`: Prints all tasks in the list with their respective numbers.
  - `isEmpty()`: Checks if the task list is empty.
  - `isValidNumber(int taskNumber)`: Validates if a given task number is within the bounds of the task list.
 **Switch Statement**:
 **Case 1**: Add Task
   Calls `getName(scan)` to get the task name from the user.
   Calls `task.addTask(taskName)` to add the task to the list.
 **Case 2**: Remove Task
   Checks if the task list is not empty using `task.isEmpty()`.
    If not empty, calls `task.listTasks()` to display tasks.
   Calls `getInput(scan)` to get the task number to remove.
            - Validates the task number with `task.isValidNumber(taskNumber)`.
            - Calls `task.removeTask(taskNumber)` to remove the task if the number is valid.
        - **Case 3**: List Tasks
            - Checks if the task list is not empty using `task.isEmpty()`.
            - If not empty, calls `task.listTasks()` to display tasks.
        - **Case 4**: Quit
            - Closes the scanner and exits the program.
        - **Default**: Invalid Option
            - Prints an error message for invalid menu choices.

    **Programmed By** `pranai`
