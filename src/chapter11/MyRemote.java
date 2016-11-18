package chapter11;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * FileName: MyRemote.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-18
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
