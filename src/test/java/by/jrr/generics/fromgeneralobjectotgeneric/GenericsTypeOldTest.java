package by.jrr.generics.fromgeneralobjectotgeneric;

import by.jrr.generics.App;
import org.junit.Test;

import static by.jrr.generics.App.log;
import static org.junit.Assert.*;

public class GenericsTypeOldTest {

    @Test
    public void demo() {
        String newBornWeightS = "3500";
        Long newBornWeightL = 3500L;
        Double newBornWeightD = 3.5;

        GenericsTypeOld genericsTypeOldS = new GenericsTypeOld();
        GenericsTypeOld genericsTypeOldL = new GenericsTypeOld();
        GenericsTypeOld genericsTypeOldD = new GenericsTypeOld();

        genericsTypeOldS.setValue(newBornWeightS);
        genericsTypeOldL.setValue(newBornWeightL);
        genericsTypeOldD.setValue(newBornWeightD);


        try {
            Double getNewBornWeightD = (Double) genericsTypeOldD.getValue();
        } catch (Exception ex) {
            log.info("Type mismatch: make sure weight has been set in floating values");
        }
        String getNewBornWeightS = (String) genericsTypeOldS.getValue();
        Long getNewBornWeightL = (Long) genericsTypeOldL.getValue();
    }
}
