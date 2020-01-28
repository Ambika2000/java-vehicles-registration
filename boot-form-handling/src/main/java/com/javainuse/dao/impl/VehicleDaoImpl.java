package com.javainuse.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.javainuse.dao.VehicleDao;
import com.javainuse.model.Vehicle;

@Repository
public class VehicleDaoImpl extends JdbcDaoSupport implements VehicleDao{
	
	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	@Override
	public void insertVehicle(Vehicle v) {
		String sql = "INSERT INTO vehicle " + "(Number,State_Code,RTO_Code,RTO_Count, Vehicle_Type) VALUES (?, ?, ?, ?, ?)";
		getJdbcTemplate().update(sql, new Object[]{
				v.getNumber(), v.getState_Code(), v.getRTO_Code(), v.getRTO_Count(), v.getVehicle_Type()
		});
	}
	
	@Override
	public void insertVehicles(final List<Vehicle> vehicles) {
		String sql = "INSERT INTO vehicle " + "(Number,State_Code,RTO_Code,RTO_Count, Vehicle_Type) VALUES (?, ?, ?, ?, ?)";
		getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Vehicle vehicle = vehicles.get(i);
				ps.setString(1, vehicle.getNumber());
				ps.setString(2, vehicle.getState_Code());
				ps.setInt(3, vehicle.getRTO_Code());
				ps.setInt(4, vehicle.getRTO_Count());
				ps.setString(5, vehicle.getVehicle_Type());
			}
			
			public int getBatchSize() {
				return vehicles.size();
			}
		});

	}
	@Override
	public List<Vehicle> getAllVehicles(){
		String sql = "SELECT * FROM vehicle";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<Vehicle> result = new ArrayList<Vehicle>();
		for(Map<String, Object> row:rows){
			Vehicle v = new Vehicle();
			v.setNumber((String)row.get("Number"));
			v.setState_Code((String)row.get("State_Code"));
			v.setRTO_Code((int)row.get("RTO_Code"));
			v.setRTO_Count((int)row.get("RTO_Count"));
			v.setVehicle_Type((String)row.get("Vehicle_Type"));
			result.add(v);
		}
		
		return result;
	}


@Override
public Vehicle getbyVNumber(String VNumber) {
	String sql = "SELECT * FROM theatre WHERE Number = ?";

	return (Vehicle)getJdbcTemplate().queryForObject(sql, new Object[]{VNumber}, new RowMapper<Vehicle>(){

		@Override
		public Vehicle mapRow(ResultSet rs, int rwNumber) throws SQLException 
		{
			Vehicle v = new Vehicle();
			v.setVNumber(rs.getString("VNumber"));
			t.setName(rs.getString("Name"));
			t.setCapacity(rs.getInt("Capacity"));
			t.setAddress(rs.getString("Address"));
			t.setMall_City(rs.getString("Mall_City"));
			t.setType(rs.getString("Type"));
			t.setType_of_Show(rs.getString("Type_of_Show"));
			t.setRevenue(rs.getInt("Revenue"));
			t.setIs_Budget(rs.getString("Is_Budget"));
			
			return t;

		}
 
	});

}
