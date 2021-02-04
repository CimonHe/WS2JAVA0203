import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        West2PetShop west2PetShop=new West2PetShop(2000);
        System.out.println("***************************************************************");
        try{
            west2PetShop.sellSetMeal("套餐一");
        }
        catch (IngredientSortOutException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("***************************************************************");
        try
        {
            west2PetShop.bulkPurchase(new Bird("杜鹃","♀", LocalDate.of(2021,1,1),40));
            west2PetShop.bulkPurchase(new Bird("布谷鸟","♂", LocalDate.of(2021,1,10),50));
            west2PetShop.bulkPurchase(new  Cat("加菲猫","♂", LocalDate.of(2021,2,1),100));
        }
        catch (IngredientSortOutException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("***************************************************************");
        try
        {
            west2PetShop.bulkPurchase(new Bird("杜鹃","♀", LocalDate.of(2021,1,1),40));
            west2PetShop.bulkPurchase(new Bird("布谷鸟","♂", LocalDate.of(2021,1,10),50));
            west2PetShop.bulkPurchase(new  Cat("加菲猫","♂", LocalDate.of(2021,2,1),100));
        }
        catch (OverdraftBalanceException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("***************************************************************");
        try
        {
            west2PetShop.sellSetMeal("套餐三");
        }
        catch (IngredientSortOutException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("***************************************************************");
        west2PetShop.fosterAnimal(new  Cat("加菲猫","♂", LocalDate.of(2021,2,1),100),15);
    }
}
