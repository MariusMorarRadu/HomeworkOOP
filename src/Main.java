public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Marius", 22, true);
        Person person2 = new Person("David" , 32, false);
        Person person3 = new Person("Maria" , 12, false);

        System.out.println("LIST OF PEOPLE : ");
        System.out.println(person1.detailsPerson());
        System.out.println(person2.detailsPerson());
        System.out.println(person3.detailsPerson());


        System.out.println("----------------------------------------------------------------------------------");

        Product product1 = new Product("MacBook pro", 1532.23, 1, "Electronic device");
        Product product2 = new Product("Iphone", 999.99, 0, "Mobile Phone");
        Product product3 = new Product("Knife", 24.99, 1000, "Kitchen utensiles");
        System.out.println(product1.productDetails());
        System.out.println(product2.productDetails());
        System.out.println(product3.productDetails());

        System.out.println("----------------------------------------------------");


        Bottle bottle1 = new Bottle(200,150, true);
        System.out.println("Empty capacity is " + bottle1.getEmptyCapacity() );
        bottle1.drinkAmount(32);
        bottle1.getAvailableLiquid();
        bottle1.getEmptyCapacity();
        bottle1.openBottle();
        bottle1.closeBottle();
        bottle1.openBottle();
        bottle1.drinkAmount(100);
        bottle1.drinkAmount(19);
        bottle1.openBottle();



    }


}