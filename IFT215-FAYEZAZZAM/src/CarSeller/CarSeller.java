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
        int Windowsprice, ACPrice,Fuel,Diesel,Electrical,Price;
        
        switch(ProductionYear){
            case 2012:
                ACPrice=1000;
                Fuel=10000;
                Diesel=9500;
                Windowsprice=500;
            break;
            case 2013:
                Fuel= 12000;
                Diesel= 11500;
                Electrical= 13500;
                ACPrice=1000;
                Windowsprice=500;
                break;
            case 2014:
                Fuel= 14000;
                Diesel= 13500;
                Electrical= 15500;
                ACPrice=1000;
                Windowsprice=500;
                break;
            case 2015:
                Fuel= 16000;
                Diesel=15500;
                Electrical= 17500;
                ACPrice=1000;
                break;
            default: 
                ACPrice=0;
                Fuel=0;
                Diesel=0;
                Electrical=0;
                Windowsprice=500;
        }
    if(AC==false){
            ACPrice=0;
        }
    Price=ACPrice+Windows+Engine;
    
    return Price;
    }
    
    
} 