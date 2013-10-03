/**
 * 
 */

/**
 * @author huntleja
 *
 */
public class purchaseDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
	double grandTotal = 0;
	Purchase sale = new Purchase();
	sale.setName("oranges");
	sale.setPrice(10, 2.99);
	sale.setNumberBought(24);
	sale.writeOutput();
	System.out.println("Cost each $" + sale.getUnitCost());
	System.out.println("Total cost of oranges $" + sale.getTotalCost());
	grandTotal =(grandTotal + sale.getTotalCost());

	System.out.println("");
	sale.setName("eggs");
	sale.setPrice(12, 1.69);
	sale.setNumberBought(36);
	sale.writeOutput();
	System.out.println("Cost each $" + sale.getUnitCost());
	System.out.println("Total cost of eggs $" + sale.getTotalCost());
	grandTotal =(grandTotal + sale.getTotalCost());

	System.out.println("");
	sale.setName("apples");
	sale.setPrice(3, 1.00);
	sale.setNumberBought(20);
	sale.writeOutput();
	System.out.println("Cost each $" + sale.getUnitCost());
	System.out.println("Total cost of apples $" + sale.getTotalCost());
	grandTotal =(grandTotal + sale.getTotalCost());

	System.out.println("");
	sale.setName("watermelons");
	sale.setPrice(1, 4.39);
	sale.setNumberBought(2);
	sale.writeOutput();
	System.out.println("Cost each $" + sale.getUnitCost());
	System.out.println("Total cost of watermelons $" + sale.getTotalCost());
	grandTotal =(grandTotal + sale.getTotalCost());

	System.out.println("");
	sale.setName("bagels");
	sale.setPrice(6, 3.50);
	sale.setNumberBought(12);
	sale.writeOutput();
	System.out.println("Cost each $" + sale.getUnitCost());
	System.out.println("Total cost of bagels $" + sale.getTotalCost());
	grandTotal =(grandTotal + sale.getTotalCost());
	
	System.out.println("");
	System.out.println("The grandtotal for 2 dozen oranges, 3 dozen eggs, 20 apples, 2 watermelons and a dozen of bagles" +
	        " is $"+grandTotal);
        
    }

}