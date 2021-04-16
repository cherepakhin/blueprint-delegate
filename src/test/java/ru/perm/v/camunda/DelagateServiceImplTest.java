package ru.perm.v.camunda;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DelagateServiceImplTest {

    @Test
    public void request() {
        DelegateServiceImpl service = new DelegateServiceImpl();
        assertEquals("ID", service.request("ID"));
    }
}