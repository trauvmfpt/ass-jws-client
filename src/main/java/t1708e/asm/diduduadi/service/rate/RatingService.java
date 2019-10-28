/**
 * RatingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.rate;

public interface RatingService extends java.rmi.Remote {
    public java.lang.String getByUserIdAndPostId(int arg0, int arg1) throws java.rmi.RemoteException;
    public java.lang.String getAllRate() throws java.rmi.RemoteException;
    public boolean updateRate(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean createRate(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean deleteRate(java.lang.String arg0) throws java.rmi.RemoteException;
}
