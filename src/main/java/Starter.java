
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Starter {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("src/main/java/config/MyConfig.java");
    }
}
