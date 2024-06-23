package com.krayin.krayin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krayin.krayin.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * Getting the users where name is associated with.
     * 
     * @param name
     * @return List<User>
     */
    public List<User> findByName(String name);

    /**
     * Getting the users where email is associated with.
     * 
     * @param email
     * @return List<User>
     */
    public List<User> findByEmailContaining(String email);
}
