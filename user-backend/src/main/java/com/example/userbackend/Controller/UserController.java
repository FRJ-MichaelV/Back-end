package com.example.userbackend.Controller;

import com.example.userbackend.Entity.User;
import com.example.userbackend.Service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserServices services;
    @GetMapping("/getall")
    public Iterable<User> getUsers(){
        return services.listAll();
    }
    @PostMapping(value = "/save")
    private long saveDetails(@RequestBody User users){
        services.saveOrUpdate(users);
        return users.getNic();
    }
    @RequestMapping(value = "/user/{id}")
    private User getDetails(@PathVariable(name = "id") Long userid){
        return services.getUserById(userid);
    }
    @PutMapping("/edit/{id}")
    private User update(@RequestBody User users){
        services.saveOrUpdate(users);
        return users;
    }
    @DeleteMapping("/delete/{id}")
    private void deleteUser(@PathVariable("id") Long id){
        services.delete(id);
    }

}
