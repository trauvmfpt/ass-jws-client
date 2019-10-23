/**
 * CommentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.comment;

public interface CommentService extends java.rmi.Remote {
    public t1708e.asm.diduduadi.service.comment.User[] getList() throws java.rmi.RemoteException;
    public t1708e.asm.diduduadi.service.comment.User detail(int arg0) throws java.rmi.RemoteException;
    public boolean updateComment(t1708e.asm.diduduadi.service.comment.Comment arg0, int arg1) throws java.rmi.RemoteException;
    public boolean createComment(t1708e.asm.diduduadi.service.comment.Comment arg0) throws java.rmi.RemoteException;
}
