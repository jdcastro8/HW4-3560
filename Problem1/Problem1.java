public class Problem1 {
    public static void main(String[] args) {

        SalariedEmployee employee1 =
                new SalariedEmployee("Joe", "Jones",
                        "111-11-1111", 2500);

        HourlyEmployee employee2 =
                new HourlyEmployee("Stephanie", "Smith",
                        "222-22-2222", 25, 32);

        HourlyEmployee employee3 =
                new HourlyEmployee("Mary", "Quinn",
                        "333-33-3333", 19, 47);

        CommissionEmployee employee4 =
                new CommissionEmployee("Nicole", "Dior",
                        "444-44-4444", 15, 50000);

        SalariedEmployee employee5 =
                new SalariedEmployee("Renwa", "Chanel",
                        "555-55-5555", 1700);

        BaseEmployee employee6 =
                new BaseEmployee("Mike", "Davenport",
                        "666-66-6666", 95000);

        CommissionEmployee employee7 =
                new CommissionEmployee("Mahnaz", "Vaziri",
                        "777-77-7777", 22, 40000);

        employee1.print();
        System.out.println();

        employee2.print();
        System.out.println();

        employee3.print();
        System.out.println();

        employee4.print();
        System.out.println();

        employee5.print();
        System.out.println();

        employee6.print();
        System.out.println();

        employee7.print();
    }
}
