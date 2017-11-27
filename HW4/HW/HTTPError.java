package com.company;

public class HTTPError {

    public enum Error {
        BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND, METHOD_NOT_ALLOWED, NOT_ACCEPTABLE,
        PROXY_AUTHENTICATION_REQUIRED, REQUEST_TIMEOUT, CONFLICT, GONE
    }

    Error error;

    int code = 0;

    public HTTPError(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void getStatusCode () {

        switch (code){
            case 400: error = error.BAD_REQUEST;
                break;
            case 401: error = error.UNAUTHORIZED;
                break;
            case 402: error = error.PAYMENT_REQUIRED;
                break;
            case 403: error = error.FORBIDDEN;
                break;
            case 404: error = error.NOT_FOUND;
                break;
            case 405: error = error.METHOD_NOT_ALLOWED;
                break;
            case 406: error = error.NOT_ACCEPTABLE;
                break;
            case 407: error = error.PROXY_AUTHENTICATION_REQUIRED;
                break;
            case 408: error = error.REQUEST_TIMEOUT;
                break;
            case 409: error = error.CONFLICT;
                break;
            case 410: error = error.GONE;
                break;
            default:
                System.out.println("Not this code");
                System.exit(0);
        }
        System.out.println( this.code + " error : " + error);
    }
}
