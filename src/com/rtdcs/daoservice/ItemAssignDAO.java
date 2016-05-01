package com.rtdcs.daoservice;

import java.util.List;

import com.rtdcs.dao.ItemAssign;

public interface ItemAssignDAO {
	public boolean insertItemAssign(ItemAssign itemAssign);
	public boolean updateItemAssign(ItemAssign itemAssign);
	public ItemAssign selectItemAssignById(int id);
	public List<ItemAssign> selectItemAssignByDeliveryMan(String deliveryManId);
	public List<ItemAssign> selectTodayTodoListByDeliveryMan(ItemAssign itemAssign);
	public List<ItemAssign> selectItemAssignByDeliveryItem(int deliveryItemId);
	public List<ItemAssign> selectAllItemAssign();
}
