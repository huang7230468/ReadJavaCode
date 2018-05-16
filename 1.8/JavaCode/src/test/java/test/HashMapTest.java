package test;

import org.junit.Test;

import java.util.HashMap;

/**
 * @author
 * @create 2018-05-09 22:06
 **/
public class HashMapTest {

    @Test
    public void test(){
        HashMap hashMap =  new HashMap();
        hashMap.put("1","1");
        System.out.println(0x7fffffff);
        hashMap.put(null,null);

      // int h = "1.hashCode()) ^ (h >>> 16
        int h = "1".hashCode() ;
        System.out.println(h ^ (h >>> 16));
        System.out.println(50 & 49);
        hashMap.put("1","3");
        System.out.println(hashMap.get("1"));
        System.out.println(17<<1);

        for(int i = 1 ; ;){
            System.out.println(i);
        }

    }
}
