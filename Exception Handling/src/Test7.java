public class Test7 {
      
    public static void main(String args[]) {
        try 
        {
            Class.forName("Jala Technology");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}