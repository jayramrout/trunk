/**
 * 
 */

/**
 * @author Jayram
 *
 */
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;

/**
 * @author Jayram Rout
 *
 */
public class SendingMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConnectionFactory cf = new ActiveMQConnectionFactory(
				"tcp://localhost:61616");
		Connection conn = null;
		Session session = null;
		try {
			conn = cf.createConnection();
			session = conn.createSession(true, Session.AUTO_ACKNOWLEDGE);

			Destination destination = new ActiveMQQueue("MyActiveMQQueue");
			MessageProducer producer = session.createProducer(destination);
			TextMessage message = session.createTextMessage();
			for (int i = 0; i < 5; i++) {
				message.setText("Jayram Message" + i);
//				if(i == 3){
//					int value = 10/0;
//				}
				producer.send(message);
			}
			session.commit();
//			message.setText("Jayram Message");
//			producer.send(message);
			
			System.out.println("Message is sent...");
		} catch (JMSException e) {
			e.printStackTrace();
			try {
				session.rollback();
			} catch (JMSException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			try {
				if (session != null) {
					session.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (JMSException ex) {
			}
		}
	}
}