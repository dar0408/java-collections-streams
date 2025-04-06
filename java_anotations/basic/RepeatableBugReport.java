package basic;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class Feature {
    @BugReport(description = "NullPointerException on edge case")
    @BugReport(description = "ArrayIndexOutOfBounds when input > 10")
    public void process() {}
}

public class RepeatableBugReport {
    public static void main(String[] args) throws Exception {
        Method m = Feature.class.getMethod("process");
        BugReport[] reports = m.getAnnotationsByType(BugReport.class);
        for (BugReport report : reports) {
            System.out.println("Bug: " + report.description());
        }
    }
}