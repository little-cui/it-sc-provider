package com.service.provider.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProvider {

        ProviderDelegate providerDelegate = new ProviderDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = providerDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}