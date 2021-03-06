package com.example.edu_institute.Repository;

import com.example.edu_institute.Entity.InstituteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstituteRepository extends JpaRepository <InstituteEntity, Long>  {
    @Query(value="SELECT * FROM `institute`", nativeQuery = true)
    List<InstituteEntity> SearchAllInstitute();;


}
