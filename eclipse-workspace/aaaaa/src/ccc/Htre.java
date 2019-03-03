package ccc;


class Htre {
    private int x = 0;
    private String y = "Y";
    public Htre(int k){
        this.x = k; 
    }
    public Htre(String k){
        this.y = k; 
    }    
    public void showMe(){
        System.out.println(x+y);
    }
}
 class Asd {
    public static void main(String[] args) throws Exception {
        new Htre(10).showMe();
        new Htre("Z").showMe();
    }
}
