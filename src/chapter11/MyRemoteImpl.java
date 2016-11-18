package chapter11;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * FileName: MyRemoteImpl.java
 * Description:
 * Authors: wangbiwen<wangbiwen@xiaomi.com>
 * Date: 16-11-18
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() {
        return "Server says, 'Hello'";
    }

    public static void main(String[] args) {
        try {
            MyRemote myRemote = new MyRemoteImpl();
            Naming.rebind("RemoteHello", myRemote);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
