package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
	
	@Override
	public List<Speaker> findAll(){
		List<Speaker> speakers = new ArrayList<Speaker>();
		
		Speaker speaker = new Speaker();
		
		speaker.setFirstName("Shrawan Kumar");
		speaker.setLastName("Keshari");
		
		speakers.add(speaker);
		
		return speakers;
	}
}
