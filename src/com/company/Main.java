package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	BuilderUser builderUser=new BuilderUser().setUserName("ali").setRealName("alireza").setAge(20).setPassword(12345).setPhoneNumber("09121111111").setEducation("diploma").setAddress("tehran shahran koche khodad");
        System.out.println(builderUser.getUserName());
        System.out.println(builderUser.getRealName());
        System.out.println(builderUser.getAge());
        System.out.println(builderUser.getPassword());
        System.out.println(builderUser.getPhoneNumber());
        System.out.println(builderUser.getEducation());
        System.out.println(builderUser.getAddress());

    }
}
