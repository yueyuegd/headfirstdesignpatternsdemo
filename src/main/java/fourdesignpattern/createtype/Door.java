package fourdesignpattern.createtype;

/**
 * Created by zhangyue-k on 2018/2/13.
 */
public abstract class Door extends MapSite{

    private Room room1;
    private Room room2;
    private boolean isOpen;

    @Override
    public abstract void Enter();
    abstract Room otherSideFrom(Room room);
}
