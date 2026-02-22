package com.mohsin.AirBnb.Repositories;

import com.mohsin.AirBnb.Entities.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<RoomEntity,Long> {
}
