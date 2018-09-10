package com.scrapper.web.orm.book;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Repository;

import com.scrapper.web.orm.book.vo.BookVO;

@Repository
public class BookDAOImpl implements BookDAO{

	// 의심가는 부분
	@Resource(name="jpaSessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public List<BookVO> selectBookListAll() {
		String sql = "SELECT * FROM Book";
		NativeQuery<BookVO> query = sessionFactory.getCurrentSession().createNativeQuery(sql);
		List<BookVO> result = query.list();
		return result;
	}
	
}
