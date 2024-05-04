package com.news.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.converter.NewConverter;
import com.news.dto.NewDTO;
import com.news.entity.CategoryEntity;
import com.news.entity.NewEntity;
import com.news.repository.CategoryRepository;
import com.news.repository.NewRepository;
import com.news.service.INewService;
@Service
public class NewServiceImpl implements INewService{

	@Autowired
	private NewRepository newRespository;
	@Autowired
	private CategoryRepository categoryRespository;
	@Autowired
	private NewConverter newConverter;
	@Override
	public NewDTO save(NewDTO newDto) {
		CategoryEntity categoryEntity = categoryRespository.findOneByCode(newDto.getCategoryCode());
		NewEntity newEntity = new NewEntity();
		newEntity = newConverter.toEntity(newDto);
		newEntity.setCategory(categoryEntity);
		newRespository.save(newEntity);
		return newConverter.toDto(newEntity);
	}

}