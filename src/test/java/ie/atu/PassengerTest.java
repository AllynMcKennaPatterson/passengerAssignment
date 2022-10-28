package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    Passenger newPassenger;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testTitleFail(){
        newPassenger = new Passenger("Mr", "Allyn", "1287gf8237g", "0976284", 21);
        assertTrue(newPassenger.getTitle().equals("Mr") || newPassenger.getTitle().equals("Ms"));
        assertTrue(newPassenger.getName().length() >= 3);
        assertTrue(newPassenger.getId().length() >= 10);
        assertTrue(newPassenger.getPhone().length() >= 7);
        assertTrue(newPassenger.getAge()> 16);
    }

    @AfterEach
    void tearDown() {
        //newPassenger = new Passenger();
    }
}