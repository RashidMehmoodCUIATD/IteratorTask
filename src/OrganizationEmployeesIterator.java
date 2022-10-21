import java.security.PublicKey;
import java.util.ArrayList;

public class OrganizationEmployeesIterator {
    int indexForIterator=0;
    ArrayList<Employee> emps;

    public OrganizationEmployeesIterator(Organization orgToWorkON){
        this.emps=orgToWorkON.Employees;
    }
    public void First(){

        indexForIterator=0;
    }
    public void Next(){
if(indexForIterator==emps.size())
{
    throw new ArrayIndexOutOfBoundsException("Already on last Element");
}
else{
        indexForIterator++;
    }}
    public Employee currentItem(){
        return  emps.get(indexForIterator);
    }

    public boolean isDone(){
        if(indexForIterator<emps.size())return false;
        else return true;
    }







}
