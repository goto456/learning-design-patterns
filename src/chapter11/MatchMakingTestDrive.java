package chapter11;

import java.lang.reflect.Proxy;

/**
 * FileName: MatchMakingTestDrive.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-11-22
 */
public class MatchMakingTestDrive {

    public PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
    }

    public PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
    }

    public MatchMakingTestDrive() {
//        initializeDatabase();
    }

    public void drive() {
//        PersonBean joe = getPersonFromDatabase("Joe");
    }

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }
}
