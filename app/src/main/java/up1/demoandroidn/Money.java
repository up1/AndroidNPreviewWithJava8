package up1.demoandroidn;


import java.math.BigDecimal;
import java.util.Locale;

public interface Money {
    void setMoney(BigDecimal money);
    BigDecimal getMoney();
    String getCurentcy();

    default String getFormattedMoney() {
        return String.format(Locale.getDefault(),
                "Money is %.3f %s", getMoney().floatValue(), getCurentcy());
    }
}

class ThaiMoney implements  Money {

    @Override
    public void setMoney(BigDecimal money) {

    }

    @Override
    public BigDecimal getMoney() {
        return null;
    }

    @Override
    public String getCurentcy() {
        return null;
    }
}
