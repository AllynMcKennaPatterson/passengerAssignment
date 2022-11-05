package ie.atu;

public class Passenger {
    String passengerTitle;
    String passengerName;
    String passengerId;
    String passengerPhone;
    int passengerAge;

    public String getPassengerTitle() {
        return passengerTitle;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public String getPassengerPhone() {
        return passengerPhone;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public Passenger(String title, String name, String id, String phone, int age){
        passengerTitle = title;
        passengerName = name;
        passengerId = id;
        passengerPhone = phone;
        passengerAge = age;

    }


}
