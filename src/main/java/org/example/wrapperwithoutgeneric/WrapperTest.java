package org.example.wrapperwithoutgeneric;

public class WrapperTest {

    public static void main(String[] args) {
        Wrapper wrapper = new Wrapper("java developer");
        // with out Generic in java ,this is problem
        String getWrapper = (String) wrapper.getValue();
        Integer getIntegerFromWrapper = (Integer) wrapper.getValue();
        System.out.println(getWrapper);

    }
}
