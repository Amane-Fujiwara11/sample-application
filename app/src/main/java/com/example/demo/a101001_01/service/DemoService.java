package com.example.demo.a101001_01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.a101001_01.dto.ReceiveMessageDto;
import com.example.demo.a101001_01.repository.DemoRepository;

@Service
public class DemoService implements I_DemoService {

	@Autowired
	DemoRepository repository;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void sendMessage(ReceiveMessageDto receiveMessageDto) {

		repository.post();

	}

}
