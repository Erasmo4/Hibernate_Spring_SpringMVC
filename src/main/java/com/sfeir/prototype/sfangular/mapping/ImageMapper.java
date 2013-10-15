package com.sfeir.prototype.sfangular.mapping;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;

import com.sfeir.prototype.sfangular.dtos.ImageDto;
import com.sfeir.prototype.sfangular.entities.RightEntity;
import com.sfeir.prototype.sfangular.entities.ImageEntity;
import com.sfeir.prototype.sfangular.utils.DateUtils;

public class ImageMapper {
	public static Collection<ImageDto> entitiesToDtos(Collection<ImageEntity> imageEntities) {
		Collection<ImageDto> imageDtos = new ArrayList<ImageDto>();
		for (ImageEntity imageEntity : imageEntities) {
			imageDtos.add(ImageMapper.entityToDto(imageEntity));
		}
		return imageDtos;
	}

	public static ImageEntity dtoToEntity(ImageDto imageDto) throws ParseException {
		
		ImageEntity imageEntity = new ImageEntity();
		imageEntity.setId(imageDto.getId());
		imageEntity.setLabel(imageDto.getLabel());
		imageEntity.setBackground(imageDto.getBackground());
		imageEntity.setObjects((String) imageDto.getObjects());
		
		return imageEntity;
	}

	public static ImageDto entityToDto(ImageEntity imageEntity) {
		
		ImageDto imageDto = new ImageDto();
		imageDto.setId(imageEntity.getId());
		imageDto.setLabel(imageEntity.getLabel());
		imageDto.setBackground(imageEntity.getBackground());
		imageDto.setObjects(imageEntity.getObjects());
		return imageDto;
	}
	
}
