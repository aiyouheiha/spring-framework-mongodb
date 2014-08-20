package com.lemon.spring.service.impl;

import com.lemon.spring.domain.QUser;
import com.lemon.spring.domain.User;
import com.lemon.spring.repository.IPersonRepository;
import com.lemon.spring.repository.UserRepository;
import com.lemon.spring.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Resource
    private UserRepository userRepository;

    @Resource
    private IPersonRepository personRepository;

    @Override
    public User initUser() {
        User user = new User();
        return user;
    }

    @Override
    public boolean saveUser(User user) {
        User u = userRepository.save(user);
        if (u != null) {
            return true;
        }
        return false;
    }

    @Override
    public List<User> getUserList() {
//        QUser user = QUser.user;
//        return (List<User>)userRepository.findAll(user.firstName.contains("lemon"));
        return userRepository.findAll();
    }

    @Override
    public List<User> getUserListByFirstName(String firstName) {
        QUser user = QUser.user;
        return (List<User>)userRepository.findAll(user.firstName.contains(firstName));
    }

    @Override
    public User getUserByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName).get(0);
    }

    @Override
    public void insertUser(User user) {
        personRepository.insert(user);
    }


}
