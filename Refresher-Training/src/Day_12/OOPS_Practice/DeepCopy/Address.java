package Day_12.OOPS_Practice.DeepCopy;

public class Address {

    String street;
    String city;
    String zipCode;

    Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    Address(Address other) {
        this.street = other.street;
        this.city = other.city;
        this.zipCode = other.zipCode;
    }

    void display() {
        System.out.println("Street: " + street + " | City: " + city + " | Zip: " + zipCode);
    }
}
