package com.rtdcs.daoservice;

import java.time.LocalDateTime;
import java.util.List;

import com.rtdcs.dao.PushedNoti;

public interface PushedNotiDAO {
	public boolean insertPushedNoti(PushedNoti itemAssign);
	public boolean updatePushedNoti(PushedNoti itemAssign);
	public PushedNoti selectPushedNotiById(int id);
	public List<PushedNoti> selectPushedNotiByDeliveryMan(String deliveryManId);
	public List<PushedNoti> selectNewNotiByDeliveryMan(String deliveryManId, LocalDateTime lastUpdatedDate);
	public List<PushedNoti> selectPushedNotiByAssignItem(int assignItemId);
	public List<PushedNoti> selectAllPushedNoti();
}
