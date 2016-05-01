package com.rtdcs.daoservice;

import java.time.LocalDate;
import java.util.List;

import com.rtdcs.dao.DeliveryItem;;

public interface DeliveryItemDAO {
	public boolean insertDeliveryItem(DeliveryItem deliveryItem);
	public boolean updateDeliveryItem(DeliveryItem deliveryItem);
	public DeliveryItem selectDeliveryItemById(int id);
	public List<DeliveryItem> selectDeliveryItemByTargetDate(LocalDate targetDate);
	public List<DeliveryItem> selectDeliveryItemByCustomerName(String customerName);
	public List<DeliveryItem> selectAllDeliveryItem();
}
