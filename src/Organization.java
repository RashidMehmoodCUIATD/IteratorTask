import java.util.ArrayList;

public class Organization {
    public ArrayList<Employee> Employees=new ArrayList<>();



     public OrganizationAgeIterator GetAgeIterator(){

         return new OrganizationAgeIterator(this);
    }
    public MarketingEmployeesIterator GetMarketingPeople(){

        return new MarketingEmployeesIterator(this);
    }
}

