package itTeam;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        List<Employee> employees = new ArrayList<>();
        TaskProgressCallback callback = new CallbackImpl(factory);
        employees.add(new Designer(callback, "Alice"));
        employees.add(new Programmer(new TaskProgressCallback() {
            @Override
            public void updateTasks(Task oldTask, Task newTask) {
                System.out.println("Programmer updateTask");
            }
        }, "Nick"));
        employees.add(new Tester(callback, "Sam"));
        factory.addEmployees(employees);
        factory.start();
    }
}
