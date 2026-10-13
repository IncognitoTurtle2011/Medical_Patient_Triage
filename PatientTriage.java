public class PatientTriage {
    public static void main(String[] args)
        {

        }
    
        public static void triage(Patient p)
            {
                if 
            }
}

class Patient {
    String name;
    int age;
    int BloodPressure;
    int heartRate;

     public static Patient createPatient(String name, int age, int BloodPressure, int heartRate)
        {
            Patient p = new Patient();
            p.name = name;
            p.age = age;
            p.BloodPressure = BloodPressure;
            p.heartRate = heartRate;
            return p;
        }
}
