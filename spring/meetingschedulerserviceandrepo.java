
#RepoInterface of meeting scheduler

List<Meeting> findBySchedulerName(String schedulerName)//accept the name of the scheduler and return all the meetings scheduled by the scheduler as List<Meeting>

List<Meeting> findBySchedulerNameAndMeetingDate(String schedulerName,LocalDate meetingDate)//accept the name of the scheduler and the meeting date and return all the meetings scheduled by the scheduler on the date as List<Meeting>.

List<Meeting> findByTeamNameAndMeetingDate(String teamName,LocalDate meetingDate)//accept the name of the team na d meeting date and return the all the meetings scheduled for the team on the given date as List<Meeting>




#Service Layer of the meeting scheduler qp

List<MeetingDTO> getAllMeetingOfScheduler(String schedulerName)
{
 List<Meeting> newList=meetingRepository.findBySchedulerName(schedulerName);
 if(newList.isEmpty()==true)
   throw new MeetingSchedulerMeetingException("MeetingService.NO_MEETINGS_FOUND");
 List<MeetingDTO> newDto=new ArrayList<>();
 for(Meeting new:newList)
 {
   MeetingDTO dto=MeetingDTO.prepareDTO(new);
   newDto.add(dto);
 }
 return newDto;
}

MeetingDTO scheduleMeeting(MeetingDTO meetingDTO)
{
 MeetingValidator.validateMeeting(meetingDTO);
 List<Meeting> newMeeting=meetingRepository.findBySchedulerNameAndMeetingDate(meetingDTO.getSchedulerName(),meetingDTO.getMeetingDate());
 if(newMeeting.isEmpty()==false)
 {
   throw new MeetingSchedulerException("MeetingServiceException.MEETING_DATE_UNAVAILABLE");
 }
 List<Meeting> newTeam=meetingRepository.findByTeamNameAndMeetingDate(meetingDTO.getTeamName(),meetingDTO.getMeetingDate());
 if(newTeam.isEmpty()==false)
 {
    throw new MeetingSchedulerException("MeetingService.TEAM_UNAVAILABLE");
 }
 Meeting obj=MeetingDTO.prepareEntity(meetingDTO);
 meetingRepository.save(obj);
 int newId=obj.getMeetingId();
 meetingDTO.setMeetingId(newId);
 return meetingDTO;
}
 
 
 