package behavioral.strategy;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
    public static void main(String[] args) {

        Result r= JUnitCore.runClasses(TestBuilder.class);

        r.getFailures().forEach(fail->{

            System.out.println(fail.getDescription());

        });

        System.out.println("number of run: "+r.getRunCount());
    }
}
