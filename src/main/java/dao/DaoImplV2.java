package dao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteurs...");
        double t = 47;
        return t;
    }
}
