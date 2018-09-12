package com.maks.Services;


import com.maks.domain.Owner;
import com.maks.repositories.OwnerRepository;
import com.maks.services.OwnerService;
import com.maks.services.OwnerServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServicesTests {

    private OwnerService ownerService;

    @Mock
    private OwnerRepository ownerRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        ownerService = new OwnerServiceImpl(ownerRepository);
    }

    @Test
    public void testOwnerService() {
        Owner o1 = new Owner();
        o1.setName("Kalles Grustransporter AB");
        o1.setAddress("Cementvägen 8, 111 11 Södertälje");
        Optional<Owner> optional = Optional.of(o1);

        doReturn(optional).when(ownerRepository).findById(1L);

        Optional<Owner> optional2 = ownerService.findById(1L);

        assertEquals(optional, optional2);
    }
}
