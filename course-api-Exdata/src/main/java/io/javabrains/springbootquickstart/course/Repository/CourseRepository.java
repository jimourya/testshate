package io.javabrains.springbootquickstart.course.Repository;

import java.util.List;

import io.javabrains.springbootquickstart.course.Course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String>{
//getAllTopics
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)
	/*public List<Course> getCourseByTopic(String topicId);
	public List<Course> getCourseByName(String Name);*/
/*	public List<Course> findbyName(String Name);
	public List<Course> findbyDescription(String foo);*/
	public List<Course> findByTopicId(String topicId);
	
	
}
