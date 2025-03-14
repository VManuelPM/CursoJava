package com.amoelcodigo.springbootmvc.services;

import com.amoelcodigo.springbootmvc.models.User;
import com.amoelcodigo.springbootmvc.respositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    @Override
    public List<User> findAll() {
        return (List<User>) this.userRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<User> findById(Long id) {
        return this.userRepository.findById(id);
    }

    @Transactional
    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }

    @Transactional
    @Override
    public void delete(User user) {
        this.userRepository.delete(user);
    }
}
