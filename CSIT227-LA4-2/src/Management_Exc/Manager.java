package Management_Exc;

public class Manager extends Employee {
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    /**
     * TODO this implementation
     * @param e the employee to be given raise
     * @param raise the raise
     * @throws IllegalArgumentException when raise is negative
     */
    public void giveRaise(Employee e, double raise) {

        if(raise < 0){
            throw new IllegalArgumentException();
        }

        double increase = e.getsalary() + raise;
        e.setsalary(increase);
    }

    @Override
    public String toString() {
        return "Mgr. " +super.toString();
    }
}
