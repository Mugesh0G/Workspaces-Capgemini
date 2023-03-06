package com.example.service;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.HitsTotal;

public interface hitService extends CrudRepository<HitsTotal, Integer>{

}
