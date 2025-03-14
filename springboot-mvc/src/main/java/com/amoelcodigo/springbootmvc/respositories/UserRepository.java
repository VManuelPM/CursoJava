package com.amoelcodigo.springbootmvc.respositories;

import com.amoelcodigo.springbootmvc.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, Long> {
}
