class Four5 {
    public static void main(String[] args) {
        Employee e = new Employee("Karan", 1705, 80000f);
        e.returname();
        e.returnsal();
        e.Increasesal(20);
    }
}

class Employee {
    String name;
    int empid;
    float salary;

    Employee() {
        this.name = "Ram";
        this.empid = 1013;
        this.salary = 25000f;
    }

    Employee(String n, int eid, float s) {
        this.name = n;
        this.empid = eid;
        this.salary = s;
    }

    void returname() {
        System.out.println(this.name);
    }

    void returnsal() {
        System.out.println(this.salary);
    }

    void Increasesal(float perc) {
        this.salary += (salary*perc)/100;
        System.out.println("Increased Salary: " + this.salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String n, int eid, float s, String dept) {
        this.name = n;
        this.empid = eid;
        this.salary = s;
        this.department = dept;
    }
}
