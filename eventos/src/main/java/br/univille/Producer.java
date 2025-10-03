package br.univille;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusSenderClient;

public class Producer {
    
    public static void main(String[] args){
        var servidor = "";


        String chave = System.getenv("CHAVE");
        String queue = "queue-guilhermecosta";

        ServiceBusSenderClient senderClient = 
            new ServiceBusClientBuilder()
            .fullyQualifiedNamespace(servidor)
            .connectionString(chave)
            .transportType(AmqpTransportType,AMQP_WEB_SOCKETS)
            .sender()
            .queueName(queue)
            .buildClient();
        senderClient.sendMessage(new
            ServiceBusMessage("1: a"));
        senderClient.sendMessage(new
            ServiceBusMessage("2: não sei"));
        senderClient.sendMessage(new
            ServiceBusMessage("3: shaolin do sertão"));


    }
}
