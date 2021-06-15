
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//У тебя не SpringBoot, посему стартер тебе не нужен. Твое приложение будет крутиться в аппликейшн сервере (tomcat, jetty)
public class Starter {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("src/main/java/config/MyConfig.java");
    }
}
