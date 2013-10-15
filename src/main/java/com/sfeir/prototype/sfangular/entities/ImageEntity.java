package com.sfeir.prototype.sfangular.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Image")
@Table(name = "image")
public class ImageEntity {
	@Id
	/*@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "SEQ_RIGHTS", allocationSize = 1)*/
	@Column(name = "ID")
	private Long id = null;
	
	@Column(name = "LABEL")
	private String label = null;
	
	@Column(name = "BACKGROUND")
	private String background = null;
	
	@Column(name = "OBJECTS")
	private String objects = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getObjects() {
		return objects;
	}

	public void setObjects(String objects) {
		this.objects = objects;
	}

	
}
