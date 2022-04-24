package com.company;
import java.util.*;


public class Specialization {
    HashMap <String,Double> Specialization_list = new HashMap<>();

    public void addSpecialization(String Specialization,Double gpa) {

        Specialization_list.put(Specialization, gpa);
    }
}

