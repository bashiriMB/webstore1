package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.*;
public interface ProfileRepository {
	
	Profiles create(Profiles profile);
	Profiles read(int id);
	void update(int id, Profiles profile);
	void delete(int id);
}

