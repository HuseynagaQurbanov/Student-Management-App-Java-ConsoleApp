package service.inter;

public interface IProcess {
    public abstract void processLogic();
    
    public default void process(){
        processLogic();
    }
}
