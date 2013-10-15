package com.sfeir.prototype.sfangular.services;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sfeir.prototype.sfangular.daos.ImageDao;
import com.sfeir.prototype.sfangular.dtos.ImageDto;
import com.sfeir.prototype.sfangular.mapping.ImageMapper;

@Service
public class ImageService {
	@Autowired ImageDao dao;

	@Transactional
	public Long saveOrUpdate(ImageDto imageDto) throws ParseException {
		return dao.saveOrUpdate(ImageMapper.dtoToEntity(imageDto));
	}

}
