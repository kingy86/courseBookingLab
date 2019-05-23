package com.codeclan.courseBooking.courseBooking.components;

import com.codeclan.courseBooking.courseBooking.models.Course;
import com.codeclan.courseBooking.courseBooking.models.Customer;
import com.codeclan.courseBooking.courseBooking.repositories.BookingRepositories.BookingRepository;
import com.codeclan.courseBooking.courseBooking.repositories.CourseRepositories.CourseRepository;
import com.codeclan.courseBooking.courseBooking.repositories.CustomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        Course intro_into_spring = new Course("Intro into Spring", "Edinburgh", 2);
        courseRepository.save(intro_into_spring);

        Course belly_dancing_for_beginners = new Course("Belly dancing for beginners", "Melrose", 5);
        courseRepository.save(belly_dancing_for_beginners);

        Customer david = new Customer("David", "Edinburgh", 28);
        customerRepository.save(david);

        Customer mark = new Customer("Mark", "Edinburgh", 32);
        customerRepository.save(mark);
    }
}
