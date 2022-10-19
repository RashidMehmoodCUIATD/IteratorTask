public class Main {
    public static void main(String[] args) {
        Organization Or1=new Organization();

        Or1.Employees.add(new Employee(1,"Adil", 34,"Taxation",78000.56));
        Or1.Employees.add(new Employee(2,"Rashid", 35,"Management",38000.56));
        Or1.Employees.add(new Employee(3,"kashif", 36,"ObBoarding",48000.56));
        Or1.Employees.add(new Employee(3,"mehran", 16,"ObBoarding",48000.56));
        Or1.Employees.add(new Employee(3,"sultan", 30,"ObBoarding",48000.56));

        Or1.Employees.add(new Employee(4,"altaf", 37,"Marketing",28000.56));
        Or1.Employees.add(new Employee(5,"haider", 38,"Taxation",98000.56));
        Or1.Employees.add(new Employee(6,"majid", 39,"Management",68000.56));
        Or1.Employees.add(new Employee(7,"sarfaraz", 40,"Taxation",58000.56));
        Or1.Employees.add(new Employee(8,"babar", 23,"ObBoarding",18000.56));
        Or1.Employees.add(new Employee(9,"najam", 19,"Marketing",88000.56));



        //testing Age Iterator
        OrganizationAgeIterator ageIterator=Or1.GetAgeIterator();
        System.out.println(Or1.Employees.get(ageIterator.iteratorIndex).Name);

        ageIterator.First();
        System.out.println(Or1.Employees.get(ageIterator.iteratorIndex).Name);
ageIterator.Next();
        System.out.println(Or1.Employees.get(ageIterator.iteratorIndex).Name);


        System.out.println("++++++++++++++++++++++");
        ageIterator.First();

        while(!ageIterator.isDone()){
            System.out.println(Or1.Employees.get(ageIterator.iteratorIndex).Name);
            ageIterator.Next();



        }




    }
}