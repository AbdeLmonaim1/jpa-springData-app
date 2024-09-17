package com.springapp.demo;

import com.springapp.demo.entities.*;
import com.springapp.demo.repository.ConsultationRepository;
import com.springapp.demo.repository.MedecinRepository;
import com.springapp.demo.repository.PatientRepository;
import com.springapp.demo.repository.RendezVousRepository;
import com.springapp.demo.services.IHospitalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class JpaAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(JpaAppApplication.class, args);
	}
//    @Bean
//
//	CommandLineRunner start(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
//      return args -> {
////		  Stream.of("Hassan", "Ali", "Sofia").forEach(name ->{
////			  Patient patient = new Patient();
////			  patient.setName(name);
////			  patient.setAge((int)(Math.random()*10));
////			  patient.setDateOfBirth(new Date());
////			  patient.setSick(Math.random()>0.5?true:false);
////			  patientRepository.save(patient);
////		  });
//
////		  Stream.of("Nourddein", "Ayoub", "Mustapha").forEach(name ->{
////			  Medecin medecin = new Medecin();
////			  medecin.setName(name);
////			  medecin.setAge((int)(Math.random()*100));
////			  medecin.setEmail(name+"@gmail.com");
////			  medecin.setSpecialite(Math.random()>0.5?"Cardiology":"Ophtalmology");
////			  medecinRepository.save(medecin);
////		  });
////          Patient patient = patientRepository.findByName("Ali");
////		  Medecin medecin = medecinRepository.findByName("Nourddein");
////		  RendezVous rendezVous = new RendezVous();
////		  rendezVous.setDate(new Date());
////		  rendezVous.setStatus(StatusRDV.PENDING);
////		  rendezVous.setMedecin(medecin);
////		  rendezVous.setPatient(patient);
////		  rendezVousRepository.save(rendezVous);
//		  RendezVous rendezVous = rendezVousRepository.findById(2L).get();
//		  Consultation consultation = new Consultation();
//		  consultation.setConsultationDate(new Date());
//		  consultation.setRapport("Rapport de la consultation ....");
//		  consultation.setRendezVous(rendezVous);
//		  consultationRepository.save(consultation);
//	  };
//	}
@Bean

CommandLineRunner start(IHospitalServices iHospitalServices) {
	return args -> {
//		  Stream.of("Jack", "Kevin", "Erling").forEach(name ->{
//			  Patient patient = new Patient();
//			  patient.setName(name);
//			  patient.setAge((int)(Math.random()*10));
//			  patient.setDateOfBirth(new Date());
//			  patient.setSick(Math.random()>0.5?true:false);
//			  iHospitalServices.savePatient(patient);
//		  });

//		  Stream.of("Guardiola", "Felick", "Mourinho").forEach(name ->{
//			  Medecin medecin = new Medecin();
//			  medecin.setName(name);
//			  medecin.setAge((int)(Math.random()*100));
//			  medecin.setEmail(name+"@gmail.com");
//			  medecin.setSpecialite(Math.random()>0.5?"Cardiology":"Ophtalmology");
//			  iHospitalServices.saveMedecin(medecin);
//		  });
//          Patient patient = iHospitalServices.findPatientByName("Kevin");
//		  Medecin medecin = iHospitalServices.findMedecinByName("Guardiola");
//		  RendezVous rendezVous = new RendezVous();
//		  rendezVous.setDate(new Date());
//		  rendezVous.setStatus(StatusRDV.PENDING);
//		  rendezVous.setMedecin(medecin);
//		  rendezVous.setPatient(patient);
//		  iHospitalServices.saveRendezVous(rendezVous);
//		RendezVous rendezVous1 = iHospitalServices.findRendezVous(3L);
//		Consultation consultation = new Consultation();
//		consultation.setConsultationDate(new Date());
//		consultation.setRapport("Rapport de la consultation Concernant RendezVous 3 ....");
//		consultation.setRendezVous(rendezVous1);
//		iHospitalServices.saveConsultation(consultation);
	};
}

}

