package io.javabrains.springbootquickstart.topic.Repository;

import io.javabrains.springbootquickstart.courseapi.topic.Topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String>{
//getAllTopics
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)
}
