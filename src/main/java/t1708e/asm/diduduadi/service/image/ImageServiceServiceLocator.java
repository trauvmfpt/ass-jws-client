/**
 * ImageServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.image;

public class ImageServiceServiceLocator extends org.apache.axis.client.Service implements t1708e.asm.diduduadi.service.image.ImageServiceService {

    public ImageServiceServiceLocator() {
    }


    public ImageServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ImageServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ImageServicePort
    private java.lang.String ImageServicePort_address = "http://23.96.248.50:9000/image";

    public java.lang.String getImageServicePortAddress() {
        return ImageServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ImageServicePortWSDDServiceName = "ImageServicePort";

    public java.lang.String getImageServicePortWSDDServiceName() {
        return ImageServicePortWSDDServiceName;
    }

    public void setImageServicePortWSDDServiceName(java.lang.String name) {
        ImageServicePortWSDDServiceName = name;
    }

    public t1708e.asm.diduduadi.service.image.ImageService getImageServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ImageServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getImageServicePort(endpoint);
    }

    public t1708e.asm.diduduadi.service.image.ImageService getImageServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            t1708e.asm.diduduadi.service.image.ImageServicePortBindingStub _stub = new t1708e.asm.diduduadi.service.image.ImageServicePortBindingStub(portAddress, this);
            _stub.setPortName(getImageServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setImageServicePortEndpointAddress(java.lang.String address) {
        ImageServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (t1708e.asm.diduduadi.service.image.ImageService.class.isAssignableFrom(serviceEndpointInterface)) {
                t1708e.asm.diduduadi.service.image.ImageServicePortBindingStub _stub = new t1708e.asm.diduduadi.service.image.ImageServicePortBindingStub(new java.net.URL(ImageServicePort_address), this);
                _stub.setPortName(getImageServicePortWSDDServiceName());
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
        if ("ImageServicePort".equals(inputPortName)) {
            return getImageServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "ImageServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "ImageServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ImageServicePort".equals(portName)) {
            setImageServicePortEndpointAddress(address);
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
