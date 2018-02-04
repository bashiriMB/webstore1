package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.*;

public interface UserRepository {
	
	Users create(Users user);
	Users read(int id);
	void update(int id, Users user);
	void delete(int id);
}
