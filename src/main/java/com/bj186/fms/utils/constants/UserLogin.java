package com.bj186.fms.utils.constants;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

public class UserLogin {

    /**
     * 判断用户是否登录,并获取用户ID
     */
    @Test
    public void isLogin() {
        Jedis jedis = new Jedis("172.16.11.27");
        System.out.println("Connection to server sucessfully");
        //check whether server is running or not
        System.out.println("Server is running: "+jedis.ping());
        String userLoginSession = getUserLoginSession();
        String s = jedis.get(userLoginSession);
        System.out.println("s: " + s);
    }

    public static String getUserLoginSession() {

        return "user:LoginSession";
    }
}
