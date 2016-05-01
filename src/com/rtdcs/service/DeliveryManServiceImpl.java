package com.rtdcs.service;

import com.rtdcs.dao.DeliveryMan;
import com.rtdcs.daoservice.DeliveryManDAO;

public class DeliveryManServiceImpl implements DeliveryManService {
	
	private DeliveryManDAO deliveryManDAO;

	public DeliveryManDAO getDeliveryManDAO() {
		return deliveryManDAO;
	}

	public void setDeliveryManDAO(DeliveryManDAO deliveryManDAO) {
		this.deliveryManDAO = deliveryManDAO;
	}

	@Override
	public boolean insertDeliveryMan(DeliveryMan deliveryMan) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateDeliveryMan(DeliveryMan deliveryMan) {
		// TODO Auto-generated method stub
		return false;
	}

}
