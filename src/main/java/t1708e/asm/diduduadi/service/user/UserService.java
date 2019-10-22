/**
 * UserService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.user;

public interface UserService extends java.rmi.Remote {
    public boolean delete(User arg0) throws java.rmi.RemoteException;
    public boolean createUser(User arg0) throws java.rmi.RemoteException, t1708e.asm.diduduadi.service.user.InvalidKeySpecException, t1708e.asm.diduduadi.service.user.NoSuchAlgorithmException;
    public boolean updateUser(User arg0, int arg1) throws java.rmi.RemoteException;
    public User[] getList() throws java.rmi.RemoteException;
    public User detail(int arg0) throws java.rmi.RemoteException;
}
