import java.util.ArrayList;

public class MarketingEmployeesIterator {

    ///Marketing
    ArrayList<Employee> employees;

    int indexForIterator=0;
public MarketingEmployeesIterator(Organization orgToWorkON){
    this.employees=orgToWorkON.Employees;
    First();
}
    public void First(){
        indexForIterator=0;
        while(!(employees.get(indexForIterator).Department=="Marketing"))
        {indexForIterator++;  }
    }
    public void Next(){
    if(!isDone()){ indexForIterator++;
        while(!(employees.get(indexForIterator).Department=="Marketing"))
       {indexForIterator++;  }}

    }



    public boolean isDone(){

        if(indexForIterator<=employees.size()-1)
        {return false;}
        else {return true;}



    }
    public Employee currentItem(){

        return employees.get(indexForIterator);
    }




}
