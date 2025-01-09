# Java ToDo List

| Classes  | Members               | Methods                              | Scenarios                                      | Outputs                         |
|----------|-----------------------|--------------------------------------|------------------------------------------------|---------------------------------|
| Task     | String taskName       | String getTaskName()                 | Returns name                                   | this.taskName                   |
|          | boolean isCompleted   | boolean getIsCompleted()             | Returns isCompleted                            | this.isCompleted                |
|          |                       |                                      |                                                |                                 |
|          |                       |                                      |                                                |                                 |
|          |                       |                                      |                                                |                                 |
|          |                       |                                      |                                                |                                 |
|          |                       |                                      |                                                |                                 |
| TodoList | ArrayList<Task> tasks | boolean addTask(Task task)           | Successfully adds task at the end of tasks     | true                            |
|          |                       |                                      | Is unable to add the task                      | false                           |
|          |                       | void printTasks()                    | prints the list of tasks to the terminal       |                                 |
|          |                       | boolean changeStatus(Task task)      | The task exists in tasks and is updated        | true                            |
|          |                       |                                      | The task does not exist and can't be updated   | false                           |
|          |                       | ArrayList<Task> getCompleteTasks()   | Filters complete tasks in a new list           | ArrayList<Task> completeTasks   |
|          |                       | ArrayList<Task> getIncompleteTasks() | Filters incomplete tasks in a new list         | ArrayList<Task> incompleteTasks |
|          |                       | Task getTask(Task task)              | Task exists and the user is informed           | task                            |
|          |                       |                                      | Task doesn't exist, and the user is informed   | null                            |
|          |                       | boolean removeTask(Task task)        | Task exists, and is successfully deleted       | true                            |
|          |                       |                                      | Task doesn't exists, and thus can't be deleted | false                           |
|          |                       | void printTasksAscending()           | prints tasks in ascending order                |                                 |
|          |                       | void printTasksDescending()          | prints tasks in descending order               |                                 |
|          |                       |                                      |                                                |                                 |
|          |                       |                                      |                                                |                                 |
