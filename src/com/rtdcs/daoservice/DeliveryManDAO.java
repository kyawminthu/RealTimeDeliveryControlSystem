package com.rtdcs.daoservice;

import java.util.List;

import com.rtdcs.dao.DeliveryMan;

public interface DeliveryManDAO {
	public boolean insertDeliveryMan(DeliveryMan deliveryMan);
	public boolean updateDeliveryMan(DeliveryMan deliveryMan);
	public DeliveryMan selectDeliveryManById(int id);
	public List<DeliveryMan> selectAllDeliveryMan();
}
