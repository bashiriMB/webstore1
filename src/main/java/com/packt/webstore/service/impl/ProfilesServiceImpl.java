package com.packt.webstore.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.packt.webstore.domain.*;
import com.packt.webstore.domain.repository.*;
import com.packt.webstore.service.*;

@Service("profileService")
@Transactional
public class ProfilesServiceImpl implements ProfileService{

@Autowired(required=true)
@Qualifier("profileRepository")
private ProfileRepository profilesRepository;

@Transactional
public Profiles create(Profiles profile) {
return profilesRepository.create(profile);
}

@Transactional
public Profiles read(int id) {
return profilesRepository.read(id);
}

@Transactional
public void update(int id, Profiles profile) {
	profilesRepository.update(id, profile);
}

@Transactional
public void delete(int id) {
	profilesRepository.delete(id);
}
}

