package com.springapp.demo.repository;

import com.springapp.demo.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
  public List<Patient> findBySick(boolean m);
  Page<Patient> findBySick(boolean m, Pageable pageable);
  List<Patient> findBySickAndScoreLessThan(boolean m, int score);
  //List<Patient> findByDateBirthBetween(Date d1, Date d2);
  @Query("select p from Patient p where p.lname like :x and p.score < :y")
  List<Patient> findPatients(@Param("x") String lname, @Param("y") int score);
}
