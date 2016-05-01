package com.rtdcs.daoservice;

import java.util.List;

import com.rtdcs.dao.ConnectDevice;

public interface ConnectDeviceDAO {
	public boolean insertConnectDevice(ConnectDevice device);
	public boolean updateConnectDevice(ConnectDevice device);
	public boolean deleteConnectDeviceByDeliveryMan(String deliveryManId);
	public ConnectDevice selectConnectDeviceById(int id);
	public ConnectDevice selectConnectDeviceByDeliveryMan(String deliveryManId);
	public ConnectDevice selectConnectDeviceByToken(String token);
	public List<ConnectDevice> selectAllConnectDevice();
}
