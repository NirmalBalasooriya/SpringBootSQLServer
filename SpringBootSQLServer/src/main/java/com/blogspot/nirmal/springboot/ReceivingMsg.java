package com.blogspot.nirmal.springboot;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="RECEIVING_MSG")
public class ReceivingMsg {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @JsonIgnore
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "AGE")
    private int age;
    @Column(name = "IS_DEV")
    private boolean isDeveloper;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDeveloper() {
        return isDeveloper;
    }

    public void setDeveloper(boolean developer) {
        isDeveloper = developer;
    }

    @Override
    public String toString() {
        return "ReceivingMsg{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isDeveloper=" + isDeveloper +
                '}';
    }
}
