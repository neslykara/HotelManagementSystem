package com.tpe.service;

import com.tpe.domain.Hotel;
import com.tpe.repository.HotelRepository;

import java.util.Scanner;

public class HotelService {
    private Scanner scanner = new Scanner(System.in);
    private final HotelRepository hotelRepository ;

    //paramlı const.

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    //1-c : save Hotel
    public  void saveHotel(){
        Hotel hotel = new Hotel();

        System.out.println("Enter Hotel ID : ");
        hotel.setId(scanner.nextLong());
        scanner.nextLine();

        System.out.println("Enter Hotel Name : ");
        hotel.setName(scanner.nextLine());

        System.out.println("Enter Hotel Location : ");
        hotel.setLocation(scanner.nextLine());

        hotelRepository.save(hotel);

        System.out.println("Hotel is saved succesfully. Hotel ID : "+hotel.getId());

    }

}