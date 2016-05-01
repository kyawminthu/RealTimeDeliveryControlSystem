package com.rtdcs.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class DeliveryItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8242193881483410125L;
	
	private int id;
	private String name;
	private String description;
	private String customerName;
	private String location;
	private LocalDate targetDate;
	private int status;
	private byte[] customerSignature;
	private String receivedLocation;
	private LocalDateTime receivedTime;
	private LocalDateTime createDate;
	private LocalDateTime updateDate;
	
	public DeliveryItem() {
		
	}

	public DeliveryItem(LocalDate targetDate) {
		super();
		this.targetDate = targetDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public byte[] getCustomerSignature() {
		return customerSignature;
	}

	public void setCustomerSignature(byte[] customerSignature) {
		this.customerSignature = customerSignature;
	}

	public String getReceivedLocation() {
		return receivedLocation;
	}

	public void setReceivedLocation(String receivedLocation) {
		this.receivedLocation = receivedLocation;
	}

	public LocalDateTime getReceivedTime() {
		return receivedTime;
	}

	public void setReceivedTime(LocalDateTime receivedTime) {
		this.receivedTime = receivedTime;
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

	@Override
	public String toString() {
		return "DeliveryItem [id=" + id + ", name=" + name + ", description=" + description + ", customerName="
				+ customerName + ", location=" + location + ", target=" + targetDate + ", status=" + status
				+ ", customerSignature=" + Arrays.toString(customerSignature) + ", receivedLocation="
				+ receivedLocation + ", receivedTime=" + receivedTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + Arrays.hashCode(customerSignature);
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((receivedLocation == null) ? 0 : receivedLocation.hashCode());
		result = prime * result + ((receivedTime == null) ? 0 : receivedTime.hashCode());
		result = prime * result + status;
		result = prime * result + ((targetDate == null) ? 0 : targetDate.hashCode());
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
		DeliveryItem other = (DeliveryItem) obj;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (!Arrays.equals(customerSignature, other.customerSignature))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (receivedLocation == null) {
			if (other.receivedLocation != null)
				return false;
		} else if (!receivedLocation.equals(other.receivedLocation))
			return false;
		if (receivedTime == null) {
			if (other.receivedTime != null)
				return false;
		} else if (!receivedTime.equals(other.receivedTime))
			return false;
		if (status != other.status)
			return false;
		if (targetDate == null) {
			if (other.targetDate != null)
				return false;
		} else if (!targetDate.equals(other.targetDate))
			return false;
		return true;
	}
}
