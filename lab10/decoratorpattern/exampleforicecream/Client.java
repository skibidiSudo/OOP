package hus.oop.lab10.decoratorpattern.exampleforicecream;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream1 = new ChocolateIceCream();
        IceCream iceCream2 = new StrawberryIceCream();
        IceCream iceCream3 = new HoneyToppingDecorator(new StrawberryIceCream());
        IceCream iceCream4 = new HoneyToppingDecorator(new VanillaIceCream());
        IceCream iceCream5 = new HoneyToppingDecorator(new NutsToppingDecorator(new VanillaIceCream()));
        IceCream iceCream6 = new NutsToppingDecorator(new HoneyToppingDecorator(new StrawberryIceCream()));

        List<IceCream> iceCreams = new LinkedList<>();
        iceCreams.add(iceCream1);
        iceCreams.add(iceCream2);
        iceCreams.add(iceCream3);
        iceCreams.add(iceCream4);
        iceCreams.add(iceCream5);
        iceCreams.add(iceCream6);

        for (IceCream iceCream : iceCreams){
            System.out.println(iceCream.getDescription());
        }
    }
}
