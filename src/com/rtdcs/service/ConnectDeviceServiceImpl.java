package com.rtdcs.service;

import java.util.List;

import com.rtdcs.dao.ConnectDevice;
import com.rtdcs.daoservice.ConnectDeviceDAO;
import com.rtdcs.daoservice.DeliveryManDAO;

public class ConnectDeviceServiceImpl implements ConnectDeviceService {
	
	private ConnectDeviceDAO connectDeviceDAO;
	private DeliveryManDAO deliveryManDAO;

	public ConnectDeviceDAO getConnectDeviceDAO() {
		return connectDeviceDAO;
	}

	public void setConnectDeviceDAO(ConnectDeviceDAO connectDeviceDAO) {
		this.connectDeviceDAO = connectDeviceDAO;
	}

	public DeliveryManDAO getDeliveryManDAO() {
		return deliveryManDAO;
	}

	public void setDeliveryManDAO(DeliveryManDAO deliveryManDAO) {
		this.deliveryManDAO = deliveryManDAO;
	}

	@Override
	public boolean insertConnectDevice() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateConnectDevice() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ConnectDevice getConnectDeviceByDeliveryMan(String deliveryManId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ConnectDevice> getAllConnectDevice() {
		// TODO Auto-generated method stub
		return null;
	}

}
