package co.com.erp.sap.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ERPSAPListener {

	
	@JmsListener(destination="jms/ERPSAP/queue")
	public void onMessage( final Message message ) throws JMSException {
		
		System.out.println( "ERP Recibe el mensaje de la cola" );
		TextMessage tm = (TextMessage) message;
		System.out.println( tm.getText() );
	}
	
}
