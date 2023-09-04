package com.example.demo.a101001_01.service;

import com.example.demo.a101001_01.dto.ReceiveMessageDto;

public interface I_DemoService {

	/**
	 * 処理説明：sample-applicationのserviceクラス.<br>
	 * ビジネスロジックを実施する.
	 * 
	 * @param receiveMessageDto JSONから取得した項目を格納したDTO
	 */
	void sendMessage(ReceiveMessageDto receiveMessageDto);
}
