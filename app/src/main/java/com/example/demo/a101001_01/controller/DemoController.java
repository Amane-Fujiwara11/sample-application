package com.example.demo.a101001_01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.demo.a101001_01.common.DemoConstants;
import com.example.demo.a101001_01.dto.ReceiveMessageDto;
import com.example.demo.a101001_01.service.I_DemoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class DemoController {

	@Autowired
	I_DemoService service;

	/**
	 * 処理説明：メッセージ受信.<br>
	 * 
	 * 
	 * @param jsonMessage 取得したメッセージ
	 * @throws JsonProcessingException JSONの処理に失敗した場合
	 * @throws JsonMappingException JSONのマッピングに失敗した場合
	 */
	public void receiveMessage(String jsonMessage)
			throws JsonProcessingException, JsonMappingException {

		log.info(DemoConstants.LOG_MESSAGE_START_PROCESS);

		// 受信したメッセージをDTOに格納
		ReceiveMessageDto receiveMessageDto = this.setReceiveMessageDto(jsonMessage);

		// DB登録
		service.sendMessage(receiveMessageDto);

		log.info(DemoConstants.LOG_MESSAGE_END_PROCESS);
	}

	/**
	 * 処理説明：メッセージ格納.<br>
	 * 受信したメッセージをDTOに格納する.
	 * 
	 * @param jsonMessage 取得したメッセージ
	 * @return JSONから取得した項目を格納したDTOを返す
	 * @throws JsonProcessingException JSONの処理に失敗した場合
	 * @throws JsonMappingException JSONのマッピングに失敗した場合
	 */
	private ReceiveMessageDto setReceiveMessageDto(String jsonMessage)
			throws JsonProcessingException, JsonMappingException {
		// String形式で取得したJSONをDTOに格納
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(jsonMessage, ReceiveMessageDto.class);
	}
}
