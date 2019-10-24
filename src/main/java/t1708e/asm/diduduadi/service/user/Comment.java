/**
 * Comment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.user;

public class Comment  implements java.io.Serializable {
    private java.lang.String content;

    private int id;

    private t1708e.asm.diduduadi.service.user.Image image;

    private t1708e.asm.diduduadi.service.user.Post post;

    private int status;

    private t1708e.asm.diduduadi.service.user.User user;

    public Comment() {
    }

    public Comment(
           java.lang.String content,
           int id,
           t1708e.asm.diduduadi.service.user.Image image,
           t1708e.asm.diduduadi.service.user.Post post,
           int status,
           t1708e.asm.diduduadi.service.user.User user) {
           this.content = content;
           this.id = id;
           this.image = image;
           this.post = post;
           this.status = status;
           this.user = user;
    }


    /**
     * Gets the content value for this Comment.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this Comment.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the id value for this Comment.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Comment.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the image value for this Comment.
     * 
     * @return image
     */
    public t1708e.asm.diduduadi.service.user.Image getImage() {
        return image;
    }


    /**
     * Sets the image value for this Comment.
     * 
     * @param image
     */
    public void setImage(t1708e.asm.diduduadi.service.user.Image image) {
        this.image = image;
    }


    /**
     * Gets the post value for this Comment.
     * 
     * @return post
     */
    public t1708e.asm.diduduadi.service.user.Post getPost() {
        return post;
    }


    /**
     * Sets the post value for this Comment.
     * 
     * @param post
     */
    public void setPost(t1708e.asm.diduduadi.service.user.Post post) {
        this.post = post;
    }


    /**
     * Gets the status value for this Comment.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Comment.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the user value for this Comment.
     * 
     * @return user
     */
    public t1708e.asm.diduduadi.service.user.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this Comment.
     * 
     * @param user
     */
    public void setUser(t1708e.asm.diduduadi.service.user.User user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Comment)) return false;
        Comment other = (Comment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            this.id == other.getId() &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.post==null && other.getPost()==null) || 
             (this.post!=null &&
              this.post.equals(other.getPost()))) &&
            this.status == other.getStatus() &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        _hashCode += getId();
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getPost() != null) {
            _hashCode += getPost().hashCode();
        }
        _hashCode += getStatus();
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Comment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "comment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("post");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "post"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "user"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
