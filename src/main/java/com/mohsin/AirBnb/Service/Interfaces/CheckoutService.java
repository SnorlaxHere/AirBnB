package com.mohsin.AirBnb.Service.Interfaces;


import com.mohsin.AirBnb.Entities.BookingEntity;

public interface CheckoutService {

    String getCheckoutSession(BookingEntity booking, String successUrl, String failureUrl);

}
