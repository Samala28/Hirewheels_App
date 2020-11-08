package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
@Column(nullable = false,length = 50)
    private String firstName;
@Column(nullable = false,length = 50)
    private String lastName;
@Column(length = 50,nullable = false)
private String password;
@Column(length = 50,nullable = false,unique = true)
    private String email;
@Column(length = 10,nullable = false,unique = true)
    private String mobileNo;
@Column
    private float walletMoney = 10000.00f;

@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
@JoinColumn(name = "role_id",nullable = false)
    private String role;

   public Users() {
    }

    public Users(int userId, String firstName) {
       this.userId=userId;
       this.firstName=firstName;
    }

    public Users(String firstName) {
this.firstName=firstName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public float getWalletMoney() {
        return walletMoney;
    }

    public void setWalletMoney(float walletMoney) {
        this.walletMoney = walletMoney;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString(){
        return "Users{"+
                ", userId = "+userId+
                ", firstName = "+firstName+
                ", lastName = "+lastName+
                ", password = "+password+
                ", email = "+email+
                ", mobileNo = "+mobileNo+
                ", walletMoney = "+walletMoney+
                ", role = "+role+
                '}';
    }
}
