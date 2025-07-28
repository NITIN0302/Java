package com.servo.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("Nitin",1);
        m.put("Shivam",2);
        m.put("Shubham",1);
        m.put("Jay",1);

        // Basic difference between get() or getOrDefault() that when key is not present then you can save a default value
        // To prevent null pointer exception in get() if key is not present we use getOrDefault()
        System.out.println(m.get("Nitin"));
        System.out.println(m.getOrDefault("shu",0));


//        for()

    }
}
