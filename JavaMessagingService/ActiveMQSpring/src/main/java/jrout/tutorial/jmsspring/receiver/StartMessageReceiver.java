package jrout.tutorial.jmsspring.receiver;

/**
 * 
 */

/**
 * @author Jayram
 *
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class StartMessageReceiver {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext( "spring-jms-receiver.xml");
	}
}