public class Guitar {
    private String color;
    private int stringCount;
    private int [] tensions = new int[6];


    public Guitar() {

    }
    public String getColor(){
        return color;
    }
    public int getStringCount(){
        return stringCount;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setStringCount(int stringCount){
        this.stringCount = stringCount;
    }
     public Guitar(String color){
        this.color = color;
        this.stringCount = 6;
        this.tensions = new int[stringCount];

     }
     public void tune(){
        for(int i = 0; i<tensions.length; i++) {
            tensions[i] = 5;
        }
     }
    public void play(){
        if(!isTuned()){
            System.out.println("Настройте гитару! ");
            return;
        }
        System.out.println("On this empty stage8\n" +
                "The loneliness visits me\n" +
                "I get mixed feelings\n" +
                "I repress it all and pray\n" +
                "And I simply get over it\n" +
                "I thought I was used to that\n" +
                "But I can’t hide this feeling\n" +
                "By the time things have cooled down\n" +
                "I leave this stage again…\n");

    }
    private boolean isTuned() {
        for(int i:tensions) {
            if (i != 5)
                return false;
        }
        return true;
    }
    private void unsettle(){
        for(int i = 0; i < tensions.length; i++){
            tensions[i] = (int) (Math.random()*3);

        }
        System.out.println("Гитара расстроена! ");
    }

}
