public class Room
{
   private int numOfWalls;
   private double height;
   private double width;
   
   public Room(int wall,double h,double w)
   {
      numOfWalls = wall;
      height = h;
      width = w;
      
   }
   
   public Room()
   {
      numOfWalls = 0;
      height = 0;
      width = 0;
      
   }
   
   public void setNumOfWalls(int walls)
   {
      numOfWalls = walls;
   }
   
   public void setHeight(double high)
   {
      height = high;
   }
   
   public void setWidth(double wide)
   {
      width = wide;
   }
   
   public int getNumOfWalls()
   {
      return numOfWalls;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public double getWidth()
   {
      return width;
   }
   
   public double getArea()
   {
      return (numOfWalls*height*width);
   }
   
   public String toString()
   {
      return ("Walls:  "+numOfWalls+"\n"+"Height: "+height+" ft"+"\n"+"Width:  "+width+" ft");
   }                              
}    