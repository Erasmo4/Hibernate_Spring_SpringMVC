package com.sfeir.prototype.sfangular.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sfeir.prototype.sfangular.dtos.ImageDto;
import com.sfeir.prototype.sfangular.exceptions.UserNotLoggedException;
import com.sfeir.prototype.sfangular.services.ImageService;

@Controller
@RequestMapping("/draw")
public class ImageController extends ParentController {
	
	private static final Logger logger = Logger.getLogger(ImageController.class);
	
	private String image=null;
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Autowired
	private ImageService service;
	
	@RequestMapping(
			method = RequestMethod.POST,
			value = "/saveImage")
	public @ResponseBody ImageDto save( HttpServletRequest request, HttpServletResponse response) {
		String parameter = request.getParameter("label");
		
		System.out.println(parameter);
		ImageDto result = new ImageDto() ;
	    // do something interesting
	    return result;
	}
	
//	public void save(
////	        HttpEntity<byte[]> requestEntity, 
//			HttpServletRequest request,
//	        HttpServletResponse response ) throws UserNotLoggedException, ParseException {
//		BufferedReader imageData;
//		try {
//			imageData = request.getReader();
//			System.out.println(imageData);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return;
	
//	public ResponseEntity<Map<String, Object>> save(@RequestBody ImageDto imageDto) throws UserNotLoggedException, ParseException {
//		super.checkAuthLogin();
//		
//		Long id = service.saveOrUpdate(imageDto);
//		
//		Map<String, Object> returnValues = new HashMap<String, Object>();
//		returnValues.put("id", id);
//		
//		return new ResponseEntity<Map<String, Object>>(returnValues, HttpStatus.OK);
//	}
}
