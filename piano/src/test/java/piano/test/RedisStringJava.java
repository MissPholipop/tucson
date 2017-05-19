package piano.test;

import redis.clients.jedis.Jedis;
/*
public class RedisTest {
   public static void main(String[] args) {
      //Connecting to Redis server on localhost
      Jedis jedis = new Jedis("localhost");
      System.out.println("Connection to server sucessfully");
      //check whether server is running or not
      System.out.println("Server is running: "+jedis.ping());
 }
}
*/
import redis.clients.jedis.Jedis;
public class RedisStringJava {
   public static void main(String[] args) {
      //Connecting to Redis server on localhost
      Jedis jedis = new Jedis("192.168.0.227",6379);//192.168.0.218
     
      System.out.println("Connection to server sucessfully");
      //System.out.println("Server is running: "+jedis.ping());
      //set the data in redis string
     
    	  jedis.set("tutorial-name", "Redis tutorial");
    	     // Get the stored data and print it
    	  System.out.println("Stored string in redis:: "+ jedis.get("tutorial-name"));
	
	
      
 }
}