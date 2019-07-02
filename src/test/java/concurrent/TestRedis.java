package concurrent;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class TestRedis {
    @Test
    public void test() {
        Jedis jedis = new Jedis("172.16.11.27");
        System.out.println("Connection to server sucessfully");
        //check whether server is running or not
        System.out.println("Server is running: "+jedis.ping());
    }
}
