/**
 * PostService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.post;


import t1708e.asm.diduduadi.entity.Post;


public interface PostService extends java.rmi.Remote {
    public Post[] getAllPost() throws java.rmi.RemoteException;
    public Post getByIdPost(int arg0) throws java.rmi.RemoteException;
    public boolean updatePost(Post arg0) throws java.rmi.RemoteException;
    public boolean deletePost(Post arg0) throws java.rmi.RemoteException;
    public boolean createPost(Post arg0) throws java.rmi.RemoteException;
}
