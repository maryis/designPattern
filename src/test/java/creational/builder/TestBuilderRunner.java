package creational.builder;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestBuilderRunner {

    public static void main(String[] args) {

        Result r= JUnitCore.runClasses(TestBuilder.class);

        for (Failure failure : r.getFailures()) {
            System.out.println(failure.getDescription());
            System.out.println(failure.getMessage());

        }

        System.out.println("\nisSuccessful:"+r.wasSuccessful());
        System.out.println("no of fails:"+r.getFailureCount());

    }
}
