// Generated by PyNSource http://www.andypatterns.com/index.php/products/pynsource/ 

public class PlayheadMediator {
    public  variant turnMgr;
    public  variant story;
    public  Playhead eventPlayhead = new Playhead();
    public  Playhead timePlayhead = new Playhead();
    public  Playhead turnPlayhead = new Playhead();
    public  EventPlayAPI byEvent = new EventPlayAPI();
    public  TimePlayAPI byTime = new TimePlayAPI();
    public  TurnPlayAPI byTurn = new TurnPlayAPI();
    public void __init__() {
    }
    public void Clear() {
    }
    public void IsEmpty() {
    }
}
