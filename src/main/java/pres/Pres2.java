package pres;

import dao.IDao;
import metier.IMetier;
import dao.DaoImpl;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;



public class Pres2 {
    public static void main(String[] args) throws Exception{

        Scanner scanner =new Scanner(new File("config.txt"));

        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName); //en charge les classes en memoir avec
        IDao dao =(IDao) cDao.getConstructor().newInstance();//creer une instance d'une classe

        System.out.println(dao.getData());


        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier)cMetier.getConstructor().newInstance();
        Method m=cMetier.getMethod("setDao", IDao.class);
        m.invoke(metier, dao);

        System.out.println(metier.calcul());
    }
}
