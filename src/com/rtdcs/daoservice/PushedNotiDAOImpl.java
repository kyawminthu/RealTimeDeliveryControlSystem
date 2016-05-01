package com.rtdcs.daoservice;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import com.rtdcs.dao.PushedNoti;

public class PushedNotiDAOImpl extends AbstractDAO implements PushedNotiDAO {

	@Override
	public boolean insertPushedNoti(PushedNoti itemAssign) {
		try {
			sqlMap.insert("insertNoti", itemAssign);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public boolean updatePushedNoti(PushedNoti itemAssign) {
		try {
			sqlMap.update("updateNoti", itemAssign);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public PushedNoti selectPushedNotiById(int id) {
		PushedNoti noti = null;
		try {
			noti = (PushedNoti) sqlMap.queryForObject("getByID", id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return noti;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PushedNoti> selectPushedNotiByDeliveryMan(String deliveryManId) {
		List<PushedNoti> notis = null;
		try {
			notis = sqlMap.queryForList("getByDeliveryMan", deliveryManId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return notis;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PushedNoti> selectNewNotiByDeliveryMan(String deliveryManId, LocalDateTime lastUpdatedDate) {
		List<PushedNoti> notis = null;
		try {
			PushedNoti param = new PushedNoti(deliveryManId, lastUpdatedDate);
			notis = sqlMap.queryForList("getNewNotiByDeliveryMan", param);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return notis;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PushedNoti> selectPushedNotiByAssignItem(int assignItemId) {
		List<PushedNoti> notis = null;
		try {
			notis = sqlMap.queryForList("getByAssignItem", assignItemId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return notis;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PushedNoti> selectAllPushedNoti() {
		List<PushedNoti> notis = null;
		try {
			notis = sqlMap.queryForList("getAll");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return notis;
	}

}
