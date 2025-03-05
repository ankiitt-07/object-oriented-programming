import java.util.*;

class Doctor{
    private String doctorName;
    private String doctorSpecialty;
    private final ArrayList<Patient> patients;

    public Doctor(String doctorName, String doctorSpecialty) {
        this.doctorName = doctorName;
        this.doctorSpecialty = doctorSpecialty;
        this.patients = new ArrayList<>();
    }

    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public String getDoctorSpecialty() {
        return doctorSpecialty;
    }
    public void setDoctorSpecialty(String doctorSpecialty) {
        this.doctorSpecialty = doctorSpecialty;
    }
    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
        patient.addDoctor(this);
    }
}

class Hospital{
    private String hospitalName;
    private final ArrayList<Patient> patients;
    private final ArrayList<Doctor> doctors;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }

    public String getHospitalName() {
        return hospitalName;
    }
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }
    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
}

class Patient{
    private String patientName;
    private int age;
    private final ArrayList<Doctor> doctors;

    public Patient(String patientName, int age) {
        this.patientName = patientName;
        this.age = age;
        this.doctors = new ArrayList<>();
    }

    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }
}

public class HospitalDoctorsPatient {
    public static void main(String[] args) {
        Hospital fortis = new Hospital("Fortis");

        Doctor ent = new Doctor("Harry", "ENT");
        Doctor cardiologist = new Doctor("John", "Cardiology");

        Patient p1 = new Patient("Jack", 30);
        Patient p2 = new Patient("Jane", 30);

        fortis.addDoctor(ent);
        fortis.addDoctor(cardiologist);
        fortis.addPatient(p1);
        fortis.addPatient(p2);

        ent.consult(p2);
        cardiologist.consult(p1);
        cardiologist.consult(p2);


        System.out.println("Total Number of Doctors in fortis: " + fortis.getDoctors().size());
        System.out.println("Total Number of Patients in fortis: " + fortis.getPatients().size());

        System.out.println("Cardiologist's Patients: ");
        for (Patient p : cardiologist.getPatients()) {
            System.out.println(p.getPatientName());
        }

    }
}
