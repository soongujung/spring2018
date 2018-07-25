package com.scrapper.web.sample.rest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.scrapper.web.sample.rest.vo.SampleVO;

@RestController
public class SampleRestController {

	@RequestMapping(value="/sample/test1", method=RequestMethod.GET)
	public @ResponseBody SampleVO getSampleVO(){
		SampleVO vo = new SampleVO();
		vo.setCreaatedDate(new Date());
		vo.setName("Mr.John");
		return vo;
	}
}
