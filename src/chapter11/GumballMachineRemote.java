package chapter11;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * FileName: GumballMachineRemote.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-21
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
