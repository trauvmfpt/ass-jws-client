/**
 * UserService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.user;

import t1708e.asm.diduduadi.entity.User;

public interface UserService extends java.rmi.Remote {
    public User detail(int arg0) throws java.rmi.RemoteException;
    public User[] getList() throws java.rmi.RemoteException;
    public boolean updateUser(User arg0, java.lang.Integer[] arg1) throws java.rmi.RemoteException;
    public User login(User arg0) throws java.rmi.RemoteException;
    public boolean createUser(User arg0, java.lang.Integer[] arg1) throws java.rmi.RemoteException, InvalidKeySpecException, NoSuchAlgorithmException;
    public boolean delete(User arg0) throws java.rmi.RemoteException;
}
