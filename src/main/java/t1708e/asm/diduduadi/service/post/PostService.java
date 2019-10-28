/**
 * PostService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.post;

public interface PostService extends java.rmi.Remote {
    public boolean createPost(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String getAllPost() throws java.rmi.RemoteException;
    public java.lang.String getByIdPost(int arg0) throws java.rmi.RemoteException;
    public boolean updatePost(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean deletePost(java.lang.String arg0) throws java.rmi.RemoteException;
}
