package next_level_project_1.entity;

import java.util.List;
import java.util.Objects;

public class User {
    private static Long idCounter =0L;
    private String firstName;
    private String lastName;
    private String address;
    private Integer citiCode;
    private Long phoneNumber;
    private Long orderId;
    private List<BankAcc> bankAccList;

    public User(String firstName, String lastName, String address, Integer citiCode, Long phoneNumber, Long orderId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.citiCode = citiCode;
        this.phoneNumber = phoneNumber;
        this.orderId = orderId;
    }

    public static Long getIdCounter() {
        return idCounter;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public Integer getCitiCode() {
        return citiCode;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public Long getOrderId() {
        return orderId;
    }

    public List<BankAcc> getBankAccList() {
        return bankAccList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getFirstName(), user.getFirstName()) && Objects.equals(getLastName(), user.getLastName()) && Objects.equals(getAddress(), user.getAddress()) && Objects.equals(getCitiCode(), user.getCitiCode()) && Objects.equals(getPhoneNumber(), user.getPhoneNumber()) && Objects.equals(getOrderId(), user.getOrderId()) && Objects.equals(getBankAccList(), user.getBankAccList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAddress(), getCitiCode(), getPhoneNumber(), getOrderId(), getBankAccList());
    }
}
