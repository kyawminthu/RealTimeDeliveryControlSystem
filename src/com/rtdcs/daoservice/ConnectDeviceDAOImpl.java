package com.rtdcs.daoservice;

import java.sql.SQLException;
import java.util.List;

import com.rtdcs.dao.ConnectDevice;

public class ConnectDeviceDAOImpl extends AbstractDAO implements ConnectDeviceDAO {

	@Override
	public boolean insertConnectDevice(ConnectDevice device) {
		try {
			sqlMap.insert("insertDevice", device);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public boolean updateConnectDevice(ConnectDevice device) {
		try {
			sqlMap.update("updateDevice", device);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public boolean deleteConnectDeviceByDeliveryMan(String deliveryManId) {
		try {
			sqlMap.delete("deleteDeviceByDeliveryMan", deliveryManId);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public ConnectDevice selectConnectDeviceById(int id) {
		ConnectDevice device = null;
		try {
			device = (ConnectDevice) sqlMap.queryForObject("getByID", id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return device;
	}

	@Override
	public ConnectDevice selectConnectDeviceByDeliveryMan(String deliveryManId) {
		ConnectDevice device = null;
		try {
			device = (ConnectDevice) sqlMap.queryForObject("getByDeliveryMan", deliveryManId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return device;
	}

	@Override
	public ConnectDevice selectConnectDeviceByToken(String token) {
		ConnectDevice device = null;
		try {
			device = (ConnectDevice) sqlMap.queryForObject("getByToken", token);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return device;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ConnectDevice> selectAllConnectDevice() {
		List<ConnectDevice> connectDevices = null;
		try {
			connectDevices = sqlMap.queryForList("getAll");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connectDevices;
	}

}
