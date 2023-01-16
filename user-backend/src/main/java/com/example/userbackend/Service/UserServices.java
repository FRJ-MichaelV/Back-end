package com.example.userbackend.Service;

import com.example.userbackend.Entity.User;
import com.example.userbackend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    private UserRepository repo;

    public Iterable<User> listAll(){
        return this.repo.findAll();
    }
    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(User users){
        repo.save(users);
    }

    public User getUserById(Long nic){
        return repo.findById(nic).get();
    }

    public void update(User users, int nic){
        repo.save(users);
    }

    public void delete(Long nic){
        repo.deleteById(nic);
    }
}
