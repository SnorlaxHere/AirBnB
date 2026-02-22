package com.mohsin.AirBnb.Repositories;

import com.mohsin.AirBnb.Entities.BookingEntity;
import com.mohsin.AirBnb.Entities.HotelEntity;
import com.mohsin.AirBnb.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Long> {
    Optional<BookingEntity> findByPaymentSessionId(String sessionId);

    List<BookingEntity> findByHotel(HotelEntity hotel);

    List<BookingEntity> findByHotelAndCreatedAtBetween(HotelEntity hotel, LocalDateTime startDateTime, LocalDateTime endDateTime);

    List<BookingEntity> findByUser(UserEntity user);
}
