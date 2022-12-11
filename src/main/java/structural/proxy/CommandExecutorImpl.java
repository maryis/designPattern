package structural.proxy;

public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void execute(String command) {
        System.out.println("executed command");
    }
}
