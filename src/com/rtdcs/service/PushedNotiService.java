package com.rtdcs.service;

import java.time.LocalDateTime;

import com.rtdcs.dao.PushedNoti;

public interface PushedNotiService {
	public boolean insertPushedNoti(PushedNoti pushedNoti);
	public boolean updatePushedNoti(PushedNoti pushedNoti);
	public boolean getNewPushedNotiForDeliveryMan(String deliveryManId, LocalDateTime lastRead);
}
