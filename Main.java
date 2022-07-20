public class Main extends Sample{
    void onText(String text){
      System.out.println(text);
    }
    Main(){
        TextScanner ts= new TextScanner(this);
        ts.scan();
    }

    public static void main(String[] args) {
        
      Main m = new Main();  
    }
}