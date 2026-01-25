package com.annotationsandreflection.annotations.suppressunchecked;

import java.util.ArrayList;

class WarningDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList list = new ArrayList();  

        list.add("Java");
        list.add(10);
        list.add(3.14);

        String value = (String) list.get(0);
        System.out.println(value);
    }
}
