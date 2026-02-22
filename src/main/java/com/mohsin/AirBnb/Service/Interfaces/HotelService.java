package com.mohsin.AirBnb.Service.Interfaces;

import com.mohsin.AirBnb.Dto.HotelDTO;
import com.mohsin.AirBnb.Dto.HotelInfoDto;

import java.util.List;

public interface HotelService {
    HotelDTO createNewHotel(HotelDTO hotelDto);
    HotelDTO getHotelById(Long id);
    HotelDTO updateHotelById(Long id, HotelDTO hotelDto);
    void deleteHotelById(Long id);
    void activateHotel(Long hotelId);
    HotelInfoDto getHotelInfoById(Long hotelId);
    List<HotelDTO> getAllHotels();
}
