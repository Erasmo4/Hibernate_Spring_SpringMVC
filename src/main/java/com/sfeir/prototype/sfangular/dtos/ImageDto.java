package com.sfeir.prototype.sfangular.dtos;

import java.io.Serializable;

public class ImageDto implements Serializable {
	private static final long serialVersionUID = 7436064035407952614L;

	private Long id = null;

	private String label = null;
	
	private String background = null;
	
	private Object objects = null;
	

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

	public Object getObjects() {
		return objects;
	}

	public void setObjects(Object objects) {
		this.objects = objects;
	}
	
	

}
