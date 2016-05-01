package com.rtdcs.service;

import java.time.LocalDate;
import java.util.List;

import com.rtdcs.dao.DeliveryItem;
import com.rtdcs.daoservice.DeliveryItemDAO;
import com.rtdcs.daoservice.ItemAssignDAO;
import com.rtdcs.daoservice.PushedNotiDAO;

public class DeliveryItemServiceImpl implements DeliveryItemService {
	
	private DeliveryItemDAO deliveryItemDAO;
	private PushedNotiDAO pushedNotiDAO;
	private ItemAssignDAO itemAssignDAO;

	public ItemAssignDAO getItemAssignDAO() {
		return itemAssignDAO;
	}

	public void setItemAssignDAO(ItemAssignDAO itemAssignDAO) {
		this.itemAssignDAO = itemAssignDAO;
	}

	public PushedNotiDAO getPushedNotiDAO() {
		return pushedNotiDAO;
	}

	public void setPushedNotiDAO(PushedNotiDAO pushedNotiDAO) {
		this.pushedNotiDAO = pushedNotiDAO;
	}

	public DeliveryItemDAO getDeliveryItemDAO() {
		return deliveryItemDAO;
	}

	public void setDeliveryItemDAO(DeliveryItemDAO deliveryItemDAO) {
		this.deliveryItemDAO = deliveryItemDAO;
	}

	@Override
	public boolean insertDeliveryItem(DeliveryItem deliveryItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateDeliveryItem(DeliveryItem deliveryItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteDeliveryItem(int deliveryItemId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<DeliveryItem> getDeliveryItemByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DeliveryItem> getDeliveryItemByCustomerName(String customerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DeliveryItem> getAllDeliveryItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateDeliveryItemByCustomerRequest(DeliveryItem deliveryItem) {
		// TODO Auto-generated method stub
		return false;
	}

}
