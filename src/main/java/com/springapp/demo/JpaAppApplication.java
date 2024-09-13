package com.springapp.demo;

import com.springapp.demo.entities.Patient;
import com.springapp.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class JpaAppApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < 100; i++) {
			Patient patient = new Patient(null, "Ali" + i, "Kamil" + i, 30, new Date(), Math.random()>0.5 ? true: false, (int) (Math.random() * 100));
			patientRepository.save(patient);
		}

//		List<Patient> patients = patientRepository.findAll();
//		for (Patient p : patients) {
//			System.out.println(p.getId());
//			System.out.println(p.getLname());
//		}
		//Bring a page of registration with a specific size
		Page<Patient> patients = patientRepository.findAll(PageRequest.of(0, 5));
		System.out.println("Total pages is : " + patients.getTotalPages());
		patients.forEach(p -> {
			System.out.println(p.getId());
			System.out.println(p.getLname());
			//System.out.println("isSick : " + p.isSick());
			System.out.println("-----------");
		});
//		System.out.println("***************************");
//		Patient patient3 = patientRepository.findById(2L).orElse(null);
//		System.out.println(patient3.getFname()+", "+patient3.getLname());
//		patient3.setSick(false);
//		patientRepository.save(patient3);
        List<Patient> sickPatient = patientRepository.findBySick(true);
		sickPatient.forEach(patient -> {
			System.out.println(patient.getId()+", "+patient.getFname()+", "+patient.getAge());
		});
		System.out.println("----------Sick Patient with pagenation---------------");
		Page<Patient> sickPagePatient = patientRepository.findBySick(true, PageRequest.of(0, 7));
		sickPagePatient.forEach(sp ->{
			System.out.println(sp.getId());
			System.out.println(sp.getLname());
			System.out.println(sp.getDateOfBirth());
			System.out.println("is sick : "+sp.isSick());
			System.out.println("---------------------");
		});
		System.out.println("----------Sick Patient with score less than x ---------------");
		List<Patient> sickPatientScore = patientRepository.findBySickAndScoreLessThan(true, 40);
		sickPatientScore.forEach(p ->{
			System.out.println(p.getId());
			System.out.println(p.getLname());
			System.out.println(p.getScore());
			System.out.println("---------------------");
		});
		System.out.println("----------Patient with lname like x and score less than y ---------------");
		List<Patient> patientNameScore = patientRepository.findPatients("%mil%", 30);
		patientNameScore.forEach(p ->{
			System.out.println(p.getId());
			System.out.println(p.getLname());
			System.out.println(p.getScore());
			System.out.println("---------------------");
		});
	}
}

