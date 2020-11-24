import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FoodCourt fc = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Restaurant Management");
			System.out.println("\t3. Restaurant FoodItem Management");
			System.out.println("\t4. FoodItem Quantity Add-Sell");
			System.out.println("\t5. Exit");
            System.out.println("-----------------------------------\n");
			
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
			System.out.println("-----------------------------------");
			
		switch(choice)
		
			{
				case 1:
					System.out.println("-----------------------------------------");
					System.out.println("You choose Employee Management");
					System.out.println("-----------------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Show All Employees");
					System.out.println("\t4. Search an Employee");
					System.out.println("\t5. Go Back");

					System.out.print("Enter You Option: ");
					int option1 = sc.nextInt();
					
		            switch(option1)
				    {
					    case 1:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Insert An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employe Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(fc.insertEmployee(e1)){ System.out.println("Employee Inserted with ID: "+e1.getEmpId());}
							else{System.out.println("Employee Can Not be Insertd......");}
						    break;
							
					    case 2:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Remove An Employee");
							System.out.println("---------------------------------");
							
							System.out.print("Enter an Employee ID to Remove: ");
							String empId2 = sc.next();
							
							Employee e2 = fc.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(fc.removeEmployee(e2)){ System.out.println("Employee Removed with ID: "+e2.getEmpId());}
								else{System.out.println("Employee Can Not be Removed......");}
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							break;
						
						
					    case 3:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to See All Employees");
							System.out.println("---------------------------------");
							
							fc.showAllEmployees();
							
						    break;
						
					    case 4:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search An Employee");
							System.out.println("---------------------------------");
							System.out.print("Enter an Employee ID to Search: ");
							String empId3 = sc.next(); 
							
							Employee e3 = fc.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found");
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exist");
							}
							
						    break;
						
					    case 5:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
						    break;
						
						default:
						
							System.out.println("-----------------------------------");
							System.out.println("Invalid Choice.....");
						    break;
					}
					
					break;
					
				case 2:
				
					System.out.println("-----------------------------------------");
					System.out.println("You have choosen  Restaurant Management");
					System.out.println("-----------------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New Restaurant");
					System.out.println("\t2. Remove Existing Restaurant");
					System.out.println("\t3. Show All Restaurants");
					System.out.println("\t4. Search a Restaurant");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option2 = sc.nextInt();
					
				    switch(option2)
					{
					    case 1:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Insert New Restaurant");
							System.out.println("---------------------------------");
							
							Restaurant rest1 = new Restaurant();
							
							System.out.println("Enter Restaurant ID: ");
							String rid1 = sc.next();						
							System.out.println("Enter Restaurant Name: ");
							String name1 = sc.next();
							
							Restaurant r1 = new Restaurant();
							r1.setRid(rid1);
							r1.setName(name1);
							if(fc.insertRestaurant(r1)){ System.out.println("Restaurant Inserted with ID: "+r1.getRid());}
							else{System.out.println("Restaurant Can Not be Insertd......");}
							
						    break;
							
					    case 2:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Remove a Restaurant");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Restaurant ID: ");
							String rid2 = sc.next();
							
							Restaurant r2 = fc.searchRestaurant(rid2);
							if(r2 != null)
							{
								if(fc.removeRestaurant(r2)){ System.out.println("Restaurant Removed with ID: "+r2.getRid());}
								else{System.out.println("Restaurant Can Not be Removed......");}
							}
							else
							{
								System.out.println("Restaurant Does Not Exist");
							}
						    break;
						
						
					    case 3:
						
							System.out.println("---------------------------------");
							System.out.println("You Choose to See All Restaurant");
							System.out.println("---------------------------------");
							
							fc.showAllRestaurants();
							
						    break;
							

					    case 4:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Search A Restaurant");
							System.out.println("---------------------------------");
							
							System.out.println("Enter Restaurant ID: ");
							String rid3 = sc.next();
							
							Restaurant r3 = fc.searchRestaurant(rid3);
							
							if(r3 != null)
							{
								System.out.println("Restaurant ID: "+r3.getRid());
								System.out.println("Restaurant Name: "+r3.getName());
							}
							else
							{
								System.out.println("Restaurant Does not Exists");
							}
							
						    break;
						
						
					    case 5:
							System.out.println("---------------------------------");
							System.out.println("You Choose to Go Back.......");
							System.out.println("---------------------------------");
						    break;
						
						default:
						
							System.out.println("-----------------------------------");
							System.out.println("Invalid Choice.....");
							break;
					}

					break;
					
				case 3:
				
					System.out.println("-----------------------------------------");
					System.out.println("You choose Restaurant FoodItem Management");
					System.out.println("-----------------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Insert New FoodItem ");
					System.out.println("\t2. Remove Existing FooItem");
					System.out.println("\t3. Show All FoodItems");
					System.out.println("\t4. Search a FoodItem");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter You Option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
						
							System.out.println("-----------------------------------------");
							System.out.println("Insert New FoodItem");
							System.out.println("-----------------------------------------");
							System.out.print("Enter Restaurant ID: ");
							String rid1 = sc.next();
							
							if(fc.searchRestaurant(rid1) != null)
							{
								System.out.println("Which type of Food Item do you want?");
							    System.out.println("\t1. Main Dish");
							    System.out.println("\t2. Appetiziers");
							    System.out.println("\t3. Go Back");
								
								System.out.print("Enter option: ");
								int type = sc.nextInt();
								
								if(type == 1)
							    {
								    System.out.println("Enter Food Id: ");
								    String fo1=sc.next();
								    System.out.println("Enter Food Name: ");
								    String fn1 = sc.next();
								    System.out.println("Enter Food  Quantity : ");
								    int fq1 = sc.nextInt();
								    System.out.println("Enter Food  Price : ");
								    double fp1 = sc.nextDouble();
								    System.out.println("Enter Food  category : ");
								    String fc1 = sc.next();
								
								
								
								    MainDish md = new MainDish();
								    md.setFid(fo1);
								    md.setName(fn1);
								    md.setAvailableQuantity(fq1);
								    md.setPrice(fp1);
								    md.setCategory(fc1);
								
								    if(fc.searchRestaurant(rid1).insertFoodItem(md))
									{
										System.out.println("Food Item Inserted for "+ rid1 + " with Food Id " + fo1);
									}
									else
									{
										System.out.println("Food Item Can Not Be Inserted");
									}
								
							    }
							    else if(type == 2)
							    {
								    System.out.println("Enter Food Id: ");
								    String fo1=sc.next();
								    System.out.println("Enter Food Name: ");
								    String fn1 = sc.next();
								    System.out.println("Enter Food  Quality : ");
								    int fq1 = sc.nextInt();
								    System.out.println("Enter Food  Price : ");
								    double fp1 = sc.nextDouble();
								    System.out.println("Enter Food  Size : ");
								    String  fs1 = sc.next();
								
								
								
								    Appetiziers ap = new Appetiziers();
								    ap.setFid(fo1);
								    ap.setName(fn1);
								    ap.setAvailableQuantity(fq1);
								    ap.setPrice(fp1);
								    ap.setSize(fs1);
									
									if(fc.searchRestaurant(rid1).insertFoodItem(ap))
									{
										System.out.println("Food Item Inserted for "+ rid1 + " with Food Id " + fo1);
									}
									else
									{
										System.out.println("Food Item Can Not Be Inserted");
									}
								
								    
							    } 
							    else if(type == 3)
							    {
								    System.out.println("Going Back.........");
							    }
							    else
							    {
								    System.out.println("Invalid");
							    }
							}
							
							else
							{
								System.out.println("ID MISMATCH");
							}
							
							break;
		
							
						case 2:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to Remove Food Item");
							System.out.println("---------------------------------");
							
							System.out.print("Enter Restaurant ID: ");
							String rid2 = sc.next();
							
							System.out.print("Enter an Food ID to Remove: ");
							String fid2 = sc.next();
							fc.searchRestaurant(rid2).removeFoodItem(fc.searchRestaurant(rid2).searchFoodItem(fid2));
							
							break;
						
						
						case 3:
						    System.out.println("---------------------------------");
							System.out.println("You Choose to Show All Food Item");
							System.out.println("---------------------------------");
							
						    System.out.print("Enter Restaurant ID: ");
							String rid3 = sc.next();
							
							fc.searchRestaurant(rid3).showAllFoodItems();
						
							break;
						
  
						case 4:
						    
							
					        break;
						
						 
						
						case 5:
							System.out.println("-----------------------------------------");
							System.out.println("Going Back");
							System.out.println("-----------------------------------------");
							break;
						
						default:
						
							System.out.println("-----------------------------------------");
							System.out.println("Invalid");
							System.out.println("-----------------------------------------");
							break;
					}
				    break;  
				 
				case 4:
				 
				    System.out.println("-----------------------------------------");
					System.out.println("You Choose FoodItem Quantity Add-Sell: ");
					System.out.println("-----------------------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1.Add Food Item ");
					System.out.println("\t2.Sell Food Item");
					System.out.println("\t3.What has been sold."); 
					System.out.println("\t4.Go Back");
					
					System.out.println("Your Option: ");
					int option4 = sc.nextInt();
					  
					switch(option4)	
					{
						case 1:
						
							System.out.println("-----------------------------------------");
							System.out.println("You Choose to Add FoodItem ");
							
							System.out.print("Enter Restaurant Rid: ");
							String rid1 = sc.next();
				
							if(fc.searchRestaurant(rid1) != null)
							{
								System.out.print("Enter Food Number: ");
							    String fn1 = sc.next();
								
								if(fc.searchRestaurant(rid1).searchFoodItem(fn1) != null)
								{
									System.out.print("Enter Amount: ");
							        int am = sc.nextInt();
									
									if(fc.searchRestaurant(rid1).searchFoodItem(fn1).addQuantity(am))
									{
										System.out.println("Add Successfull");
										frwd.writeInFile("Add Quantity: "+ am +" in Food Item " + fn1 + " by " + rid1);
									}
									else
									{
										System.out.println("Can Not");
									}
								}
								else
								{
									System.out.println("Invalid Account Number");
								} 
							}	
							else
							{
								System.out.println("ID MISMATCH");
							}
							
							break;
							
							
							
						case 2:
						    System.out.println("-----------------------------------------");
							System.out.println("You Choose to Sell FoodItem ");
							
							System.out.print("Enter Restaurant Rid: ");
							String rid2 = sc.next();
				
							if(fc.searchRestaurant(rid2) != null)
							{
								System.out.print("Enter Food Number: ");
							    String fn2 = sc.next();
								
								if(fc.searchRestaurant(rid2).searchFoodItem(fn2) != null)
								{
									System.out.print("Enter Amount: ");
							        int am1 = sc.nextInt();
									
									if(fc.searchRestaurant(rid2).searchFoodItem(fn2).sellQuantity(am1))
									{
										System.out.println("Sell Successfull");
										frwd.writeInFile("Sell Quantity: "+ am1 +" in Food Item " + fn2 + " by " + rid2);
									}
									else
									{
										System.out.println("Can Not");
									}
								}
								else
								{
									System.out.println("Invalid Account Number");
								} 
							}	
							else
							{
								System.out.println("ID MISMATCH");
							}
						
							break;

                        case 3:
						
							System.out.println("-----------------------------------------");
							System.out.println("You choose to Show Add Sell History");
							System.out.println("-----------------------------------------");
							frwd.readFromFile();
							
							break;
							
						case 4:
						
							System.out.println("-----------------------------------------");
							System.out.println("Going back");
							System.out.println("-----------------------------------------");
							break;
							
						default:
						
							System.out.println("-----------------------------------------");
							System.out.println("Invalid");
							System.out.println("-----------------------------------------");
							break;							
							
						
					}
                    break; 
				 
				case 5:
					
					System.out.println("---------------------------------");
					System.out.println("You Choose Exit");
					System.out.println("---------------------------------");
					repeat = false;
					break;
					
				default:
				
					System.out.println("-----------------------------------");
					System.out.println("Invalid Choice.....");
					break;

				 
			}
			System.out.println("-----------------------------------\n");
		}
	}
}