/**
 * RatingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.rate;

public interface RatingService extends java.rmi.Remote {
    public boolean update(t1708e.asm.diduduadi.service.rate.Rating arg0) throws java.rmi.RemoteException;
    public boolean delete(t1708e.asm.diduduadi.service.rate.User arg0) throws java.rmi.RemoteException;
    public boolean create(t1708e.asm.diduduadi.service.rate.Rating arg0) throws java.rmi.RemoteException;
    public t1708e.asm.diduduadi.service.rate.Rating[] getAll() throws java.rmi.RemoteException;
    public t1708e.asm.diduduadi.service.rate.Rating getByUserIdAndPostId(int arg0, int arg1) throws java.rmi.RemoteException;
}
