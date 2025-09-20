package com.ferkan.schuled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component	
public class ScheduledExample {

	// * * * * * *
	@Scheduled(cron = "* * 5 * * * ")
	public void write1to10() {
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
	}
}
