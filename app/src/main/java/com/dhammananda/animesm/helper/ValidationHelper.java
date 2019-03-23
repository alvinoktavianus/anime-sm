package com.dhammananda.animesm.helper;

public class ValidationHelper {

    private static ValidationHelper instance = null;

    private ValidationHelper() {
    }

    public static ValidationHelper getInstance() {
        if (instance == null) {
            instance = new ValidationHelper();
            return instance;
        }
        return instance;
    }

    public boolean isStringEmpty(String s) {
        return s.isEmpty();
    }

}
