package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class MetierImpl  implements IMetier{
        /* coupalge faible */
//        @Autowired
//        @Qualifier("dao2")
        private IDao dao ;





    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
        public double calcul() {
            // TODO Auto-generated method stub
            double d=dao.getData();
            double res=d*540/Math.cos(d*Math.PI);
            return res;
        }


        //  le role de setters pour injecter dans la variable dao un objet de type dao d'une classe qui implemente l'interface IDao
        public void setDao(IDao dao) {
            this.dao = dao;
        }



}
