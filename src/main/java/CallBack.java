import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;


public class CallBack implements MqttCallback {

    private static final Logger LOGGER = LogManager.getLogger(CallBack.class);

    public void connectionLost(Throwable throwable) {

    }

    public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception {
        LOGGER.info("=> message : " +topic +"mqtt m : "+mqttMessage);
        System.out.println(topic + mqttMessage);
    }

    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
        LOGGER.info("=> delivery : " +iMqttDeliveryToken);
    }
}
