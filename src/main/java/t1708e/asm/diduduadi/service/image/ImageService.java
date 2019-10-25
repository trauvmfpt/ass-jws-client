/**
 * ImageService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.image;
import t1708e.asm.diduduadi.entity.*;
public interface ImageService extends java.rmi.Remote {
    public Image getByIdImage(int arg0) throws java.rmi.RemoteException;
    public boolean updateImage(Image arg0) throws java.rmi.RemoteException;
    public boolean createImage(Image arg0) throws java.rmi.RemoteException;
    public boolean deleteImage(Image arg0) throws java.rmi.RemoteException;
    public Image[] getAllImage() throws java.rmi.RemoteException;

}
