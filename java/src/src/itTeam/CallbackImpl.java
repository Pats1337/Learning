package itTeam;

public class CallbackImpl implements TaskProgressCallback {

    private final TaskFactory taskFactory;

    public CallbackImpl(TaskFactory taskFactory) {
        this.taskFactory = taskFactory;
    }

    @Override
    public void updateTasks(Task oldTask, Task newTask) {
        taskFactory.updateTasks(oldTask, newTask);
    }
}
