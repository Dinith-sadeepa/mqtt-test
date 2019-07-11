import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class CallBack implements MqttCallback {

    public void connectionLost(Throwable throwable) {

    }

    public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception {
        System.out.println(topic + mqttMessage);
    }

    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {

    }
}
