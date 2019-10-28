/**
 * PostDTO.java
 *
 * このファイルはWSDLから自動生成されました / [en]-(This file was auto-generated from WSDL)
 * Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java生成器によって / [en]-(by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.)
 */

package t1708e.asm.diduduadi.dto;

import t1708e.asm.diduduadi.entity.Post;

import java.util.List;

public class PostDTO implements java.io.Serializable {
    private int id;

    private String info;

    private int placeId;
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private int status;

    private String userName;

    private List<ImageDTO> images;

    private List<CommentDTO> comments;

    private List<RatingDTO> ratings;

    public List<ImageDTO> getImages() {
        return images;
    }

    public void setImages(List<ImageDTO> images) {
        this.images = images;
    }

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

    public PostDTO() {
    }

    public PostDTO(
           int id,
           String info,
           int placeId,
           int status,
           String username) {
           this.id = id;
           this.info = info;
           this.placeId = placeId;
           this.status = status;
           this.userName = username;
    }


    /**
     * Gets the id value for this PostDTO.
     *
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this PostDTO.
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the info value for this PostDTO.
     *
     * @return info
     */
    public String getInfo() {
        return info;
    }


    /**
     * Sets the info value for this PostDTO.
     *
     * @param info
     */
    public void setInfo(String info) {
        this.info = info;
    }


    /**
     * Gets the placeId value for this PostDTO.
     *
     * @return placeId
     */
    public int getPlaceId() {
        return placeId;
    }


    /**
     * Sets the placeId value for this PostDTO.
     *
     * @param placeId
     */
    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }


    /**
     * Gets the status value for this PostDTO.
     *
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PostDTO.
     *
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the userId value for this PostDTO.
     *
     * @return userId
     */
    public String  getUserName() {
        return userName;
    }


    /**
     * Sets the userId value for this PostDTO.
     *
     * @param userName
     */
    public void setUserId(String userName) {
        this.userName = userName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PostDTO)) return false;
        PostDTO other = (PostDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            this.id == other.getId() &&
            ((this.info==null && other.getInfo()==null) ||
             (this.info!=null &&
              this.info.equals(other.getInfo()))) &&
            this.placeId == other.getPlaceId() &&
            this.status == other.getStatus() &&
            this.userName == other.getUserName();
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
        if (getInfo() != null) {
            _hashCode += getInfo().hashCode();
        }
        _hashCode += getPlaceId();
        _hashCode += getStatus();
        _hashCode += getUserName().hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // メタデータ型 / [en]-(Type metadata)
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "postDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info");
        elemField.setXmlName(new javax.xml.namespace.QName("", "info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placeId"));
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
