package com.example.StoryAPI.demo.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.StoryAPI.demo.model.Story;


@Service
public class StoryService {
	
	 List<Story> stories= new ArrayList<Story>();
	 

	
	public List<Story> getStories()
	{
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  
	   System.out.println(dtf.format(now));  
	
	stories.add(new Story(1,"A", now,null));
	stories.add(new Story(2,"B", now,null));
	
	return stories;
	
	}


	public List<Story> getTopStories()
	{
	 List<Story> stories= new ArrayList<Story>();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  
	   System.out.println(dtf.format(now));  
	
	   
	stories.add(new Story(1,"A", now,null));
	stories.add(new Story(2,"B", now,null));
	
	return stories.stream().filter(s->now.getMinute()-s.getTime().getMinute()>3).collect(Collectors.toList());
	
	}

	public void AddStory(Story story)
	{
		stories.add(story);
	
	}
	
	public Story getStoryByid(int id)
	{
		return stories.stream().filter(s->s.getId()==id).collect(Collectors.toList()).get(0);
	}


}
