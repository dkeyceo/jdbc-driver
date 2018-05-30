import com.dkey.jdbc.service.ModelService;
import com.dkey.jdbc.util.ConnectionManager;

public class Main {
    public static void main(String[] args) {
//        ConnectionManager connectionManager = new ConnectionManager();
//        connectionManager.getConnection();
//
        ModelService modelService = new ModelService();
        System.out.println(modelService.getByBrand("cadillac"));
    }
}
