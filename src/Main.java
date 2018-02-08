import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context  = new
                ClassPathXmlApplicationContext("resources/spring-context.xml");
        /**
         * Implementing dependency injection with constructor
         */
        /*SilverCustomer silverCustomer = (SilverCustomer) context.getBean("ivanId");
        silverCustomer.buy();*/

        LeadCustomer leadCustomer = (LeadCustomer) context.getBean("leon");
        leadCustomer.buy();
    }
}
