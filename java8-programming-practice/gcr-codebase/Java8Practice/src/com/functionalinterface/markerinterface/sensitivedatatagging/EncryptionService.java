package com.functionalinterface.markerinterface.sensitivedatatagging;

public class EncryptionService {

    public static void process(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println(
                "Sensitive data detected. Encrypting: "
                + obj.getClass().getSimpleName()
            );
 
        } else {
            System.out.println(
                "No encryption needed for: "
                + obj.getClass().getSimpleName()
            );
        }
    }
}
