package com.rtdcs.daoservice;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.rtdcs.dao.DeliveryItem;

public class DeliveryItemDAOImpl extends AbstractDAO implements DeliveryItemDAO {

	@Override
	public boolean insertDeliveryItem(DeliveryItem deliveryItem) {
		try {
			sqlMap.insert("insertDeliveryItem", deliveryItem);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public boolean updateDeliveryItem(DeliveryItem deliveryItem) {
		try {
			sqlMap.update("updateDeliveryItem", deliveryItem);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public DeliveryItem selectDeliveryItemById(int id) {
		DeliveryItem item = null;
		try {
			item = (DeliveryItem) sqlMap.queryForObject("getByID", id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return item;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DeliveryItem> selectDeliveryItemByTargetDate(LocalDate targetDate) {
		List<DeliveryItem> items = null;
		try {
			DeliveryItem paramItem = new DeliveryItem(targetDate);
			items = sqlMap.queryForList("getByTargetDate", paramItem);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return items;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DeliveryItem> selectDeliveryItemByCustomerName(String customerName) {
		List<DeliveryItem> items = null;
		try {
			items = sqlMap.queryForList("getByCustomerName", customerName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return items;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DeliveryItem> selectAllDeliveryItem() {
		List<DeliveryItem> items = null;
		try {
			items = sqlMap.queryForList("getAll");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return items;
	}

}
