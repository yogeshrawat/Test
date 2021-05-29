package ProducerConsumer;

import java.math.BigDecimal;

public interface Account {
    BigDecimal g = new BigDecimal(0.00);
}

class Saving implements Account{
    public Saving(BigDecimal d){
      //  g = d;
    }
}
