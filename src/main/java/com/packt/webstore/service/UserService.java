package com.packt.webstore.service;
import com.packt.webstore.domain.*;

public interface UserService {
Users create(Users user);
Users read(int id);
void update(int id, Users user);
void delete(int id);
}

