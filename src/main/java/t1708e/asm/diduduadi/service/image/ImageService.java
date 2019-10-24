/**
 * ImageService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.image;

import t1708e.asm.diduduadi.entity.Image;
import t1708e.asm.diduduadi.entity.Rating;
import t1708e.asm.diduduadi.entity.User;

public interface ImageService extends java.rmi.Remote {
    public Rating[] getAll() throws java.rmi.RemoteException;
    public Image getById(int arg0) throws java.rmi.RemoteException;
    public boolean update(Rating arg0) throws java.rmi.RemoteException;
    public boolean delete(User arg0) throws java.rmi.RemoteException;
    public boolean create(Rating arg0) throws java.rmi.RemoteException;
}
