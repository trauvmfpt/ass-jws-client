/**
 * Image.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.test;

public class Image  implements java.io.Serializable {
    private t1708e.asm.diduduadi.service.test.Comment[] commentSet;

    private int id;

    private t1708e.asm.diduduadi.service.test.Post post;

    private t1708e.asm.diduduadi.service.test.Rating[] ratingSet;

    private java.lang.String source;

    private int status;

    public Image() {
    }

    public Image(
           t1708e.asm.diduduadi.service.test.Comment[] commentSet,
           int id,
           t1708e.asm.diduduadi.service.test.Post post,
           t1708e.asm.diduduadi.service.test.Rating[] ratingSet,
           java.lang.String source,
           int status) {
           this.commentSet = commentSet;
           this.id = id;
           this.post = post;
           this.ratingSet = ratingSet;
           this.source = source;
           this.status = status;
    }


    /**
     * Gets the commentSet value for this Image.
     * 
     * @return commentSet
     */
    public t1708e.asm.diduduadi.service.test.Comment[] getCommentSet() {
        return commentSet;
    }


    /**
     * Sets the commentSet value for this Image.
     * 
     * @param commentSet
     */
    public void setCommentSet(t1708e.asm.diduduadi.service.test.Comment[] commentSet) {
        this.commentSet = commentSet;
    }

    public t1708e.asm.diduduadi.service.test.Comment getCommentSet(int i) {
        return this.commentSet[i];
    }

    public void setCommentSet(int i, t1708e.asm.diduduadi.service.test.Comment _value) {
        this.commentSet[i] = _value;
    }


    /**
     * Gets the id value for this Image.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Image.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the post value for this Image.
     * 
     * @return post
     */
    public t1708e.asm.diduduadi.service.test.Post getPost() {
        return post;
    }


    /**
     * Sets the post value for this Image.
     * 
     * @param post
     */
    public void setPost(t1708e.asm.diduduadi.service.test.Post post) {
        this.post = post;
    }


    /**
     * Gets the ratingSet value for this Image.
     * 
     * @return ratingSet
     */
    public t1708e.asm.diduduadi.service.test.Rating[] getRatingSet() {
        return ratingSet;
    }


    /**
     * Sets the ratingSet value for this Image.
     * 
     * @param ratingSet
     */
    public void setRatingSet(t1708e.asm.diduduadi.service.test.Rating[] ratingSet) {
        this.ratingSet = ratingSet;
    }

    public t1708e.asm.diduduadi.service.test.Rating getRatingSet(int i) {
        return this.ratingSet[i];
    }

    public void setRatingSet(int i, t1708e.asm.diduduadi.service.test.Rating _value) {
        this.ratingSet[i] = _value;
    }


    /**
     * Gets the source value for this Image.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this Image.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the status value for this Image.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Image.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Image)) return false;
        Image other = (Image) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commentSet==null && other.getCommentSet()==null) || 
             (this.commentSet!=null &&
              java.util.Arrays.equals(this.commentSet, other.getCommentSet()))) &&
            this.id == other.getId() &&
            ((this.post==null && other.getPost()==null) || 
             (this.post!=null &&
              this.post.equals(other.getPost()))) &&
            ((this.ratingSet==null && other.getRatingSet()==null) || 
             (this.ratingSet!=null &&
              java.util.Arrays.equals(this.ratingSet, other.getRatingSet()))) &&
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
        if (getCommentSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommentSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommentSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getId();
        if (getPost() != null) {
            _hashCode += getPost().hashCode();
        }
        if (getRatingSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRatingSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRatingSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        _hashCode += getStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Image.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "image"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commentSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "comment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("ratingSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ratingSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "rating"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
