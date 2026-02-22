package com.mohsin.AirBnb.Repositories;

import com.mohsin.AirBnb.Dto.GuestDTO;
import com.mohsin.AirBnb.Entities.GuestEntity;
import com.mohsin.AirBnb.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository<GuestEntity, Long> {
    List<GuestDTO> findByUser(UserEntity user);
}
