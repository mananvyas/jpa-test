package com.testproject.jpa;

import com.testproject.jpa.entity.Car;
import com.testproject.jpa.entity.CarRepository;
import com.testproject.jpa.entity.Person;
import com.testproject.jpa.entity.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class SimpleController {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    CarRepository carRepository;

    @RequestMapping("/hello")
    public String greeting(){
        return "hello...";
    }

    @GetMapping(value = "/person")
    public List<Person> getPerson(){
        return personRepository.findAll();

    }

    @PostMapping(value = "/person")
    public List<Person> setPerson(@RequestBody Person person){
        carRepository.save(person.getCar().get(0));
        personRepository.save(person);

//        Person person1 = new Person("Name1", 44);
//        Person p = personRepository.save(person1);
//        Car car = new Car();
//        car.setBrand("Bmw");
//        car.setType("auto");
//        carRepository.save(car);

//        person1.setCar(Arrays.asList(car));
//        personRepository.save(person1);

        return personRepository.findAll();
    }
}
