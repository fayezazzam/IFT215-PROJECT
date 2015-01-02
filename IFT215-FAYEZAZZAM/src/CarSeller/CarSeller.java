package CarSeller;

public class CarSeller {
    private int  ProductionYear;
    private int Windows;
    private boolean AC;
    private int Engine;
    
      public CarSeller(int ProductionYear, int Windows, 
            boolean AC, int Engine){
        this.ProductionYear=ProductionYear;
        this.Windows=Windows;
        this.AC=AC;
        this.Engine=Engine;
    }
      
    public int getProductionYear(){
        return ProductionYear;
    }
    
    public void setProductionYear(int ProductionYear){
        this.ProductionYear=ProductionYear;
    }
    
    public int getWindows(){
        return Windows;
    }
    
    public void setWindows(int Windows){
        this.Windows=Windows;
    }
    
    public boolean hasAC(){
        return AC;
    }
    
    public void setAC(boolean AC){
        this.AC=AC;
    }
    
    public int getEngine(){
        return Engine;
    }
    
    public void setEngine(int Engine){
        this.Engine=Engine;
    }
    public int getPrice(){
        int Price,ACPrice;
    if(AC==true){
            ACPrice=1000;
        }else{ 
        ACPrice=0;
    }
    Price=ACPrice+Windows+Engine;
    return Price;
    }
   
} 