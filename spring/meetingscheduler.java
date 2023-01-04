#Meeting Scheduler
 




public Interface MeetingRepository extends Crudrepository<Meeting,Integer>
{
@Query(*select m from meeting m WHERE m.schedulerName=:schedulerName*)
List<Meeting> findBySchedulerName(String schedulerName)

@Query(* select m from meeting m WHERE m.schedulerName=:schedulerName AND m.meetingDate=:meetingDate*)
List<meeting> findBySchedulerNameANDMeetingDate(String schedulerName,LocalDate meetingDate)