import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        try {
            MqttAsyncClient mqttAsyncClient = new MqttAsyncClient("tcp://13.127.205.221", UUID.randomUUID().toString());
            CallBack callBack = new CallBack();
            mqttAsyncClient.setCallback(callBack);

            IMqttToken token = mqttAsyncClient.connect();
            token.waitForCompletion();
            mqttAsyncClient.subscribe("/ceyentra/topic1", 0);
            mqttAsyncClient.publish("/ceyentra/topic2", new MqttMessage("hello1".getBytes()));
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
}
