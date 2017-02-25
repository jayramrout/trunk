package com.tutorial.ws.client;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.util.Set;

/**
 * Created by jrout on 2/24/17.
 */
public class SOAPLoggingHandler implements SOAPHandler<SOAPMessageContext>{

    private final Logger logger = Logger.getLogger(SOAPLoggingHandler.class);

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        return false;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    @Override
    public void close(MessageContext context) {

    }

    private void logToSystemOut(SOAPMessageContext context) {
        Boolean isOutBound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        StringBuffer sb = new StringBuffer();
        if(isOutBound) {
            sb.append("\nOutBound Message :");
        }else {
            sb.append("\nInBound Message :");
        }

        SOAPMessage message = context.getMessage();
        try{
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            message.writeTo(baos);
            sb.append("\n" + baos.toString());
            logger.info(sb.toString());
        }catch (Exception exp){

        }
    }
}
