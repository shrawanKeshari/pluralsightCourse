package com.pluralsight.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;

@Service("speakerService")
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {
	
	@Autowired
	private SpeakerRepository repository;
	
	public SpeakerServiceImpl() {
		System.out.println("SpearkerServiceImpl no args constructor");
	}
	
	public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		System.out.println("SpearkerServiceImpl repository constructor");
		repository = speakerRepository;
	}
	
	@PostConstruct
	private void initialize() {
		System.out.println("we're calles after the constructors");
	}
	
	@Override
	public List<Speaker> findAll(){
		return repository.findAll();
	}
	
	public void setRepository(SpeakerRepository repository) {
		System.out.println("SpearkerServiceImpl setter");
		this.repository = repository;
	}
}
