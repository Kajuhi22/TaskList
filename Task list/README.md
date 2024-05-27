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
