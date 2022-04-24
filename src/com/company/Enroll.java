package com.company;
import java.util.HashMap;
import java.util.Map;

public class Enroll {

    HashMap <String,String> Enroll_list = new HashMap<>();

    public void enrollStudent(String stid,String Specialization) {
        Enroll_list.put(stid,Specialization);
    }
    public void displayEnrolledStudents() {

        for (Map.Entry<String, String> entry : Enroll_list.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }

}