package com.springapp.demo.services;

import com.springapp.demo.entities.Consultation;
import com.springapp.demo.entities.Medecin;
import com.springapp.demo.entities.Patient;
import com.springapp.demo.entities.RendezVous;
import com.springapp.demo.repository.ConsultationRepository;
import com.springapp.demo.repository.MedecinRepository;
import com.springapp.demo.repository.PatientRepository;
import com.springapp.demo.repository.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HospitalServicesImpl implements IHospitalServices{

    private PatientRepository patientRepository;

    private MedecinRepository medecinRepository;

    private RendezVousRepository rendezVousRepository;

    private ConsultationRepository consultationRepository;

    public HospitalServicesImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }


    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    @Override
    public Patient findPatientByName(String name) {
        Patient patient = patientRepository.findByName(name);
        return patient;
    }

    @Override
    public Medecin findMedecinByName(String name) {
        Medecin medecin = medecinRepository.findByName(name);
        return medecin;
    }

    @Override
    public RendezVous findRendezVous(Long id) {
        RendezVous rendezVous = rendezVousRepository.findById(id).get();
        return rendezVous;
    }
}
