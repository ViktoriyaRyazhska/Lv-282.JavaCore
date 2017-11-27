package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class HTTPErrorTest {




    @Test
    public void getCode() throws Exception {
        HTTPError httpError = new HTTPError(410);
       assertEquals(410, httpError.code);
    }


    @Test
    public void setCode() throws Exception {

    }

    @Test
    public void getStatusCode() throws Exception {
        HTTPError httpError = new HTTPError(410);
        httpError.getStatusCode();
        assertEquals("GONE", httpError.error.name());

    }

}