public class Fish {
    String fishName;
    int wholeFish;
    String whatSeaDoesItLiveIn;
    int howMuchIsThisFish;

    public Fish (String fishName, int wholeFish,String whatSeaDoesItLiveIn,int howMuchIsThisFish){
        this.fishName = fishName;
        this.wholeFish = wholeFish;
        this.whatSeaDoesItLiveIn = whatSeaDoesItLiveIn;
        this.howMuchIsThisFish = howMuchIsThisFish;
    }

    public Fish (){

    }

    @Override
    public String toString() {
        return "Fish\n" +
                "fishName: " + fishName + "\n" +
                " wholeFish: " + wholeFish +"\n"+
                " whatSeaDoesItLiveIn: " + whatSeaDoesItLiveIn + "\n" +
                " howMuchIsThisFish: " + howMuchIsThisFish;
    }
}
