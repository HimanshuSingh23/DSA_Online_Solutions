Double calculateBookingAmount(int noOfSeats,String screenName)
{
   double bookingAmount=0.0;
   if(screenName.equals("Rhombus"))
     bookingAmount=100*noOfSeats;
   else if(screenName.equals("Sapphire"))
     bookingAmount=100*noOfSeats;
   else if(screenName.equals("Turquoise"))
     bookingAmount=100*noOfSeats;
   return bookingAmount;
   

}
MovieBookingDTO bookMovie(MovieBookingDTO movieBookingDTO)
{
   MovieBookingValidator.validate(movieBookingDTO);
   List<MovieBooking> mBookList= movieBookingRepsoitory.getBookingDetails(movieBookingDTO.getcustomerPhoneNO,movieBookingDTO.showDate);
   if(mBookList.isEmpty()==false)
   {
     throw new MovieBookingException("MovieBookingService.BOOKING_EXISTS");
   }
   MovieBooking myMovieBooking=MovieBookingDTO.prepareEntity(movieBookingDTO);
   myMovieBooking.setbookingAmount(calculateBookingAmount(myMovieBooking.getNoOfSeats,myMovieBooking.getscreenName);
   int newID=movieBookingRepository.save(myMovieBooking).getbookingId;
   movieBookingDTO.setbookingId(newId);
   MovieBookingDTO newDTO=MovieBookingRepository.prepareDTO(myMovieBooking);
   return newDTO;
}
List<MovieBookingDTO> getBookingByScreenName(String screenName)
{
List<MovieBooking> newList=movieBookingRepository.findByScreenName(screenName);
if(newList.isEmpty==true)
  throw new MovieBookingException("MovieBookingService.NO_BOOKING);
List<MovieBookingDTO> newDtoList=new ArrayList<>();
for(MovieBooking iterate:newList)
{
  MovieBookingDTO dto=MovieBookingDTO.prepareDTO(iterate);
  newDtoList.add(dto);
}
return newDtoList;















}




