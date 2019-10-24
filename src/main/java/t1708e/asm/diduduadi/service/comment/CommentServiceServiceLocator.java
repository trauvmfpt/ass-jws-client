/**
 * CommentServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.comment;

public class CommentServiceServiceLocator extends org.apache.axis.client.Service implements t1708e.asm.diduduadi.service.comment.CommentServiceService {

    public CommentServiceServiceLocator() {
    }


    public CommentServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CommentServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CommentServicePort
    private java.lang.String CommentServicePort_address = "http://23.96.248.50:9000/comment";

    public java.lang.String getCommentServicePortAddress() {
        return CommentServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CommentServicePortWSDDServiceName = "CommentServicePort";

    public java.lang.String getCommentServicePortWSDDServiceName() {
        return CommentServicePortWSDDServiceName;
    }

    public void setCommentServicePortWSDDServiceName(java.lang.String name) {
        CommentServicePortWSDDServiceName = name;
    }

    public t1708e.asm.diduduadi.service.comment.CommentService getCommentServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CommentServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCommentServicePort(endpoint);
    }

    public t1708e.asm.diduduadi.service.comment.CommentService getCommentServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            t1708e.asm.diduduadi.service.comment.CommentServicePortBindingStub _stub = new t1708e.asm.diduduadi.service.comment.CommentServicePortBindingStub(portAddress, this);
            _stub.setPortName(getCommentServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCommentServicePortEndpointAddress(java.lang.String address) {
        CommentServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (t1708e.asm.diduduadi.service.comment.CommentService.class.isAssignableFrom(serviceEndpointInterface)) {
                t1708e.asm.diduduadi.service.comment.CommentServicePortBindingStub _stub = new t1708e.asm.diduduadi.service.comment.CommentServicePortBindingStub(new java.net.URL(CommentServicePort_address), this);
                _stub.setPortName(getCommentServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CommentServicePort".equals(inputPortName)) {
            return getCommentServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "CommentServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "CommentServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CommentServicePort".equals(portName)) {
            setCommentServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
