package Proxy;

public class CitizenData {
    private String firstName;
    private String lastName;
    private String nationalId;
    private String address;
    private String phone;
    private String email;

    public CitizenData(String firstName, String lastName, String nationalId, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CitizenData{" + "firstName=" + firstName + ", lastName=" + lastName + ", nationalId=" + nationalId + ", address=" + address + ", phone=" + phone + ", email=" + email + '}';
    }
}
