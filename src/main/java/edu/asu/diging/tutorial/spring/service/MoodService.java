package edu.asu.diging.tutorial.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;

@Service
public class MoodService implements IMoodService{
	
	  private List<String> moods;
	  private List<String> explanations;
	  private Random random;
	  
	  @PostConstruct 
	  public void init()
	  {
		  moods = new ArrayList<String>();
		  moods.add("Happy");
		  moods.add("Sad");
		  moods.add("Scared");
		  moods.add("Excited");
		  
		  explanations = new ArrayList<String>();
		  explanations.add("I am hungry.");
		  explanations.add("there were no mice.");
		  explanations.add("there were mice.");
	      explanations.add("I am purring.");
		  
	      random = new Random();
	  }
	  
	  public Mood getCurrentMood() {
	        int rnum = random.nextInt(moods.size());
	        return new Mood(moods.get(rnum));
	    }
	  
	 
	  public String getExplanation()
	  {
		  int rnum = random.nextInt(explanations.size());
	      return explanations.get(rnum);
	  }

}
