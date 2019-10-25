/**
 * PlaceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.place;


import t1708e.asm.diduduadi.entity.Place;

public interface PlaceService extends java.rmi.Remote {
    public boolean createPlace(Place arg0) throws java.rmi.RemoteException;
    public Place detailPlace(int arg0) throws java.rmi.RemoteException;
    public boolean updatePlace(Place arg0, int arg1) throws java.rmi.RemoteException;
    public Place[] getListPlace() throws java.rmi.RemoteException;

}
