package com.hot.shop.admin.model.service;

import java.util.HashMap;

import com.hot.shop.admin.model.vo.Auction;
import com.hot.shop.admin.model.vo.SellForm;

public interface AdminService {

	int auctionInput(Auction au);

	HashMap<String, Object> auctionCheck();
	
	void BIDScheduler();

	HashMap<String, Object> BIDInfo(int currentPage,int formNo);

	Auction outputAucionInfo(int auctionNo);

	int sellInput(SellForm sf);

	HashMap<String, Object> sellFormCheck();

	int sellUpdate(SellForm sf);

	HashMap<String, Integer> countOutput();

	void countInput();
}
