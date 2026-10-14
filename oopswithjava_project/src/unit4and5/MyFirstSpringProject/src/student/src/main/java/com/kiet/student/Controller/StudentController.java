package com.kiet.student.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

//Rest apis
@RestController
@RequestMapping("/students")

public class StudentController {
    List<Student> users = new ArrayList<>();

    @GetMapping("/{id}")
    public Student getUser(@PathVariable Long id) {
        for (Student u : users) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }

    @PostMapping
    public String saveUser(@RequestBody Student user) {
        // return "Created :" + user;
        users.add(user);
        return "Added " + user.getName();
    }

    @GetMapping
    public List<Student> get() {
        return users;
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody String user) {
        return "Updated :" + user;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return "Deleted :" + id;
    }

    public List<Student> searchStudents(@RequestParam String branch, @RequestParam int year) {
        List<Student> result = new ArrayList<>();
        for (Student s : users) {
            if (s.getBranch().equalsIgnoreCase(branch) && s.getYear() == year) {
                result.add(s);
            }
        }
        return result;
    }

    @GetMapping("/topper")
    public List<Student> getToppers(@RequestParam double cgpa) {
        List<Student> result = new ArrayList<>();
        for (Student s : users) {
            if (s.getCgpa() >= cgpa) {
                result.add(s);
            }
        }
        return result;

    }

}