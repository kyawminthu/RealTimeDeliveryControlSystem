package com.rtdcs.dao;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ConnectDevice implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4955618378954024295L;

	private int id;
	private String token;
	private String deliveryManId;
	private LocalDateTime createDate;
	private LocalDateTime updateDate;
	private DeliveryMan deliveryMan; 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getDeliveryManId() {
		return deliveryManId;
	}

	public void setDeliveryManId(String deliveryManId) {
		this.deliveryManId = deliveryManId;
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

	public DeliveryMan getDeliveryMan() {
		return deliveryMan;
	}

	public void setDeliveryMan(DeliveryMan deliveryMan) {
		this.deliveryMan = deliveryMan;
	}

	@Override
	public String toString() {
		return "ConnectDevice [id=" + id + ", token=" + token + ", deliveryManId=" + deliveryManId + ", createDate="
				+ createDate + ", updateDate=" + updateDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deliveryManId == null) ? 0 : deliveryManId.hashCode());
		result = prime * result + id;
		result = prime * result + ((token == null) ? 0 : token.hashCode());
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
		ConnectDevice other = (ConnectDevice) obj;
		if (deliveryManId == null) {
			if (other.deliveryManId != null)
				return false;
		} else if (!deliveryManId.equals(other.deliveryManId))
			return false;
		if (id != other.id)
			return false;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		return true;
	}

}
