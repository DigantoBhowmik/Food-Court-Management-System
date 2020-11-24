package interfaces;
import java.lang.*;
import classes.FoodItem;

public interface IQuantity 
{
	boolean addQuantity(int amount);
	
	boolean sellQuantity(int amount);
}