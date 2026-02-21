package dao;

import org.springframework.stereotype.Component;

@Component("dv2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteurs...");
        double t = 47;
        return t;
    }
}
