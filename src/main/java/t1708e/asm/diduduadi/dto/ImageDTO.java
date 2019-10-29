/**
 * ImageDTO.java
 *
 * このファイルはWSDLから自動生成されました / [en]-(This file was auto-generated from WSDL)
 * Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java生成器によって / [en]-(by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.)
 */

package t1708e.asm.diduduadi.dto;

import java.util.List;

public class ImageDTO implements java.io.Serializable {
    private int id;

    private int postId;

    private String source;

    private int status;
    private List<CommentDTO> comments;
    private List<RatingDTO> ratings;

    public List<CommentDTO> getComments() {
        return comments;
    }

    public void setComments(List<CommentDTO> comments) {
        this.comments = comments;
    }

    public List<RatingDTO> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingDTO> ratings) {
        this.ratings = ratings;
    }

    public ImageDTO() {
    }

    public ImageDTO(
           int id,
           int postId,
           String source,
           int status) {
           this.id = id;
           this.postId = postId;
           this.source = source;
           this.status = status;
    }


    /**
     * Gets the id value for this ImageDTO.
     *
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this ImageDTO.
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the postId value for this ImageDTO.
     *
     * @return postId
     */
    public int getPostId() {
        return postId;
    }


    /**
     * Sets the postId value for this ImageDTO.
     *
     * @param postId
     */
    public void setPostId(int postId) {
        this.postId = postId;
    }


    /**
     * Gets the source value for this ImageDTO.
     *
     * @return source
     */
    public String getSource() {
        return source;
    }


    /**
     * Sets the source value for this ImageDTO.
     *
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }


    /**
     * Gets the status value for this ImageDTO.
     *
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ImageDTO.
     *
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ImageDTO)) return false;
        ImageDTO other = (ImageDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            this.id == other.getId() &&
            this.postId == other.getPostId() &&
            ((this.source==null && other.getSource()==null) ||
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            this.status == other.getStatus();
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
        _hashCode += getId();
        _hashCode += getPostId();
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        _hashCode += getStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // メタデータ型 / [en]-(Type metadata)
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImageDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "imageDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
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
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
