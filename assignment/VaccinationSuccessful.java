class VaccinationSuccessful extends Vaccine {

    VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    void boosterDose() {
        if (firstDoseTaken) {
            System.out.println("Your Booster dose Successfully Done");
        } else {
            System.out.println("Booster dose not allowed without first dose");
        }
    }
}