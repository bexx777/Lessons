package next_level_project_1.mapper;

import next_level_project_1.entity.BankAcc;
import next_level_project_1.entity.Order;
import next_level_project_1.model.CsvRowModel;

public class BankAccMapper {
    public static BankAcc mapFromCsvModelToBankAcc (CsvRowModel rowModel,Long kontoNr,Long bankId, Order order) {
        return new BankAcc(kontoNr, bankId,rowModel.getBalance(), order.getId(), rowModel.getTypeCode());
    }
}
