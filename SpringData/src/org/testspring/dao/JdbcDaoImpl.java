package org.testspring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.testspring.model.Circle;

@Component
public class JdbcDaoImpl {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//Read Operation
	
	public int getCircleCount(){
		String sql = "SELECT COUNT(*) FROM CIRCLE";
		return jdbcTemplate.queryForInt(sql);
	}
	
	public String getCircleName(int circleId){
		String sql = "SELECT name FROM circle WHERE id=?";
		return jdbcTemplate.queryForObject(sql,new Object[]{circleId}, String.class);
	}
	
	public Circle getCircleForId(int circleId){
		String sql = "SELECT * FROM circle WHERE id=?";
		return jdbcTemplate.queryForObject(sql,new Object[]{circleId},new CircleMapper());
	}
	
	public List<Circle> getAllCircles(){
		String sql = "SELECT * FROM CIRCLE";
		return jdbcTemplate.query(sql, new CircleMapper());
	}
	
	//Inner Mapper class as it is specific to Circle Object
	public static final class CircleMapper implements RowMapper{

		@Override
		public Object mapRow(ResultSet resultSet, int rowNum)throws SQLException {
			Circle circle = new Circle();
			circle.setId(resultSet.getInt("ID"));
			circle.setName(resultSet.getString("Name"));
			return circle;
		}
		
	}
	
	//Insert Operation
	
	public void insertCircle(Circle circle){
		String sql = "INSERT INTO CIRCLE (ID, NAME) VALUES(?,?)";
		jdbcTemplate.update(sql,new Object[]{circle.getId(), circle.getName()});
	}
	
	//DDL Operation
	
		public void createTriangle(){
			String sql = "CREATE TABLE triangle(ID INTEGER, name VARCHAR(50))";
			jdbcTemplate.execute(sql);
		}
}
