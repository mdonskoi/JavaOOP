package ItAssociate;

/**
 * Created by mikhail on 11/10/15.
 */
public class Hr extends Person {
    public Hr(String name, int basicSalary, int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return (basicSalary * 1) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
    }
}
