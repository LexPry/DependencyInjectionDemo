package com.alex.work.dependencyinjectiondemo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class Student
{
    private int id;
    private String name;
    private List<Phone> ph;
    @Autowired
    private Address address;

    public Student(String name)
    {
        this.name = name;
    }

//
//    @Autowired
//    public Student(int id, String name, List<Phone> ph, Address address)
//    {
//        this.id = id;
//        this.name = name;
//        this.ph = ph;
//        this.address = address;
//    }

    public String showPhone()
    {
        return "My phone is a " + ph;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Phone> getPh()
    {
        return ph;
    }

    public void setPh(List<Phone> ph)
    {
        this.ph = ph;
    }


    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", ph=" + ph + ", address=" + address + '}';
    }
}
