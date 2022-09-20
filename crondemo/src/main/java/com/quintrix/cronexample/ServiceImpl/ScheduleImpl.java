package com.quintrix.cronexample.ServiceImpl;
import java.time.LocalDateTime;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleImpl {
	
	@Scheduled(cron="*/10*****")
	public static void display() {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Hello there" + dt.now());

	}
	
	@Scheduled(cron="*/10*****")
	public void display1() {
		LocalDateTime dt = LocalDateTime.now();
		
		System.out.println("Scheduling for every 10 seconds ...");
	}

}
