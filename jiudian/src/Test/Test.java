package Test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wlj.pojo.Checkin;
import com.wlj.util.SqlSessionFactoryUtil;

public class Test {
	public static void main(String[] args) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		List<Checkin> selectList = session.selectList("com.wlj.mapper.CheckinMapper.selectAll");
		for (Checkin checkin : selectList) {
			System.out.println(checkin);
		}
	}
}
