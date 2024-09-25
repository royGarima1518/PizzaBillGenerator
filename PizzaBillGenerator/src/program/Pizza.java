package program;

public class Pizza{
	private int price;
	private Boolean veg;
	private int extraCheesePrice = 100;
	private int extraToppingsPrice = 150;
	private int backPackPrice = 20;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean isOptedForTakeAway = false;
	
	public Pizza(Boolean veg)
	{
		this.veg = veg;
		this.price = veg ? 300 : 400;
		basePizzaPrice = this.price;
	}
	
	public void addExtraCheese()
	{
		if (!isExtraCheeseAdded) {
            isExtraCheeseAdded = true;
            System.out.println("Extra Cheese added");
            this.price += extraCheesePrice;
        }
	}
	
	public void addExtraTopping()
	{
		if (!isExtraToppingsAdded) {
            isExtraToppingsAdded = true;
            System.out.println("Extra toppings added");
            this.price += extraToppingsPrice;
        }		
	}
	
	public void takeAway()
	{
		 if (!isOptedForTakeAway) {
	            isOptedForTakeAway = true;
	            System.out.println("Take away opted");
	            this.price += backPackPrice;
	        }		
	}
	
	public String getBill() {
	    StringBuilder bill = new StringBuilder();
	    bill.append("\n=================== BILL ===================\n");
	    bill.append("Pizza Type: ").append(veg ? "Veg" : "Non-Veg").append("\n");
	    bill.append("============================================\n");
	    bill.append("Base Price: \t\t\t").append(basePizzaPrice).append("\n");
	    if (isExtraCheeseAdded) {
	        bill.append("Extra Cheese: \t\t\t").append(extraCheesePrice).append("\n");
	    }
	    if (isExtraToppingsAdded) {
	        bill.append("Extra Toppings: \t\t").append(extraToppingsPrice).append("\n");
	    }
	    if (isOptedForTakeAway) {
	        bill.append("Take Away: \t\t\t").append(backPackPrice).append("\n");
	    }
	    bill.append("============================================\n");
	    bill.append("Total Bill: \t\t\t").append(this.price).append("\n");
	    bill.append("============================================\n");
	    return bill.toString();
	}

}


/**
 * Base pizza: 300
 * Toppings: 150
 * Cheese: 100
 * Take away: 20
*/
