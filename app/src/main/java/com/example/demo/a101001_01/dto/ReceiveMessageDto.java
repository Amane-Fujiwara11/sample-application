package com.example.demo.a101001_01.dto;

import org.springframework.stereotype.Component;
import lombok.Data;

/**
 * 受信したメッセージの内容を保持するDto.
 */
@Data
@Component
public class ReceiveMessageDto {

	/** タスクナンバー. */
	String taskNumber;

	/** タスク名. */
	String taskName;
}
