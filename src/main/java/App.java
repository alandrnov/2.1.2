import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beann =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getMessage());
        Cat catt = (Cat) applicationContext.getBean("cat");
        System.out.println(catt.getMessage());
        System.out.println(catt==cat);
        System.out.println(bean==bean);

    }
}