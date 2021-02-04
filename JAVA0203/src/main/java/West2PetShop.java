import java.time.LocalDate;
import java.util.LinkedList;

public class West2PetShop implements PetShop{
    public static final int BULLFINCHES = 10;//一次进货饮料的数量
    public static final int FOSTERPRICE= 10;//一次进货饮料的数量
    double balance;
    LinkedList<Animal> animalList=new LinkedList<>();
    static LinkedList<SetMeal> setMealList=new LinkedList<>();
    static{
        setMealList.add(new SetMeal("套餐一",new  Bird("杜鹃","♀", LocalDate.of(2021,1,1),40),new Vaccine("狂犬疫苗",40),70));
        setMealList.add(new SetMeal("套餐二",new  Bird("布谷鸟","♂", LocalDate.of(2021,1,10),50),new Vaccine("天花疫苗",50),85));
        setMealList.add(new SetMeal("套餐三",new  Cat("加菲猫","♂", LocalDate.of(2021,2,1),100),new Vaccine("新冠疫苗",100),160));
    }

    public West2PetShop(double balance) {
        this.balance = balance;
    }

    private void printInf(Animal animal, String op)
    {
        System.out.println("宠物信息："+animal.toString());
        System.out.println("操作："+op);
        System.out.println("时间："+LocalDate.now());
    }

    @Override
    public void bulkPurchase(Animal animal) throws OverdraftBalanceException{
        for (int i=1;i<BULLFINCHES;i++)
        {
            if (balance<animal.cost)
                throw new OverdraftBalanceException("余额不足");
            animalList.add(animal);
            balance-=animal.cost;
        }
        printInf(animal,"批量进货");
    }

    @Override
    public void sellSetMeal(String name) {
        SetMeal setMeal;
        for (SetMeal t : setMealList)
            if (t.name==name)
            {
                setMeal=t;
                if (animalList.contains(setMeal.animal))
                    animalList.remove(setMeal.animal);
                else throw new IngredientSortOutException("商店已经售完该宠物");
                balance+=setMeal.price;
                printInf(setMeal.animal,"售卖");
                return;
            }
    }

    public void fosterAnimal(Animal animal, int day)
    {
        balance+=day*FOSTERPRICE;
     //   System.out.println("寄养成功，寄养"+day+"天，共花费"+day*FOSTERPRICE+"元");
        printInf(animal,"寄养");
    }
}
