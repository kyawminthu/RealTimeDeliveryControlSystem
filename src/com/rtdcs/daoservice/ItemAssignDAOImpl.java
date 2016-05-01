package com.rtdcs.daoservice;

import java.sql.SQLException;
import java.util.List;

import com.rtdcs.dao.ItemAssign;

public class ItemAssignDAOImpl extends AbstractDAO implements ItemAssignDAO {

	@Override
	public boolean insertItemAssign(ItemAssign itemAssign) {
		try {
			sqlMap.insert("insertAssignItem", itemAssign);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public boolean updateItemAssign(ItemAssign itemAssign) {
		try {
			sqlMap.update("updateAssignItem", itemAssign);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public ItemAssign selectItemAssignById(int id) {
		ItemAssign itemAssign = null;
		try {
			itemAssign = (ItemAssign) sqlMap.queryForObject("getByID", id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return itemAssign;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ItemAssign> selectItemAssignByDeliveryMan(String deliveryManId) {
		List<ItemAssign> itemsAssign = null;
		try {
			itemsAssign = sqlMap.queryForList("getByDeliveryMan", deliveryManId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return itemsAssign;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ItemAssign> selectTodayTodoListByDeliveryMan(ItemAssign itemAssign) {
		List<ItemAssign> itemsAssign = null;
		try {
			itemsAssign = sqlMap.queryForList("getTodayTodoListByDeliveryMan", itemAssign);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return itemsAssign;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ItemAssign> selectItemAssignByDeliveryItem(int deliveryItemId) {
		List<ItemAssign> itemsAssign = null;
		try {
			itemsAssign = sqlMap.queryForList("getByDeliveryItem", deliveryItemId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return itemsAssign;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ItemAssign> selectAllItemAssign() {
		List<ItemAssign> itemsAssign = null;
		try {
			itemsAssign = sqlMap.queryForList("getAll");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return itemsAssign;
	}

}
