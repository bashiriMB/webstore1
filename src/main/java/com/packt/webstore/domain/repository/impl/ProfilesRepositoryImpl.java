package com.packt.webstore.domain.repository.impl;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.packt.webstore.domain.*;
import com.packt.webstore.domain.repository.*;

@Repository("profileRepository")
@Transactional
public class ProfilesRepositoryImpl implements ProfileRepository{
	
	@PersistenceContext
	public EntityManager entityManager;
	
	public ProfilesRepositoryImpl() {
	}

	@Transactional(readOnly=false)
	public Profiles create(Profiles profile) {
		entityManager.persist(profile);
		return profile;
	}

	@Transactional(readOnly=false)
	public Profiles read(int id) {

		Profiles profile = entityManager.find(Profiles.class, id);
		return profile;
	}
	
	@Transactional(readOnly=false)
	public void update(int id, Profiles profile) {
		profile = entityManager.merge(profile);
	}
	
	@Transactional(readOnly=false)
	public void delete(int id) {

		entityManager.remove(id);
	}
}


