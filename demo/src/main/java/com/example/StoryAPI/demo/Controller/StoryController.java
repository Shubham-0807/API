package com.example.StoryAPI.demo.Controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.StoryAPI.demo.Service.StoryService;
import com.example.StoryAPI.demo.model.Comments;
import com.example.StoryAPI.demo.model.Story;


@RestController
public class StoryController {
	

	@Autowired
	StoryService service;

	@RequestMapping(value= "/getStories"  ,method = RequestMethod.GET)
	public List<com.example.StoryAPI.demo.model.Story> getStories()
	{
		return service.getStories();
	}
	
	/*
	 * public Story getStoryById(int id) { return service.getStoryByid(id); }
	 */	
	@RequestMapping(value="/top-stories", method=RequestMethod.GET)
	
	public List<Story> getTopStories()
	{
		return service.getStories();
	}
	
	@RequestMapping(value="/addStory", method=RequestMethod.POST)
	
	public void AddStory(@RequestBody Story story)
	{
		LocalDateTime now = LocalDateTime.now();  
		Story s = new Story(1,"A", now,null);
		service.AddStory(s);
	}
	
	@RequestMapping(value = "/getStory/{id}/getComments")
	
	public List<Comments> getComments(@PathVariable int id)
	{
		return service.getStoryByid(id).getComments();
	}


	@RequestMapping(value= "/getStory/{id}"  ,method = RequestMethod.GET)
	public Story getStoryById(@PathVariable int id)
	{
		return service.getStoryByid(id);
	}
	
}
