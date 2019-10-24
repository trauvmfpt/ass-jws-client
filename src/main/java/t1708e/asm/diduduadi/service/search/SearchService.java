/**
 * SearchService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.search;

import t1708e.asm.diduduadi.entity.Place;
import t1708e.asm.diduduadi.entity.Post;

public interface SearchService extends java.rmi.Remote {
    public Place[] searchByPlace(java.lang.String arg0) throws java.rmi.RemoteException;
    public Post[] searchByPost(java.lang.String arg0) throws java.rmi.RemoteException;
}
