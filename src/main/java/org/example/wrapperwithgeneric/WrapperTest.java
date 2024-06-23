package org.example.wrapperwithgeneric;

@SuppressWarnings("unckecked")
public class WrapperTest {

    public static void main(String[] args) {

        Wrapper<String,Integer, org.example.wrapperwithoutgeneric.Wrapper> stringWrapper = new Wrapper<>("java dev");
  //      Wrapper<Integer> integerWrapper = new Wrapper<>(458965);

        // with  Generic in java ,this is resolve
        String string = stringWrapper.getValue();
       // Integer integer = integerWrapper.getValue();
        System.out.println(string);
      //  System.out.println(integer);

        stringWrapper.getValueMethod("milad","milad");

        Wrapper wrapper = new Wrapper("milad");
        wrapper.getValue();
        System.out.println(wrapper.getValue());


    }
}
