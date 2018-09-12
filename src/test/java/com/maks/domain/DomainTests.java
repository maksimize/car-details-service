package com.maks.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DomainTests {
    @Test
    public void testOwner() {
        Owner o1 = new Owner();
        o1.setName("Kalles Grustransporter AB");
        o1.setAddress("Cementvägen 8, 111 11 Södertälje");

        assertEquals(o1.getName(), "Kalles Grustransporter AB");
        assertEquals(o1.getAddress(), "Cementvägen 8, 111 11 Södertälje");
    }
}

