class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}
class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

class TaxCalculator {

    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {

        if (!isIndian) {
            throw new CountryNotValidException(
                    "The employee should be an Indian citizen for calculating tax");
        }
        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException(
                    "The employee name cannot be empty");
        }
        if (empSal > 100000) {
            return empSal * 8 / 100;
        } else if (empSal >= 50000) {
            return empSal * 6 / 100;
        } else if (empSal >= 30000) {
            return empSal * 5 / 100;
        } else if (empSal >= 10000) {
            return empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException(
                    "The employee does not need to pay tax");
        }
    }
}
public class CalculatorSimulator {

    public static void main(String[] args) {

        TaxCalculator calculator = new TaxCalculator();
        String empName = "jack";
        boolean isIndian = true;
        double empSal = 55000;

        try {
            double tax = calculator.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is " + tax);

        } catch (CountryNotValidException e) {
            e.printStackTrace();
            System.out.println("Country not valid: " + e.getMessage());

        } catch (EmployeeNameInvalidException e) {
            e.printStackTrace();
            System.out.println("Employee name not valid: " + e.getMessage());

        } catch (TaxNotEligibleException e) {
            e.printStackTrace();
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
        }
    }
}