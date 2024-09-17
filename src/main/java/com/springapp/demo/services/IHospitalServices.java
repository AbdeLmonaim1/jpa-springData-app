package com.springapp.demo.services;

import com.springapp.demo.entities.Consultation;
import com.springapp.demo.entities.Medecin;
import com.springapp.demo.entities.Patient;
import com.springapp.demo.entities.RendezVous;

public interface IHospitalServices {
     Patient savePatient(Patient patient);
     Medecin saveMedecin(Medecin medecin);
     RendezVous saveRendezVous(RendezVous rendezVous);
     Consultation saveConsultation(Consultation consultation);
     Patient findPatientByName(String name);
    Medecin findMedecinByName(String name);
    RendezVous findRendezVous(Long id);
}
