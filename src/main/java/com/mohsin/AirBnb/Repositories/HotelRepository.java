package com.mohsin.AirBnb.Repositories;

import com.mohsin.AirBnb.Entities.HotelEntity;
import com.mohsin.AirBnb.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<HotelEntity,Long> {
    List<HotelEntity> findByOwner(UserEntity user);
}
