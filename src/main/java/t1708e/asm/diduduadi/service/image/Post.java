/**
 * Post.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.image;

public class Post  implements java.io.Serializable {
    private t1708e.asm.diduduadi.service.image.Comment[] commentSet;

    private int id;

    private t1708e.asm.diduduadi.service.image.Image[] imageSet;

    private java.lang.String info;

    private t1708e.asm.diduduadi.service.image.Place place;

    private t1708e.asm.diduduadi.service.image.Rating[] ratingSet;

    private int status;

    private t1708e.asm.diduduadi.service.image.User user;

    public Post() {
    }

    public Post(
           t1708e.asm.diduduadi.service.image.Comment[] commentSet,
           int id,
           t1708e.asm.diduduadi.service.image.Image[] imageSet,
           java.lang.String info,
           t1708e.asm.diduduadi.service.image.Place place,
           t1708e.asm.diduduadi.service.image.Rating[] ratingSet,
           int status,
           t1708e.asm.diduduadi.service.image.User user) {
           this.commentSet = commentSet;
           this.id = id;
           this.imageSet = imageSet;
           this.info = info;
           this.place = place;
           this.ratingSet = ratingSet;
           this.status = status;
           this.user = user;
    }


    /**
     * Gets the commentSet value for this Post.
     * 
     * @return commentSet
     */
    public t1708e.asm.diduduadi.service.image.Comment[] getCommentSet() {
        return commentSet;
    }


    /**
     * Sets the commentSet value for this Post.
     * 
     * @param commentSet
     */
    public void setCommentSet(t1708e.asm.diduduadi.service.image.Comment[] commentSet) {
        this.commentSet = commentSet;
    }

    public t1708e.asm.diduduadi.service.image.Comment getCommentSet(int i) {
        return this.commentSet[i];
    }

    public void setCommentSet(int i, t1708e.asm.diduduadi.service.image.Comment _value) {
        this.commentSet[i] = _value;
    }


    /**
     * Gets the id value for this Post.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Post.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the imageSet value for this Post.
     * 
     * @return imageSet
     */
    public t1708e.asm.diduduadi.service.image.Image[] getImageSet() {
        return imageSet;
    }


    /**
     * Sets the imageSet value for this Post.
     * 
     * @param imageSet
     */
    public void setImageSet(t1708e.asm.diduduadi.service.image.Image[] imageSet) {
        this.imageSet = imageSet;
    }

    public t1708e.asm.diduduadi.service.image.Image getImageSet(int i) {
        return this.imageSet[i];
    }

    public void setImageSet(int i, t1708e.asm.diduduadi.service.image.Image _value) {
        this.imageSet[i] = _value;
    }


    /**
     * Gets the info value for this Post.
     * 
     * @return info
     */
    public java.lang.String getInfo() {
        return info;
    }


    /**
     * Sets the info value for this Post.
     * 
     * @param info
     */
    public void setInfo(java.lang.String info) {
        this.info = info;
    }


    /**
     * Gets the place value for this Post.
     * 
     * @return place
     */
    public t1708e.asm.diduduadi.service.image.Place getPlace() {
        return place;
    }


    /**
     * Sets the place value for this Post.
     * 
     * @param place
     */
    public void setPlace(t1708e.asm.diduduadi.service.image.Place place) {
        this.place = place;
    }


    /**
     * Gets the ratingSet value for this Post.
     * 
     * @return ratingSet
     */
    public t1708e.asm.diduduadi.service.image.Rating[] getRatingSet() {
        return ratingSet;
    }


    /**
     * Sets the ratingSet value for this Post.
     * 
     * @param ratingSet
     */
    public void setRatingSet(t1708e.asm.diduduadi.service.image.Rating[] ratingSet) {
        this.ratingSet = ratingSet;
    }

    public t1708e.asm.diduduadi.service.image.Rating getRatingSet(int i) {
        return this.ratingSet[i];
    }

    public void setRatingSet(int i, t1708e.asm.diduduadi.service.image.Rating _value) {
        this.ratingSet[i] = _value;
    }


    /**
     * Gets the status value for this Post.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Post.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the user value for this Post.
     * 
     * @return user
     */
    public t1708e.asm.diduduadi.service.image.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this Post.
     * 
     * @param user
     */
    public void setUser(t1708e.asm.diduduadi.service.image.User user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Post)) return false;
        Post other = (Post) obj;
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
            ((this.imageSet==null && other.getImageSet()==null) || 
             (this.imageSet!=null &&
              java.util.Arrays.equals(this.imageSet, other.getImageSet()))) &&
            ((this.info==null && other.getInfo()==null) || 
             (this.info!=null &&
              this.info.equals(other.getInfo()))) &&
            ((this.place==null && other.getPlace()==null) || 
             (this.place!=null &&
              this.place.equals(other.getPlace()))) &&
            ((this.ratingSet==null && other.getRatingSet()==null) || 
             (this.ratingSet!=null &&
              java.util.Arrays.equals(this.ratingSet, other.getRatingSet()))) &&
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
        if (getImageSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImageSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImageSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInfo() != null) {
            _hashCode += getInfo().hashCode();
        }
        if (getPlace() != null) {
            _hashCode += getPlace().hashCode();
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
        _hashCode += getStatus();
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Post.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "post"));
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
        elemField.setFieldName("imageSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info");
        elemField.setXmlName(new javax.xml.namespace.QName("", "info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("place");
        elemField.setXmlName(new javax.xml.namespace.QName("", "place"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "place"));
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
