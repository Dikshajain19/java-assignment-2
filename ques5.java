class countries{
    public String yourcountry;
    public countries(String yourcountry){
        this.yourcountry=yourcountry;

    }
    public void nameofcountry(){
        System.out.println("your country is "+ yourcountry);
    }

}
class states extends countries{
    public int noofstates;
    public states(String yourcountry, int noofstates){
        super(yourcountry);
        this.noofstates=noofstates;

    }
    public void statesincountry(){
        System.out.println("tne no of states in your country  "+yourcountry +" are  "+ noofstates);
    }

}
class ques5{
    public static void main(String a[]){
        countries c=new countries("india");
        states s=new states("india",29);
        s.statesincountry();
    }
}