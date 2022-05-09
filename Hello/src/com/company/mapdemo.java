package com.company;

import java.util.HashMap;
import java.util.Map;

public class mapdemo {
    public static void main(String[] args) {
        Map<String, String> college = new HashMap<String, String>();
        college.put("12ME12", "Aditya");
        college.put("12ME10", "Ajay");
        college.put("12ME11", "Anuj");

        college.put("12ME13", "daf");
        System.out.println(college.get("12ME13"));
        System.out.println(college.remove("12ME10"));
        System.out.println(college.size());
        if (college.containsKey("12ME10")) {
            System.out.println("Ajay is not DEleted");
        } else {
            System.out.println("Ajay is DEleted");

        }
       for(Map.Entry<String,String>entry: college.entrySet()) {
       System.out.println(entry.getKey());
       System.out.println(entry.getValue());
       }
    }
}