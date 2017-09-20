package com.corpa.parsing;

public class BaseRequest {

    protected String statusReason;
    protected String errorCode;
    protected String statusCode;

    public String getStatusReason() {
        return statusReason;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getStatusCode() {
        return statusCode;
    }
}
