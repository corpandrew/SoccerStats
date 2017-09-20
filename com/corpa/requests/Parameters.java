package com.corpa.requests;

import java.util.HashMap;

public class Parameters extends HashMap<String, String> {

    Parameters(Parameter... params) {
        for (Parameter param : params) {
            put(param.getAPIParam().getAPIParamValue(), param.getValue());
        }
    }

    public void put(Parameter param, String value) {
        put(param.getValue(), value);
    }

}
