class Four3 {
    public static void main(String[] args) {
        DailyWorker dw = new DailyWorker();
        float dp = dw.ComPay(7, 4);
        System.out.println(dp);

        SalariedWorker sw = new SalariedWorker();
        float sp = sw.ComPay();
        System.out.println(sp);
    }
}

class Worker {
    String name;
    float salaryrate;

    // 1hr -> Rs.50/-
}

class DailyWorker extends Worker {
    float ComPay(int hrs, int days) {
        salaryrate = 50*hrs*days;
        return salaryrate;
    }
}

class SalariedWorker extends Worker {
    float ComPay() {
        salaryrate = 50*40;
        return salaryrate;
    }
}