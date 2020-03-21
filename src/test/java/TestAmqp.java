import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAmqp {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void sendMsg(){
        amqpTemplate.convertAndSend("demoexchage","test.msg","这个是demo消息");
    }
}
