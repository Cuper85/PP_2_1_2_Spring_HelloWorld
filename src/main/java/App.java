import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorldBean1 =
                (HelloWorld) applicationContext.getBean("helloworld", HelloWorld.class);

        HelloWorld helloWorldBean2 =
                (HelloWorld) applicationContext.getBean("helloworld", HelloWorld.class);

        System.out.println("Переменные HelloWorld ссылаются на один и тот же объект? " + (helloWorldBean1 == helloWorldBean2));

        Cat catBean1 =
                (Cat) applicationContext.getBean("cat", Cat.class);

        Cat catBean2 =
                (Cat) applicationContext.getBean("cat", Cat.class);

        System.out.println("Переменные Cat ссылаются на один и тот же объект? " + (catBean1 == catBean2));
    }
}


