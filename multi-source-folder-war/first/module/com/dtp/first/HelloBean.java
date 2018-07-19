package com.dtp.first;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;

import com.dtp.first.FirstModel;
import com.dtp.first2.FirstModelDao;

public class HelloBean {

	@Autowired
	private FirstModelDao firstModelDao;
	
	public void init() {
		ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
		Runnable task = () -> {
			FirstModel firstModel = firstModelDao.createFirstModel();
			IntStream.range(0, 10).forEach(e -> System.out.println(firstModel.toString() + e));
		};
		executor.schedule(task, 5, TimeUnit.SECONDS);
	}
}
