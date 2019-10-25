/**
 * CommentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.comment;

import t1708e.asm.diduduadi.entity.Comment;

public interface CommentService extends java.rmi.Remote {
    public boolean createComment(Comment arg0) throws java.rmi.RemoteException;
    public Comment[] getListComment() throws java.rmi.RemoteException;
    public boolean updateComment(Comment arg0, int arg1) throws java.rmi.RemoteException;
    public Comment detailComment(int arg0) throws java.rmi.RemoteException;
}
