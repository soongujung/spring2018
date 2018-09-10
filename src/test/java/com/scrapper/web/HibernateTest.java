package com.scrapper.web;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import com.scrapper.web.orm.book.BookDAO;



@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(
		locations = {
				"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
				"file:src/main/resources/config/*-context.xml"
		}
)
@Transactional
public class HibernateTest {
	@Autowired
	private WebApplicationContext wac;
	
	@Resource(name="bookDAOImpl") private BookDAO bookDAO;
	
	// MVC ������ ���� �׽�Ʈ�ϴ� mock-up ��ü
	private MockMvc mock;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HibernateTest.class);
	
	@Test
	public void getBookList(){
		bookDAO.selectBookListAll();
	}
	
}
