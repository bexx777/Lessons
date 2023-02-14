package next_level_project_1.entity;

public enum Type {
    CREDIT("C",1),DEBIT("D",2);

    private String code;
    private int id;

    public String getCode() {
        return code;
    }

    public int getId() {
        return id;
    }

    Type(String code, int id) {
        this.code = code;
        this.id =id;
    }
}
