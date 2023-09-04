package com.example.demo.a101001_01.repository;

import org.springframework.stereotype.Repository;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class DemoRepository {

	public void post() {
		log.info("Post Complete");
	}
}
