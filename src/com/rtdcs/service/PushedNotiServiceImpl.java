package com.rtdcs.service;

import java.time.LocalDateTime;

import com.rtdcs.dao.PushedNoti;
import com.rtdcs.daoservice.DeliveryManDAO;
import com.rtdcs.daoservice.ItemAssignDAO;
import com.rtdcs.daoservice.PushedNotiDAO;

public class PushedNotiServiceImpl implements PushedNotiService {
	private PushedNotiDAO pushedNotiDAO;
	private DeliveryManDAO deliveryManDAO;
	private ItemAssignDAO itemAssignDAO;
	
	public PushedNotiDAO getPushedNotiDAO() {
		return pushedNotiDAO;
	}

	public void setPushedNotiDAO(PushedNotiDAO pushedNotiDAO) {
		this.pushedNotiDAO = pushedNotiDAO;
	}

	public DeliveryManDAO getDeliveryManDAO() {
		return deliveryManDAO;
	}

	public void setDeliveryManDAO(DeliveryManDAO deliveryManDAO) {
		this.deliveryManDAO = deliveryManDAO;
	}

	public ItemAssignDAO getItemAssignDAO() {
		return itemAssignDAO;
	}

	public void setItemAssignDAO(ItemAssignDAO itemAssignDAO) {
		this.itemAssignDAO = itemAssignDAO;
	}

	@Override
	public boolean insertPushedNoti(PushedNoti pushedNoti) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePushedNoti(PushedNoti pushedNoti) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getNewPushedNotiForDeliveryMan(String deliveryManId, LocalDateTime lastRead) {
		// TODO Auto-generated method stub
		return false;
	}

}
