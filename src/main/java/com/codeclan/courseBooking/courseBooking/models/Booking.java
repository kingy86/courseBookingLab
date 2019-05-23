package com.codeclan.courseBooking.courseBooking.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name= "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String date;

    @JsonIgnoreProperties("booking")
    @OneToMany(mappedBy = "booking", fetch = FetchType.LAZY)
    Course course;

    @JsonIgnoreProperties("booking")
    @OneToMany(mappedBy = "booking", fetch = FetchType.LAZY)
    @Column
    Customer customer;

    public Booking(String date, Course course, Customer customer) {
        this.date = date;
        this.course = course;
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
