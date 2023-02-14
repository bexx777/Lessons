package next_level_project_1.entity;

import java.util.Objects;

public class Order {
    private static Long inCounter = 0L;
    private Long id;

    public Order() {
        inCounter += 1;
        this.id = inCounter;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(getId(), order.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
