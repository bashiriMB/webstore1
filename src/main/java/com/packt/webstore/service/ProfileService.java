package com.packt.webstore.service;
import com.packt.webstore.domain.*;

public interface ProfileService {
Profiles create(Profiles profile);
Profiles read(int id);
void update(int id, Profiles profile);
void delete(int id);
}

