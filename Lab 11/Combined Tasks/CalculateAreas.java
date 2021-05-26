
package l11asi1;


public class CalculateAreas {
    
    private Shape[] shapes;
    private double[] area;
    

    public CalculateAreas(Shape[] obj) {
        shapes = new Shape[obj.length];
        for(int i = 0; i<obj.length; i++){
            shapes[i] = obj[i];
            
        }
        area = new double[100];
    }
    
    
    public void calArea(){
        double areaOfShape;
        for(int i = 0 ; i<shapes.length ; i++){
            if(shapes[i] != null){
                areaOfShape = shapes[i].area();
                area[i] = areaOfShape;
            }
            
            
            
        }
    }

    @Override
    public String toString() {
        String allShapeArea = "";
        for (int i = 0; i<shapes.length;i++){
            if(area[i] != 0){
                allShapeArea = allShapeArea+ "Shape no. 1 area: " + area[i] + "\n";
            }
            
        }
        return "All Shapes Area:\n" + allShapeArea;
    }
    
    
    
    
    
}
