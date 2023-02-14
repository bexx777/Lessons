package next_level_project_1.entity;

import java.util.Objects;

public class BankAcc {
    private final Long id;
    private Long kontoNr;
    private Long bankId;
    private Double balance;
    private Long orderId;
    private User user;
    private Type typeEnum;

    public BankAcc(Long kontoNr, Long bankId, Double balance, Long orderId, User user, Type typeEnum) {
        idCounter +=1;
        this.id = id;
        this.kontoNr = kontoNr;
        this.bankId = bankId;
        this.balance = balance;
        this.orderId = orderId;
        this.user = user;
        this.typeEnum = typeEnum;
    }
}
