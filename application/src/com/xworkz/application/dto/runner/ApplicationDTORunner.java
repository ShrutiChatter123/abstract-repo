package com.xworkz.application.dto.runner;

import java.time.LocalDate;

import com.xworkz.application.dto.ApplicationDTO;

public class ApplicationDTORunner {

	public static void main(String[] args) {

		ApplicationDTO  applicationDTO= new ApplicationDTO();
		applicationDTO.setName("Instagram");
		applicationDTO.setDevelopedBy("mark developer");
		applicationDTO.setSize(2.34D);
		applicationDTO.setAvailablity("PlayStore");
		applicationDTO.setAttendDate(LocalDate.of(2019,5, 11));
		
		System.out.println(applicationDTO.hashCode());
		
		System.out.println(applicationDTO);
	}

}
