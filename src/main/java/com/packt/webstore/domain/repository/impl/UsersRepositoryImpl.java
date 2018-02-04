package com.packt.webstore.domain.repository.impl;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.packt.webstore.domain.*;
import com.packt.webstore.domain.repository.*;

@Repository("userRepository")
@Transactional
public class UsersRepositoryImpl implements UserRepository{
	
	@PersistenceContext
	public EntityManager entityManager;
	
	public UsersRepositoryImpl() {
	}

	@Transactional(readOnly=false)
	public Users create(Users user) {
		entityManager.persist(user);
		return user;
	}

	@Transactional(readOnly=false)
	public Users read(int id) {

		Users user = entityManager.find(Users.class, id);
		return user;
	}
	
	@Transactional(readOnly=false)
	public void update(int id, Users user) {
		user = entityManager.merge(user);
	}
	
	@Transactional(readOnly=false)
	public void delete(int id) {

		entityManager.remove(id);
	}
}

