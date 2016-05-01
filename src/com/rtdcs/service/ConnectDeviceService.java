package com.rtdcs.service;

import java.util.List;

import com.rtdcs.dao.ConnectDevice;

public interface ConnectDeviceService {
	public boolean insertConnectDevice();
	public boolean updateConnectDevice();
	public ConnectDevice getConnectDeviceByDeliveryMan(String deliveryManId);
	public List<ConnectDevice> getAllConnectDevice();
}
