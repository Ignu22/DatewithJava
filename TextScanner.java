public class TextScanner{
    Sample obj;
    public TextScanner(Sample obj){
      this.obj=obj;
    }

    void scan(){
        obj.onText("Scanned Text");
    }
}