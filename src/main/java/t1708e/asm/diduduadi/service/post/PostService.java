/**
 * PostService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.post;

public interface PostService extends java.rmi.Remote {
    public t1708e.asm.diduduadi.service.post.Rating[] getAll() throws java.rmi.RemoteException;
    public t1708e.asm.diduduadi.service.post.Image getById(int arg0) throws java.rmi.RemoteException;
    public boolean update(t1708e.asm.diduduadi.service.post.Rating arg0) throws java.rmi.RemoteException;
    public boolean delete(t1708e.asm.diduduadi.service.post.User arg0) throws java.rmi.RemoteException;
    public boolean create(t1708e.asm.diduduadi.service.post.Rating arg0) throws java.rmi.RemoteException;
}
