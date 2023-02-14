package next_level_project_1.parser;

import next_level_project_1.entity.Type;


import java.util.List;

public class Parser {
    public static String parseToString(String value, boolean require, List<String> errors) {
        boolean isAllowed = checkRequir(value, require, errors);
        if (!isAllowed) {
            errors.add("Value" + value + " is not allowed");
            return null;
        }

        return value;
    }

    public static Integer parseToInt(String value, boolean require, List<String> errors) {
        boolean isValue = !checkRequir(value, require, errors);
        if (!isValue) {
            return null;
        }
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            errors.add("Value" + value + " is not a number");
            return null;
        }

    }


    public static Long parseToLong(String value, boolean require, List<String> errors) {
        boolean isAllowed = checkRequir(value, require, errors);
        if (!isAllowed) {
            errors.add("Value" + value + " is not allowed");
            return null;
        }
        try {
            return Long.parseLong(value);
        } catch (NumberFormatException e) {
            errors.add("Value" + value + " is not a number");
            return null;
        }

    }

    public static Double parseToDouble(String value, boolean require, List<String> errors) {
        boolean isAllowed = checkRequir(value, require, errors);
        if (!isAllowed) {
            errors.add("Value" + value + " is not allowed");
            return null;
        }
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            errors.add("Value" + value + " is not a (decimal)number");
            return null;
        } catch (NullPointerException e) {
            errors.add("Can not pars to double blank String" + value);
        }

        return null;
    }

    public static Type parseEnum(String code, boolean require, List<String> errors) {
        boolean isAllowed = !checkRequir(code, require, errors);
        if (code == null) {
            errors.add("Value code is null");
            return null;
        }
        if (!isAllowed) {
            errors.add("Value" + code + " is not allowed");
            return null;
        }
        Type[] enumValues = Type.values();
        Type resultType = null;
//        Type[] arrayType = new Type[2];
//        arrayType[0] =Type.CREDIT;
//        arrayType[1] = Type.DEBIT;
        for (Type enumValue : enumValues) {
            if (enumValue.getCode().equalsIgnoreCase(code)) {
                resultType = enumValue;
            }
            if (resultType == null) {
                errors.add("Type with" + code + "is not exist");
            }
        }
        return resultType;
    }

    private static boolean checkRequir(String value, boolean require, List<String> errors) {
        if (require) {
            if (value.isBlank()) {
                errors.add("Value" + value + " is not allowed");
                return false;
            }
        }
        return true;
    }
}
