package model;
// Generated 08.May.2017 14:22:30 by Hibernate Tools 4.3.1



/**
 * Customer generated by hbm2java
 */
public class Customer  implements java.io.Serializable {


     private int customerId;
     private DiscountCode discountCode;
     private MicroMarket microMarket;
     private String name;
     private String addressline1;
     private String addressline2;
     private String city;
     private String state;
     private String phone;
     private String fax;
     private String email;
     private Integer creditLimit;

    public Customer() {
    }

	
    public Customer(int customerId, DiscountCode discountCode, MicroMarket microMarket) {
        this.customerId = customerId;
        this.discountCode = discountCode;
        this.microMarket = microMarket;
    }
    public Customer(int customerId, DiscountCode discountCode, MicroMarket microMarket, String name, String addressline1, String addressline2, String city, String state, String phone, String fax, String email, Integer creditLimit) {
       this.customerId = customerId;
       this.discountCode = discountCode;
       this.microMarket = microMarket;
       this.name = name;
       this.addressline1 = addressline1;
       this.addressline2 = addressline2;
       this.city = city;
       this.state = state;
       this.phone = phone;
       this.fax = fax;
       this.email = email;
       this.creditLimit = creditLimit;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
   
   
    public DiscountCode getDiscountCode() {
        return this.discountCode;
    }
    
    public void setDiscountCode(DiscountCode discountCode) {
        this.discountCode = discountCode;
    }
    public MicroMarket getMicroMarket() {
        return this.microMarket;
    }
    
    public void setMicroMarket(MicroMarket microMarket) {
        this.microMarket = microMarket;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAddressline1() {
        return this.addressline1;
    }
    
    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }
    public String getAddressline2() {
        return this.addressline2;
    }
    
    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getCreditLimit() {
        return this.creditLimit;
    }
    
    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }




}


