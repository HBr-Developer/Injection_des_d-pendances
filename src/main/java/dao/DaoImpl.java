package dao;


import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        // TODO Auto-generated method stub
        System.out.println("version base de donnee");
        double data = Math.random()*40;
        return data;
    }
}
