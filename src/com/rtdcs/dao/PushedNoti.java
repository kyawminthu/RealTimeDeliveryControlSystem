package com.rtdcs.dao;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PushedNoti implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9181829606597572332L;

	private int id;
	private int itemAssignId;
	private String text;
	private String deliveryManId;
	private LocalDateTime createDate;
	private LocalDateTime updateDate;
	private ItemAssign itemAssign;
	private DeliveryMan deliveryMan;
	
	public PushedNoti() {
		
	}

	public PushedNoti(String deliveryManId, LocalDateTime createDate) {
		super();
		this.deliveryManId = deliveryManId;
		this.createDate = createDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getItemAssignId() {
		return itemAssignId;
	}

	public void setItemAssignId(int itemAssignId) {
		this.itemAssignId = itemAssignId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	public String getDeliveryManId() {
		return deliveryManId;
	}

	public void setDeliveryManId(String deliveryManId) {
		this.deliveryManId = deliveryManId;
	}

	public ItemAssign getItemAssign() {
		return itemAssign;
	}

	public void setItemAssign(ItemAssign itemAssign) {
		this.itemAssign = itemAssign;
	}

	public DeliveryMan getDeliveryMan() {
		return deliveryMan;
	}

	public void setDeliveryMan(DeliveryMan deliveryMan) {
		this.deliveryMan = deliveryMan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deliveryManId == null) ? 0 : deliveryManId.hashCode());
		result = prime * result + id;
		result = prime * result + itemAssignId;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PushedNoti other = (PushedNoti) obj;
		if (deliveryManId == null) {
			if (other.deliveryManId != null)
				return false;
		} else if (!deliveryManId.equals(other.deliveryManId))
			return false;
		if (id != other.id)
			return false;
		if (itemAssignId != other.itemAssignId)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PushedNoti [id=" + id + ", itemAssignId=" + itemAssignId + ", text=" + text + ", deliveryManId="
				+ deliveryManId + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}
}
