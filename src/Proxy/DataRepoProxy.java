package Proxy;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class DataRepoProxy implements IDataRepository {
    private IDataRepository dataRepository;
    private HashMap<String, LocalDateTime> lastAccessTimes;

    public DataRepoProxy() {
        dataRepository = new DataRepository();
        lastAccessTimes = new HashMap<>();
    }

    @Override
    public CitizenData getCitizenData(String nationalId) {
        if(!canAccess(nationalId)) {
            return null;
        }

        lastAccessTimes.put(nationalId,LocalDateTime.now());
        return dataRepository.getCitizenData(nationalId);
    }

    private boolean canAccess(String nationalId) {
        return !lastAccessTimes.containsKey(nationalId) ||
                lastAccessTimes.get(nationalId).plusMinutes(3).isBefore(LocalDateTime.now());
    }
}
