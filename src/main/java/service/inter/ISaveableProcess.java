package service.inter;

import bean.Config;

public interface ISaveableProcess extends IProcess {
    public default void process(){
        processLogic();
        Config.save();
    }
}
