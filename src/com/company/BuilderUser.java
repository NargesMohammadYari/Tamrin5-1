package com.company;

/**
 * Created by narges nastran on 10/30/2019.
 */
public class BuilderUser {
    private String userName;
    private String realName;
    private int password;
    private String address;
    private int age;
    private String education;
    private String phoneNumber;

    public BuilderUser(String userName, String realName, int password, String address, String education, String phoneNumber, int age) {
        this.userName = userName;
        this.realName = realName;
        this.password = password;
        this.address = address;
        this.age = age;
        this.education = education;
        this.phoneNumber=phoneNumber;
    }

    public BuilderUser() {}
    public int getPassword()
    {
        return password;
    }
    public BuilderUser setPassword(int password)
    {
        this.password=password;
        return this;
    }
    public String getUserName()
    {
        return userName;
    }
    public BuilderUser setUserName(String userName)
    {
        this.userName=userName;
        return this;
    }
    public String getRealName()
    {
        return realName;
    }
    public BuilderUser setRealName(String realName)
    {
        this.realName=realName;
        return this;
    }
    public String getAddress()
    {
        return address;
    }
    public BuilderUser setAddress(String address)
    {
        this.address=address;
        return this;
    }
    public String getEducation()
    {
        return education;
    }
    public BuilderUser setEducation(String education)
    {
        this.education=education;
        return this;
    }
    public int getAge()
    {
        return age;
    }
    public BuilderUser setAge(int age)
    {
        this.age=age;
        return this;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public BuilderUser setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
        return this;
    }
}
