public class Corn {
    int cornCount;
    public Corn(int a){
        cornCount=a;
    }
    public Popcorn[] makePopcorn(){
        Popcorn[] pop = new Popcorn[cornCount];
        for (int i=0;i<cornCount;i++){
            pop[i]=new Popcorn();
        }
        return pop;
    }
}
class Popcorn{

}
