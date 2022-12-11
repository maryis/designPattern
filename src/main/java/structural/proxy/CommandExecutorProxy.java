package structural.proxy;

import java.util.HashSet;
import java.util.Set;

public class CommandExecutorProxy implements CommandExecutor{
    private static final Set<String> forbidden = new HashSet<>();
    CommandExecutor commandExecutor = new CommandExecutorImpl();

    static {
        forbidden.add("delete");
        forbidden.add("update");
    }

    @Override
    public void execute(String command) {
        if(forbidden.contains(command))
            throw new RuntimeException("You are not allowed");
        commandExecutor.execute(command);
    }
}
