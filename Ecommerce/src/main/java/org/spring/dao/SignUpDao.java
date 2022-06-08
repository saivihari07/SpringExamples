package org.spring.dao;

import org.spring.model.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SignUpDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void saveData(SignUp signUp) {
		String sql = "insert into users values(?,?,?,?)";
		String sql1 = "insert into authorities values(?,?)";

		this.jdbcTemplate.update(sql,signUp.getUsername(),signUp.getPassword(),1,"safgkl");
		this.jdbcTemplate.update(sql1,signUp.getUsername(),"ADMIN");

		
	}
}
