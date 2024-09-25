package program;

public class main 
	{
	public static void main(String[] args) {
		
		// Using the base pizza
		//
        Pizza basePizza = new Pizza(true);
        basePizza.addExtraCheese();
        basePizza.addExtraTopping();
        basePizza.takeAway();
        System.out.println(basePizza.getBill());
        

        // Using the deluxe pizza
        DeluxPizza dp = new DeluxPizza(false);
        dp.takeAway();
        System.out.println(dp.getBill());
	}
}
