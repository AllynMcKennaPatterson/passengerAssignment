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

    @Test   //This test will fail the title assertion
    void testTitleFail(){
        newPassenger = new Passenger("Mo", "Allyn", "a28b462g21", "0877155802", 21);
        assertTrue(newPassenger.getPassengerTitle().equals("Mr") || newPassenger.getPassengerTitle().equals("Ms") || newPassenger.getPassengerTitle().equals("Mrs"), "Passenger title was not equal to Mr or Ms") ;
        assertTrue(newPassenger.getPassengerName().length() >= 3, "Passenger name was less than 3 characters");
        assertTrue(newPassenger.getPassengerId().length() >= 10, "Passenger ID was less than 10 characters");
        assertTrue(newPassenger.getPassengerPhone().length() >= 7, "Passenger phone no. was less than 7 characters");
        assertTrue(newPassenger.getPassengerAge() >= 16, "Passenger age was less than 16");
    }

    @Test   //This test will fail the name assertion
    void testNameFail(){
        newPassenger = new Passenger("Ms", "Al", "a28b462g21", "0877155802", 21);
        assertTrue(newPassenger.getPassengerTitle().equals("Mr") || newPassenger.getPassengerTitle().equals("Ms") || newPassenger.getPassengerTitle().equals("Mrs"), "Passenger title was not equal to Mr or Ms") ;
        assertTrue(newPassenger.getPassengerName().length() >= 3, "Passenger name was less than 3 characters");
        assertTrue(newPassenger.getPassengerId().length() >= 10, "Passenger ID was less than 10 characters");
        assertTrue(newPassenger.getPassengerPhone().length() >= 7, "Passenger phone no. was less than 7 characters");
        assertTrue(newPassenger.getPassengerAge() >= 16, "Passenger age was less than 16");
    }

    @Test   //This test will fail the id assertion
    void testIdFail(){
        newPassenger = new Passenger("Ms", "Allyn", "a28b46", "0877155802", 21);
        assertTrue(newPassenger.getPassengerTitle().equals("Mr") || newPassenger.getPassengerTitle().equals("Ms") || newPassenger.getPassengerTitle().equals("Mrs"), "Passenger title was not equal to Mr or Ms") ;
        assertTrue(newPassenger.getPassengerName().length() >= 3, "Passenger name was less than 3 characters");
        assertTrue(newPassenger.getPassengerId().length() >= 10, "Passenger ID was less than 10 characters");
        assertTrue(newPassenger.getPassengerPhone().length() >= 7, "Passenger phone no. was less than 7 characters");
        assertTrue(newPassenger.getPassengerAge() >= 16, "Passenger age was less than 16");
    }

    @Test   //This test will fail the phone assertion
    void testPhoneFail(){
        newPassenger = new Passenger("Ms", "Allyn", "a28b462g21", "087715", 21);
        assertTrue(newPassenger.getPassengerTitle().equals("Mr") || newPassenger.getPassengerTitle().equals("Ms") || newPassenger.getPassengerTitle().equals("Mrs"), "Passenger title was not equal to Mr or Ms") ;
        assertTrue(newPassenger.getPassengerName().length() >= 3, "Passenger name was less than 3 characters");
        assertTrue(newPassenger.getPassengerId().length() >= 10, "Passenger ID was less than 10 characters");
        assertTrue(newPassenger.getPassengerPhone().length() >= 7, "Passenger phone no. was less than 7 characters");
        assertTrue(newPassenger.getPassengerAge() >= 16, "Passenger age was less than 16");
    }

    @Test   //This test will fail the age assertion
    void testAgeFail(){
        newPassenger = new Passenger("Ms", "Allyn", "a28b462g21", "0877155802", 11);
        assertTrue(newPassenger.getPassengerTitle().equals("Mr") || newPassenger.getPassengerTitle().equals("Ms") || newPassenger.getPassengerTitle().equals("Mrs"), "Passenger title was not equal to Mr or Ms") ;
        assertTrue(newPassenger.getPassengerName().length() >= 3, "Passenger name was less than 3 characters");
        assertTrue(newPassenger.getPassengerId().length() >= 10, "Passenger ID was less than 10 characters");
        assertTrue(newPassenger.getPassengerPhone().length() >= 7, "Passenger phone no. was less than 7 characters");
        assertTrue(newPassenger.getPassengerAge() >= 16, "Passenger age was less than 16");
    }

    @Test   //This test will be successful, allowing the object to be created
    void testAllPass(){
        newPassenger = new Passenger("Mrs", "Allyn", "a28b462g21", "0877155802", 21);
        assertTrue(newPassenger.getPassengerTitle().equals("Mr") || newPassenger.getPassengerTitle().equals("Ms") || newPassenger.getPassengerTitle().equals("Mrs"), "Passenger title was not equal to Mr or Ms") ;
        assertTrue(newPassenger.getPassengerName().length() >= 3, "Passenger name was less than 3 characters");
        assertTrue(newPassenger.getPassengerId().length() >= 10, "Passenger ID was less than 10 characters");
        assertTrue(newPassenger.getPassengerPhone().length() >= 7, "Passenger phone no. was less than 7 characters");
        assertTrue(newPassenger.getPassengerAge() >= 16, "Passenger age was less than 16");
    }
    @AfterEach
    void tearDown() {

    }
}