package com.aditya.singleton;

import com.aditya.access.A;

public class NotSubClass{


    public static void main(String[] args) {
        NotSubClass obj = new NotSubClass();
//        int n = obj.num; //can't access num of parent
                          //as it does not inherit parent class.
                          //and num is a protected variable which in order
                            // to be accessed from different package, its class must be inherited in that class.
    }
}