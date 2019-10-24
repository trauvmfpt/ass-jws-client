/**
 * Place2ServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.test;

public class Place2ServiceServiceLocator extends org.apache.axis.client.Service implements t1708e.asm.diduduadi.service.test.Place2ServiceService {

    public Place2ServiceServiceLocator() {
    }


    public Place2ServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Place2ServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Place2ServicePort
    private java.lang.String Place2ServicePort_address = "http://localhost:9001/place1";

    public java.lang.String getPlace2ServicePortAddress() {
        return Place2ServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Place2ServicePortWSDDServiceName = "Place2ServicePort";

    public java.lang.String getPlace2ServicePortWSDDServiceName() {
        return Place2ServicePortWSDDServiceName;
    }

    public void setPlace2ServicePortWSDDServiceName(java.lang.String name) {
        Place2ServicePortWSDDServiceName = name;
    }

    public t1708e.asm.diduduadi.service.test.Place2Service getPlace2ServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Place2ServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPlace2ServicePort(endpoint);
    }

    public t1708e.asm.diduduadi.service.test.Place2Service getPlace2ServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            t1708e.asm.diduduadi.service.test.Place2ServicePortBindingStub _stub = new t1708e.asm.diduduadi.service.test.Place2ServicePortBindingStub(portAddress, this);
            _stub.setPortName(getPlace2ServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPlace2ServicePortEndpointAddress(java.lang.String address) {
        Place2ServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (t1708e.asm.diduduadi.service.test.Place2Service.class.isAssignableFrom(serviceEndpointInterface)) {
                t1708e.asm.diduduadi.service.test.Place2ServicePortBindingStub _stub = new t1708e.asm.diduduadi.service.test.Place2ServicePortBindingStub(new java.net.URL(Place2ServicePort_address), this);
                _stub.setPortName(getPlace2ServicePortWSDDServiceName());
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
        if ("Place2ServicePort".equals(inputPortName)) {
            return getPlace2ServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "Place2ServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "Place2ServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Place2ServicePort".equals(portName)) {
            setPlace2ServicePortEndpointAddress(address);
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
