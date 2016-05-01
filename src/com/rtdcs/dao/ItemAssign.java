package com.rtdcs.dao;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ItemAssign implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7310183639031839610L;

	private int id;
	private int deliveryItemId;
	private String deliveryManId;
	private int status;
	private String failedReason;
	private LocalDateTime assignDate;
	private LocalDateTime createDate;
	private LocalDateTime updateDate;
	private DeliveryItem deliveryItem;
	private DeliveryMan deliveryMan;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDeliveryItemId() {
		return deliveryItemId;
	}

	public void setDeliveryItemId(int deliveryItemId) {
		this.deliveryItemId = deliveryItemId;
	}

	public String getDeliveryManId() {
		return deliveryManId;
	}

	public void setDeliveryManId(String deliveryManId) {
		this.deliveryManId = deliveryManId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getFailedReason() {
		return failedReason;
	}

	public void setFailedReason(String failedReason) {
		this.failedReason = failedReason;
	}

	public LocalDateTime getAssignDate() {
		return assignDate;
	}

	public void setAssignDate(LocalDateTime assignDate) {
		this.assignDate = assignDate;
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

	public DeliveryItem getDeliveryItem() {
		return deliveryItem;
	}

	public void setDeliveryItem(DeliveryItem deliveryItem) {
		this.deliveryItem = deliveryItem;
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
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + deliveryItemId;
		result = prime * result + ((deliveryManId == null) ? 0 : deliveryManId.hashCode());
		result = prime * result + ((failedReason == null) ? 0 : failedReason.hashCode());
		result = prime * result + id;
		result = prime * result + status;
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
		ItemAssign other = (ItemAssign) obj;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (deliveryItemId != other.deliveryItemId)
			return false;
		if (deliveryManId == null) {
			if (other.deliveryManId != null)
				return false;
		} else if (!deliveryManId.equals(other.deliveryManId))
			return false;
		if (failedReason == null) {
			if (other.failedReason != null)
				return false;
		} else if (!failedReason.equals(other.failedReason))
			return false;
		if (id != other.id)
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ItemAssign [id=" + id + ", deliveryItemId=" + deliveryItemId + ", deliveryManId=" + deliveryManId
				+ ", status=" + status + ", failedNote=" + failedReason + ", assignDate=" + assignDate + ", createDate="
				+ createDate + ", updateDate=" + updateDate + "]";
	}
}
