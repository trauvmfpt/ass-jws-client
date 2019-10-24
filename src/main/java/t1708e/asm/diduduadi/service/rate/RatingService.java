/**
 * RatingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.rate;

import t1708e.asm.diduduadi.entity.*;

public interface RatingService extends java.rmi.Remote {
    public Rating[] getAllRate() throws java.rmi.RemoteException;
    public Rating getByUserIdAndPostId(int arg0, int arg1) throws java.rmi.RemoteException;
    public boolean deleteRate(Rating arg0) throws java.rmi.RemoteException;
    public boolean updateRate(Rating arg0) throws java.rmi.RemoteException;
    public boolean createRate(Rating arg0) throws java.rmi.RemoteException;
}
