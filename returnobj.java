class Employee{
    double salary;
    Employee(double salary){
      this.salary = salary;
    }
    Employee updateSalary(double salary){
      Employee employee = new Employee(this.salary+salary);
      return employee;
    }
    double getSalary(){
      return this.salary;
    }
  }
  class returnobj{
    public static void main(String args[]){
      Employee Rishit = new Employee(34029.48);
      Employee Aksh;
      Aksh=Rishit.updateSalary(6295.28);
      System.out.println("Salary of Rishit is: "+Rishit.getSalary());
      System.out.println("Salary of Aksh is: "+Aksh.getSalary());
    }
  }