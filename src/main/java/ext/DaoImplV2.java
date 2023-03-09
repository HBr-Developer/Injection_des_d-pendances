package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        // TODO Auto-generated method stub
        System.out.println("version Capteurs");
        double data=12;
        return data;
    }
}
