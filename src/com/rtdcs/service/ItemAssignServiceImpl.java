package com.rtdcs.service;

import java.util.List;

import com.rtdcs.dao.ItemAssign;
import com.rtdcs.daoservice.DeliveryItemDAO;
import com.rtdcs.daoservice.DeliveryManDAO;
import com.rtdcs.daoservice.ItemAssignDAO;

public class ItemAssignServiceImpl implements ItemAssignService {
	private ItemAssignDAO itemAssignDAO;
	private DeliveryItemDAO deliveryItemDAO;
	private DeliveryManDAO deliveryManDAO;

	public ItemAssignDAO getItemAssignDAO() {
		return itemAssignDAO;
	}

	public void setItemAssignDAO(ItemAssignDAO itemAssignDAO) {
		this.itemAssignDAO = itemAssignDAO;
	}

	public DeliveryItemDAO getDeliveryItemDAO() {
		return deliveryItemDAO;
	}

	public void setDeliveryItemDAO(DeliveryItemDAO deliveryItemDAO) {
		this.deliveryItemDAO = deliveryItemDAO;
	}

	public DeliveryManDAO getDeliveryManDAO() {
		return deliveryManDAO;
	}

	public void setDeliveryManDAO(DeliveryManDAO deliveryManDAO) {
		this.deliveryManDAO = deliveryManDAO;
	}

	@Override
	public boolean assignItemDelivery(List<ItemAssign> assignItems) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateItemAssign(ItemAssign assignItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ItemAssign getItemAssignById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemAssign> getItemAssignByDeliveryMan(String deliveryManId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemAssign getItemAssignByDeliveryItem(int deliveryItemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemAssign> getItemAssignByCustomerName(String customerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemAssign> getTodayTodoListForDeliveryMan(String deliveryManId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemAssign> getAllItemAssign() {
		// TODO Auto-generated method stub
		return null;
	}

}
