package com.example.demo.service;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Message;

public interface messageService extends CrudRepository<Message, Integer>{
	Iterable<Message>findByContent(String content);

}
