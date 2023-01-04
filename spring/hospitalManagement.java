#HospitalManagement

List<PatientDTO> getListOfPatients(String diagnosis)throws PatientAdmissionException
{
   List<Patient> newList=patientRepository.findByDiagnosis(diagnosis);
   if(newList.isEmpty()==true)
     throw new PatientAdmissionException("PatientService.PATIENT_UNAVAILABLE");
   List<PatientDTO> newDto=new ArrayList<>();
   for(Patient iterate:newList)
   {
     PatientDTO dto=PatientDTO.prepareDTO(iterate);
     newDto.add(dto)
   } 
   return newDto;
}
PatientDTO admitPatient(PatientDTO patientDTO)
{
  PatientValidator.validatePatient();
  Patient patient=PatientDTO.prepareEntity(patientDTO);
  patientRepository.save(patient);
  int newId=patient.getId();
  patientDTO.setId(newId);
  return patientDTO;

}





