class Distance{
    protected double  distanceinmiles;
    public Distance(double distanceinmiles){
        this.distanceinmiles=distanceinmiles;
    }
    void traveltime(){
        System.out.println("Time taken to travel the distance of 60 miles = "+distanceinmiles/60+" hours");
    }
}
class DistanceMKS extends Distance{
    public DistanceMKS(double distanceInKilometers) {
        super(distanceInKilometers * 0.621371); 
    }
    void traveltime(){
        System.out.println("The time taken to cover distance of 100 km is  "+distanceinmiles/100+" seconds ");
    }
    
}
class ques12{
    public static void main(String a[]){
        Distance dist=new Distance(300);
        dist.traveltime();;
        DistanceMKS d=new DistanceMKS(500);
        d.traveltime();;
    }
}