package io.javabrains.springbootquickstart.course;


import io.javabrains.springbootquickstart.course.Repository.CourseRepository;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
private CourseRepository courseRepository; 

/*private List<Topic> topics=new ArrayList<>(Arrays.asList(
new Topic("Spring","Spring framwork","Spring framwork Disc"),
new Topic("java","core java","core java Disc"),
new Topic("javascript","javaScript"," java Script Disc")));*/

public List<Course> getAllCourses(String topicId){
	//return topics;
	List<Course> courses= new ArrayList<>();
	courseRepository.findByTopicId(topicId)
	.forEach(courses::add);
	return courses;
}
public Course getCourse(String id){
	//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	/*courseRepository.findbyName("--");*/
	return courseRepository.findOne(id);
}
public void addCourse(Course topic) {
	// TODO Auto-generated method stub
	//topics.add(topic);
	courseRepository.save(topic);
}
public void updateCourse( Course course) {
	// TODO Auto-generated method stub
	/*for(int i=0;i<topics.size();i++){
		Topic t=topics.get(i);
		if(t.getId().equals(id)){
			topics.set(i, topic);
		}
	}*/
	courseRepository.save(course);
}
public void deleteCourse(String id) {
	// TODO Auto-generated method stub
	/*topics.removeIf(t -> t.getId().equals(id));*/
	courseRepository.delete(id);
}

}
