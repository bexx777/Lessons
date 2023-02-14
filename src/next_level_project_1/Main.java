package next_level_project_1;

import next_level_project_1.entity.BankAcc;
import next_level_project_1.entity.Order;
import next_level_project_1.entity.User;
import next_level_project_1.mapper.BankAccMapper;
import next_level_project_1.mapper.UserMapper;
import next_level_project_1.model.CsvRowModel;
import next_level_project_1.reader.CsvReader;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<List<String>> files = CsvReader.readFile();
        List<CsvRowModel> csvRowModels = new LinkedList<>();
        for (List<String> file : files) {
            Order order = null;
            for (int rowNumber = 1; rowNumber < file.size() + 1; rowNumber++) {
                String[] columnsOfRowAsArray = file.get(rowNumber - 1).split(";");
                List<String> columnsOfRow = new ArrayList<>(List.of(columnsOfRowAsArray));
                ArrayList<String> errors = new ArrayList<>();

                if (columnsOfRow.size() != 7) {
                    errors.add("Line: " + rowNumber + "Error: Number of Colons is not correct");
                }

                CsvRowModel rowModel = new CsvRowModel(columnsOfRow, errors, rowNumber);
                csvRowModels.add(rowModel);

                if (!errors.isEmpty()) {
                    printErrors(errors);
                    continue;
                }
                //todo fix it
                Map<String, Long> kontoDetails = getKontoDetails(bankAccIban, errors, lineNumber);
                if (!errors.isEmpty()) {
                    printErrors(errors);
                    continue;
                }

                if (order == null) {
                    order = new Order();
                }
                Long kontoNr = kontoDetails.get(KONTO_NR_KEY);
                Long bankId = kontoDetails.get(BANK_ID_KEY);
                BankAcc bankAcc = BankAccMapper.mapFromCsvModelToBankAcc(rowModel, kontoNr, bankId, order);
                User user = UserMapper.mapFromCsvModelToUser(rowModel, order);
                user.setBankAccId(bankAcc.getId());
                bankAcc.setUserId(user.getOrderId());
                bankAccServise.save(bankAcc);
                userServis.save(user);
            }
            orderServis.save(order);
            System.out.println("File");
            for (CsvRowModel csvRowModel : csvRowModels) {
                System.out.println(csvRowModel.printReportMessage());
            }
        }
    }



    private static final int IBAN_LENGTH = 14;
    private static final String KONTO_NR_KEY = "KontoNr";
    private static final String BANK_ID_KEY = "BankId";
    private static final int KONTO_LENGTH = 8;

    private static Map<String, Long> getKontoDetails(Long iban, List<String> errors, int lineNr) {
//      iban =  50010094569875
        String ibanAsString = String.valueOf(iban);
        if (ibanAsString.length() != IBAN_LENGTH) {
            errors.add("LineNr: " + lineNr + ". Iban length is not allowed. Expected length: " + IBAN_LENGTH + ", Actually Length: " + ibanAsString.length());
            return null;
        }
        //      ibanAsString =  "50010094569875"
        String kontoNrAsString = ibanAsString.substring(0, KONTO_LENGTH);
        //      ibanAsString    =  "50010094569875"
        //      kontoNrAsString =  "50010094"
        String bankIdAsString = ibanAsString.substring(KONTO_LENGTH);
        //      ibanAsString    =  "50010094569875"
        //      kontoNrAsString =  "50010094"
        //      bankIdAsString =  "569875"

        Long kontoNr = Long.parseLong(kontoNrAsString);
        Long banId = Long.parseLong(bankIdAsString);
        //     long kontoNr =  50010094
        //     long banId =  569875
        Map<String, Long> result = new HashMap<>();
        result.put(KONTO_NR_KEY, kontoNr);
        result.put(BANK_ID_KEY, banId);
        return result;
    }

    private static void printErrors(ArrayList<String> errors) {
        System.out.println(errors);
    }

}


    private static void printErrors(ArrayList<String> errors) {
        System.out.println(errors);
    }
}

