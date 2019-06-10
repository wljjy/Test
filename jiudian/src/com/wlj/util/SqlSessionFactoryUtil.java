package com.wlj.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtil {
	private static Reader is;
	private static SqlSessionFactory factory;
	
	static {
		try {
			 is= Resources.getResourceAsReader("mybatis.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static SqlSessionFactory getFactory(){
		if(factory==null){
			factory = new SqlSessionFactoryBuilder().build(is);
		}
		return factory;
	}
	
	public static SqlSession  getSession(){
		SqlSession session=getFactory().openSession();
		return session;
	}
}
