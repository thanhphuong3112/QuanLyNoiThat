package thietkenoithat.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name= "customers")
public class KhachHang {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CustomerId")
    private short cusId;
    @Column(name = "CustomerName")
    private String cusName;
    @Column (name = "PhoneNumber")
    private String phoneNum;
    @Column (name = "Email")
    private String email;
    @Column ( name = "Address")
    private String address;
    @Column ( name = "City")
    private String city;
    @Column ( name = "PostalCode")
    private String postalcode;
    @Column (name = "Country")
    private String country;
    public short getCusId() {
        return cusId;
    }
    public void setCusId(short cusId) {
        this.cusId = cusId;
    }
    public String getCusName() {
        return cusName;
    }
    public void setCusName(String cusName) {
        this.cusName = cusName;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPostalcode() {
        return postalcode;
    }
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    
}
