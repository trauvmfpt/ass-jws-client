/**
 * CommentDTO.java
 *
 * このファイルはWSDLから自動生成されました / [en]-(This file was auto-generated from WSDL)
 * Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java生成器によって / [en]-(by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.)
 */

package t1708e.asm.diduduadi.dto;

public class CommentDTO implements java.io.Serializable {
    private String content;

    private int id;

    private int imageId;

    private int postId;

    private int status;

    private int userId;

    public CommentDTO() {
    }

    public CommentDTO(
           String content,
           int id,
           int imageId,
           int postId,
           int status,
           int userId) {
           this.content = content;
           this.id = id;
           this.imageId = imageId;
           this.postId = postId;
           this.status = status;
           this.userId = userId;
    }


    /**
     * Gets the content value for this CommentDTO.
     *
     * @return content
     */
    public String getContent() {
        return content;
    }


    /**
     * Sets the content value for this CommentDTO.
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * Gets the id value for this CommentDTO.
     *
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this CommentDTO.
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the imageId value for this CommentDTO.
     *
     * @return imageId
     */
    public int getImageId() {
        return imageId;
    }


    /**
     * Sets the imageId value for this CommentDTO.
     *
     * @param imageId
     */
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }


    /**
     * Gets the postId value for this CommentDTO.
     *
     * @return postId
     */
    public int getPostId() {
        return postId;
    }


    /**
     * Sets the postId value for this CommentDTO.
     *
     * @param postId
     */
    public void setPostId(int postId) {
        this.postId = postId;
    }


    /**
     * Gets the status value for this CommentDTO.
     *
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CommentDTO.
     *
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the userId value for this CommentDTO.
     *
     * @return userId
     */
    public int getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this CommentDTO.
     *
     * @param userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CommentDTO)) return false;
        CommentDTO other = (CommentDTO) obj;
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
            this.imageId == other.getImageId() &&
            this.postId == other.getPostId() &&
            this.status == other.getStatus() &&
            this.userId == other.getUserId();
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
        _hashCode += getImageId();
        _hashCode += getPostId();
        _hashCode += getStatus();
        _hashCode += getUserId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // メタデータ型 / [en]-(Type metadata)
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommentDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "commentDTO"));
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
        elemField.setFieldName("imageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * メタデータオブジェクトの型を返却 / [en]-(Return type metadata object)
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
