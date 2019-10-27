/**
 * UserService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.user;

public interface UserService extends java.rmi.Remote {
    public boolean delete(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String detail(int arg0) throws java.rmi.RemoteException;
    public java.lang.String getList() throws java.rmi.RemoteException;
    public java.lang.String getByUserName(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String login(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean updateUser(java.lang.String arg0, java.lang.Integer[] arg1) throws java.rmi.RemoteException;
    public boolean createUser(java.lang.String arg0, java.lang.Integer[] arg1) throws java.rmi.RemoteException, t1708e.asm.diduduadi.service.user.InvalidKeySpecException, t1708e.asm.diduduadi.service.user.NoSuchAlgorithmException;
}
