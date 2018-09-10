package com.scrapper.web.orm.book;

import java.util.List;

import com.scrapper.web.orm.book.vo.BookVO;

public interface BookDAO {
	public List<BookVO> selectBookListAll();
}
