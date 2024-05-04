package com.news.converter;

import org.springframework.stereotype.Component;

import com.news.dto.NewDTO;
import com.news.entity.NewEntity;

@Component
public class NewConverter {
	public NewEntity toEntity(NewDTO newDto) {
		NewEntity newEntity = new NewEntity();
		newEntity.setTitle(newDto.getTitle());
		newEntity.setContent(newDto.getContent());
		newEntity.setShortDescription(newDto.getShortDescription());
		newEntity.setThumbnail(newDto.getThumbnail());
		return newEntity;
	}
	public NewDTO toDto(NewEntity newEntity) {
		NewDTO newDTO = new NewDTO();
		newDTO.setTitle(newEntity.getTitle());
		newDTO.setContent(newEntity.getContent());
		newDTO.setShortDescription(newEntity.getShortDescription());
		newDTO.setThumbnail(newEntity.getThumbnail());
		newDTO.setCategoryCode(newEntity.getCategory().getCode());
		return newDTO;
	}
}
