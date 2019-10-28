/**
 * CommentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.comment;

public interface CommentService extends java.rmi.Remote {
    public boolean updateComment(java.lang.String arg0, int arg1) throws java.rmi.RemoteException;
    public java.lang.String detailComment(int arg0) throws java.rmi.RemoteException;
    public boolean createComment(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String getListComment() throws java.rmi.RemoteException;
}
