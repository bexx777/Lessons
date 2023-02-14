package next_level_project_1.mapper;

import next_level_project_1.entity.Order;
import next_level_project_1.entity.User;
import next_level_project_1.model.CsvRowModel;

public class UserMapper {
    public static User mapFromCsvModelToUser(CsvRowModel rowModel, Order order){
        return new User(rowModel.getName(), rowModel.getLastName(), rowModel.getAddress(), rowModel.getCityCode(), rowModel.getPhoneNr(), order.getId());
    }
}
