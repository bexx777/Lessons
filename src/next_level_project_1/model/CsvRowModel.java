package next_level_project_1.model;

import next_level_project_1.entity.Type;
import next_level_project_1.parser.Parser;

import java.util.List;

public class CsvRowModel {
    private final List<String> columnsOfRow;
    private final List<String> errors;
    private final int rowNumber;
    private String name;
    private String lastName;
    private String address;
    private Integer cityCode;
    private Long phoneNr;
    // BenkAcc
    private Long iban;
    private Double balance;
    private Type typeCode;

    public CsvRowModel(List<String> columnsOfRow, List<String> errors, int rowNumber) {
        this.columnsOfRow = columnsOfRow;
        this.errors = errors;
        this.rowNumber = rowNumber;
        init();

    }

    private void init() {
        name = Parser.parseToString(columnsOfRow.get(0), true, errors);
        lastName = Parser.parseToString(columnsOfRow.get(1), true, errors);
        address = Parser.parseToString(columnsOfRow.get(2), true, errors);
        cityCode = Parser.parseToInt(columnsOfRow.get(3), true, errors);
        phoneNr = Parser.parseToLong(columnsOfRow.get(4), true, errors);
        iban = Parser.parseToLong(columnsOfRow.get(5), true, errors);
        balance = Parser.parseToDouble(columnsOfRow.get(6), true, errors);
        typeCode = Parser.parseEnum(columnsOfRow.get(7), true, errors);
    }

    public String printReportMessage() {
        if (errors.isEmpty()) {
            return " String " + rowNumber + " import whiteout errors ";
        } else {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < errors.size(); i++) {
                String error = errors.get(i);
                builder.append("String :").append(rowNumber).append("Error").append(i + 1).append(": " + error + "\n");
            }
            return builder.toString();
        }
    }

        public List<String> getColumnsOfRow () {
            return columnsOfRow;
        }

        public List<String> getErrors () {
            return errors;
        }

        public int getRowNumber () {
            return rowNumber;
        }

        public String getName () {
            return name;
        }

        public String getLastName () {
            return lastName;
        }

        public String getAddress () {
            return address;
        }

        public Integer getCityCode () {
            return cityCode;
        }

        public Long getPhoneNr () {
            return phoneNr;
        }

        public Long getIban () {
            return iban;
        }

        public Double getBalance () {
            return balance;
        }

        public Type getTypeCode () {
            return typeCode;
        }
    }

