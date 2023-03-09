package ext;

import dao.IDao;

public class DaoImplVWS implements IDao {

    public double getData(){
        System.out.println("Version web ");
        return 90;
    }
}
