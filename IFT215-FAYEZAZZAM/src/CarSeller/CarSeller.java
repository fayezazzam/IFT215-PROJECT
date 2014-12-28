package CarSeller;

public class CarSeller {
    private int  ProductionYear;
    private String Windows;
    private boolean AC;
    private String Engine;
    
      public CarSeller(int ProductionYear, String Windows, 
            boolean AC, String Engine){
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
    
    public String getWindows(){
        return Windows;
    }
    
    public void setWindows(String Windows){
        this.Windows=Windows;
    }
    
    public boolean hasAC(){
        return AC;
    }
    
    public void setAC(boolean AC){
        this.AC=AC;
    }
    
    public String getEngine(){
        return Engine;
    }
    
    public void setEngine(String Engine){
        this.Engine=Engine;
    }
    
}
