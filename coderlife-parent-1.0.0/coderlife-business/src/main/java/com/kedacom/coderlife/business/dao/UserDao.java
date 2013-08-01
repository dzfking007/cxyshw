package com.kedacom.coderlife.business.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kedacom.coderlife.business.adapter.JdbcDaoAdapter;
import com.kedacom.coderlife.business.model.User;

/***
 * 用户相关Dao
  * @author <a href="mailto:zhuyaoyao@kedacom.com">zhuyaoyao</a>
  * @date 2013-8-1
 */
@Repository("userDao")
public class UserDao extends JdbcDaoAdapter{
	
	
	protected static final RowMapper<User> userRowMapper; 
	
	static{
		
		userRowMapper = new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setPassword(rs.getString("password"));
				return u;
			}
		};
	}
	
	

	private static final String GET_USER = "select * from users where username = ? ";

	/**
	 * 根据用户名获取用户
	  * @return
	 */
	public User getUser(String username){
		
		try {
			
			return super.getSimpleJdbcTemplate().queryForObject(GET_USER, userRowMapper, username);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		
	}
	
	
}
