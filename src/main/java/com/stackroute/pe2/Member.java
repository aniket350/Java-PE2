package com.stackroute.pe2;



public class Member {

    private String name;
    private int age;
    private double salary;

    public Member(String name,int age,double salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;


//        complete the code

    }
    public String details()
    {
        String result="Member Name: "+this.name+"\n" +
                "Member age:"+age +"\n" +
                "Member salary:"+salary+"";
        return result.trim();
    }

}
