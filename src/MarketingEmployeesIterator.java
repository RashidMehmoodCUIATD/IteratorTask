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
    if(indexForIterator>employees.size()-1){
        throw new ArrayIndexOutOfBoundsException("No more Elements");
    }
        indexForIterator++;


        if(!isDone()){
        while(!(employees.get(indexForIterator).Department=="Marketing"))
        {
            if(!isDone()){
            indexForIterator++;  }}}

    }



    public boolean isDone(){

        if(indexForIterator<employees.size())
        {return false;}
        else {return true;}



    }
    public Employee currentItem(){

        return employees.get(indexForIterator);
    }




}
