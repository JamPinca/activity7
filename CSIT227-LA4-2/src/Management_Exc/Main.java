package Management_Exc;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param manager the manager to give the salary
     * @param employee the employee to receive the raise
     * @param salary the salary increase to be given
     * @throws ClassCastException when manager or employee is not a manager or employee
     * @throws IllegalArgumentException when salary is invalid
     * @throws NoSuchElementException when given manager or employee does not exist in the list of persons
     */
    public static void giveRaise(List<Person> persons, String manager, String employee, double salary) throws ClassCastException, IllegalArgumentException, NoSuchElementException {

        if(salary < 3000){
           throw new IllegalArgumentException();
        }

        int ctr2 = 0;
        Employee assignemployee = null;
        for(int i = 0; i < persons.size(); i++){
            if(persons.get(i).getName().equals(employee)){
                if( !(persons.get(i) instanceof Employee) )){
                    throw new ClassCastException();
                }

                assignemployee = (Employee) persons.get(i);
                ctr2++;
            }
        }

        if(ctr2 == 0){
            throw new NoSuchElementException();
        }

        int ctr = 0;
        Manager assignManager = null;
        for(int i = 0; i < persons.size(); i++){
            if(persons.get(i).getName().equals(manager)){
                if( !(persons.get(i) instanceof Employee) || !(persons.get(i) instanceof Manager)){
                    throw new ClassCastException();
                }

                assignManager = (Manager) persons.get(i);
                ctr++;
            }
        }

        if(ctr == 0){
            throw new NoSuchElementException();
        }

        assignManager.giveRaise(assignemployee, salary);
        return;
    }

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param developer the developer to be assigned
     * @param manager the manager assigned to the dev
     * @throws ClassCastException when manager or developer is not a manager or employee
     * @throws NoSuchElementException when given manager or developer does not exist in the list of persons
     * @throws IllegalStateException when developer already has a manager
     */
    public static void assignPM(List<Person> persons, String developer, String manager) {

        int ctr = 0;
        Manager assignmanager;
        for(Person p: persons){
            if(p.getName().equals(manager)){
                if(p instanceof Manager){

//                    if(((Developer) p).)

                    assignmanager = (Manager) p;
                } else {
                    throw new ClassCastException();
                }
            }

            if(ctr == 0){
                throw new NoSuchElementException();
            }

        ctr = 0;
        Developer assigndeveloper;
        for(Person p2: persons){
            if(p2.getName().equals(developer)){
                if(p2 instanceof Developer){

//                    if(((Developer) p).)
                    ((Developer)p2).setProjectManager(assignmanager);
                } else {
                    throw new ClassCastException();
                }
            }

            if(ctr == 0){
                throw new NoSuchElementException();
            }

            return;

        }
    }

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param customer the customer to speak to the employee
     * @param employee the employee to be spoken to
     * @return the dialogue of the customer to the employee
     * @throws IllegalArgumentException when given customer or employee is not what they are
     * @throws NoSuchElementException when given customer or employee is not in the list of persons
     */
    public static String customerSpeak(List<Person> persons, String customer, String employee) {

        for(Person p: persons){
            if(p instanceof Customer)
        }

        return null;
    }
}
