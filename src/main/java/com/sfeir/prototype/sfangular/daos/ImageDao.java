package com.sfeir.prototype.sfangular.daos;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sfeir.prototype.sfangular.entities.ImageEntity;
@Repository
public class ImageDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Long saveOrUpdate(ImageEntity imageEntity) {
		sessionFactory.getCurrentSession().saveOrUpdate(imageEntity);
		return imageEntity.getId();
	}

}
