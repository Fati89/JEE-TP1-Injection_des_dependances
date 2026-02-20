package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("version BDD");
        double t = 34;
        return t;
    }
}
