package Proxy;

public class DataRepository implements IDataRepository {

    @Override
    public CitizenData getCitizenData(String nationalId) {
        System.out.println("Getting citizen data for national id: " + nationalId + " from database");

        return new CitizenData(
                "Ahmed",
                "Elbaz",
                nationalId,
                "Sharqia",
                "0122395894984",
                "ahmedelbaz@gmail.com"
        );
    }
}
