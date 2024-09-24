package com.hotel.Paradise_Hotel.repository;

import com.hotel.Paradise_Hotel.model.BookedRoom;
import com.hotel.Paradise_Hotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<BookedRoom,Long> {



    List<BookedRoom> findByRoomId(Long roomId);


         Optional <BookedRoom> findByBookingConfirmationCode(String confirmationCode);
}
