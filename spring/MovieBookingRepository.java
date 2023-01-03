#Movie booking
#MovieBooking is the entity class
#Type of the primary key is Integer



public Interface MovieBookingRepository extends CrudRepository<MovieBooking,Integer>

{
@Query(* select m from MovieBooking m where m.customerPhoneNo=:customerPhoneNo and m.showDate=:showDate*)
List<MovieBooking> getBookingDetails(Long customerPhoneNo,LocalDate showDate);
List<MovieBooking> findByScreenName(String screenName);
}



