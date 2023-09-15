class EmployeeInfo {

    int salary;
    int number_of_hour;


    public void GetInfo(int s, int n) {
        salary=s;
       number_of_hour=n;

    }

    public void AddWork() {
        if (number_of_hour> 6) {
            salary = salary + 5;
            System.out.println("new Salary is"+salary);



        } else {
            System.out.println("your Salary is same");
        }
    }





}
    public class SalaryInfo {
        public static void main(String[] args) {
            EmployeeInfo emp1 = new EmployeeInfo();
            emp1.GetInfo(5000, 7);
             emp1.AddWork();

        }
    }

