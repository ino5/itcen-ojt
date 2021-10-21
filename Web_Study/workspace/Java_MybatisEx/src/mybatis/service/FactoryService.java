package mybatis.service;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FactoryService {
	private static SqlSessionFactory factory;
	
	static {
		try {
			/* 먼저 Mybatis 설정 파일인 config.xml 파일로부터 설정 정보를 읽어들이기
			 * 위한 입력 스트림을  생성한다.
			 */
			Reader reader = Resources.getResourceAsReader("mybatis/config/config.xml");
			
			/*
			 * 그러고 나서 입력 스트림을 통해 config.xml 파일을 읽어
			 * SqlSessionFactory 객체를 생성한다.
			 */
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
