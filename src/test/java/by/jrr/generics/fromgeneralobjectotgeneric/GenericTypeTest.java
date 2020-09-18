package by.jrr.generics.fromgeneralobjectotgeneric;

import org.junit.Test;

public class GenericTypeTest {

    @Test
    public void demo() {
        String newBornWeightS = "3500";
        Long newBornWeightL = 3500L;
        Double newBornWeightD = 3.5;

        GenericType<String> genericsTypeS = new GenericType<>();
        GenericType<Long> genericsTypeL = new GenericType<>();
        GenericType<Double> genericsTypeD = new GenericType<>();

        genericsTypeS.setValue(newBornWeightS);
        genericsTypeL.setValue(newBornWeightL);
        genericsTypeD.setValue(newBornWeightD);

        Double getNewBornWeightD =  genericsTypeD.getValue();
        String getNewBornWeightS = genericsTypeS.getValue();
        Long getNewBornWeightL =  genericsTypeL.getValue();
    }
}
