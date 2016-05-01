package com.rtdcs.daoservice;

import java.sql.SQLException;
import java.util.List;

import com.rtdcs.dao.DeliveryMan;

public class DeliveryManDAOImpl extends AbstractDAO implements DeliveryManDAO {

	@Override
	public boolean insertDeliveryMan(DeliveryMan deliveryMan) {
		try {
			sqlMap.insert("insertDeliveryMan", deliveryMan);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public boolean updateDeliveryMan(DeliveryMan deliveryMan) {
		try {
			sqlMap.update("updateDeliveryMan", deliveryMan);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public DeliveryMan selectDeliveryManById(int id) {
		DeliveryMan deliveryMan = null;
		try {
			deliveryMan = (DeliveryMan) sqlMap.queryForObject("getByID", id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return deliveryMan;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DeliveryMan> selectAllDeliveryMan() {
		List<DeliveryMan> deliveryMen = null;
		try {
			deliveryMen = sqlMap.queryForList("getAll");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deliveryMen;
	}

}
