package itTeam;

public class Main {
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        TaskProgressCallback callback = new CallbackImpl(factory);

        EmployeeChain chain = new EmployeeChain(
                new EmployeeChain(
                        new Designer(callback, "Alisa"),
                        new Programmer(callback, "Alex")
                ),
                new Tester(callback, "Sam")
        );

        while (true) {
            if (!chain.doTask(factory.getTask()))
                break;
        }
    }
}
