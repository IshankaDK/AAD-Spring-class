package lk.ijse.spring.dto;

/**
 * @author ishanka on 6/5/21 at 9:44 PM
 * @since 0.0.1
 */
public class CustomerDTO {
    private String id;
    private String name;
    private String address;
    private double salary;

    public CustomerDTO() {
    }

    public CustomerDTO(String id, String name, String address, double salary) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setSalary(salary);
    }



    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
