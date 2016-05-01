package com.rtdcs.service;

import com.rtdcs.dao.ItemAssign;

import java.util.List;

public interface ItemAssignService {
	public boolean assignItemDelivery(List<ItemAssign> assignItems);
	public boolean updateItemAssign(ItemAssign assignItem);
	public ItemAssign getItemAssignById(int id);
	public List<ItemAssign> getItemAssignByDeliveryMan(String deliveryManId);
	public ItemAssign getItemAssignByDeliveryItem(int deliveryItemId);
	public List<ItemAssign> getItemAssignByCustomerName(String customerName);
	public List<ItemAssign> getTodayTodoListForDeliveryMan(String deliveryManId);
	public List<ItemAssign> getAllItemAssign();
}
