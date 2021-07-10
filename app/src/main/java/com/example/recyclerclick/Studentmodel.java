package com.example.recyclerclick;

public class Studentmodel {
  private String name;
  private String address;
    private String dob;
  private int age;
  private int imageid;


    public String getName() {

        return name;
    }

    public String getAddress() {

        return address;
    }

    public String getdob() {

        return dob;
    }

    public int getAge() {
        return age;
    }

    public int getImageid() {
        return imageid;
    }

    public Studentmodel(String name, String address, String dob, int age, int imageid) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.age = age;
        this.imageid = imageid;
    }


}
