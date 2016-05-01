package com.rtdcs.service;

import java.time.LocalDate;
import java.util.List;

import com.rtdcs.dao.DeliveryItem;

public interface DeliveryItemService {
	public boolean insertDeliveryItem(DeliveryItem deliveryItem);
	public boolean updateDeliveryItem(DeliveryItem deliveryItem);
	public boolean updateDeliveryItemByCustomerRequest(DeliveryItem deliveryItem);
	public boolean deleteDeliveryItem(int deliveryItemId);
	public List<DeliveryItem> getDeliveryItemByDate(LocalDate date);
	public List<DeliveryItem> getDeliveryItemByCustomerName(String customerName);
	public List<DeliveryItem> getAllDeliveryItem();
}
