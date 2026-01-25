package com.annotationsandreflection.annotations.deprecated;

class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("This is the OLD feature (not recommended)");
    }

    public void newFeature() {
        System.out.println("This is the NEW feature (use this)");
    }
}
