package lk.ijse.spring.dto;

/**
 * @author ishanka on 5/30/21 at 11:16 PM
 * @since 0.0.1
 */
public class CustomerDTO {
    private String id;
    private String name;
    private String address;
    private String salary;


    public CustomerDTO() {
    }

    public CustomerDTO(String id, String name, String address, String salary) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setSalary(salary);
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
