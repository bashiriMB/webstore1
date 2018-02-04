package com.packt.webstore.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import org.springframework.transaction.annotation.Transactional;
import com.packt.webstore.domain.*;
import com.packt.webstore.domain.repository.*;
import com.packt.webstore.service.*;

@Service("userService")
@Transactional
public class UsersServiceImpl implements UserService{

@Autowired(required=true)
@Qualifier("userRepository")	
private UserRepository usersRepository;

@Transactional
public Users create(Users user) {
return usersRepository.create(user);
}

@Transactional
public Users read(int id) {
return usersRepository.read(id);
}

@Transactional
public void update(int id, Users user) {
usersRepository.update(id, user);
}

@Transactional
public void delete(int id) {
usersRepository.delete(id);
}
}
