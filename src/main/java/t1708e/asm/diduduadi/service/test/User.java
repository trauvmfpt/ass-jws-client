/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.asm.diduduadi.service.test;

public class User  implements java.io.Serializable {
    private java.lang.String address;

    private int age;

    private t1708e.asm.diduduadi.service.test.Comment[] commentSet;

    private java.lang.String email;

    private int gender;

    private int id;

    private java.lang.String name;

    private java.lang.String password;

    private t1708e.asm.diduduadi.service.test.Post[] postSet;

    private t1708e.asm.diduduadi.service.test.Rating[] ratingSet;

    private t1708e.asm.diduduadi.service.test.Role[] roleSet;

    private java.lang.String salt;

    private int status;

    private java.lang.String token;

    private java.lang.String username;

    public User() {
    }

    public User(
           java.lang.String address,
           int age,
           t1708e.asm.diduduadi.service.test.Comment[] commentSet,
           java.lang.String email,
           int gender,
           int id,
           java.lang.String name,
           java.lang.String password,
           t1708e.asm.diduduadi.service.test.Post[] postSet,
           t1708e.asm.diduduadi.service.test.Rating[] ratingSet,
           t1708e.asm.diduduadi.service.test.Role[] roleSet,
           java.lang.String salt,
           int status,
           java.lang.String token,
           java.lang.String username) {
           this.address = address;
           this.age = age;
           this.commentSet = commentSet;
           this.email = email;
           this.gender = gender;
           this.id = id;
           this.name = name;
           this.password = password;
           this.postSet = postSet;
           this.ratingSet = ratingSet;
           this.roleSet = roleSet;
           this.salt = salt;
           this.status = status;
           this.token = token;
           this.username = username;
    }


    /**
     * Gets the address value for this User.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this User.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the age value for this User.
     * 
     * @return age
     */
    public int getAge() {
        return age;
    }


    /**
     * Sets the age value for this User.
     * 
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * Gets the commentSet value for this User.
     * 
     * @return commentSet
     */
    public t1708e.asm.diduduadi.service.test.Comment[] getCommentSet() {
        return commentSet;
    }


    /**
     * Sets the commentSet value for this User.
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
     * Gets the email value for this User.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this User.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the gender value for this User.
     * 
     * @return gender
     */
    public int getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this User.
     * 
     * @param gender
     */
    public void setGender(int gender) {
        this.gender = gender;
    }


    /**
     * Gets the id value for this User.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this User.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the name value for this User.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this User.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the password value for this User.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this User.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the postSet value for this User.
     * 
     * @return postSet
     */
    public t1708e.asm.diduduadi.service.test.Post[] getPostSet() {
        return postSet;
    }


    /**
     * Sets the postSet value for this User.
     * 
     * @param postSet
     */
    public void setPostSet(t1708e.asm.diduduadi.service.test.Post[] postSet) {
        this.postSet = postSet;
    }

    public t1708e.asm.diduduadi.service.test.Post getPostSet(int i) {
        return this.postSet[i];
    }

    public void setPostSet(int i, t1708e.asm.diduduadi.service.test.Post _value) {
        this.postSet[i] = _value;
    }


    /**
     * Gets the ratingSet value for this User.
     * 
     * @return ratingSet
     */
    public t1708e.asm.diduduadi.service.test.Rating[] getRatingSet() {
        return ratingSet;
    }


    /**
     * Sets the ratingSet value for this User.
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
     * Gets the roleSet value for this User.
     * 
     * @return roleSet
     */
    public t1708e.asm.diduduadi.service.test.Role[] getRoleSet() {
        return roleSet;
    }


    /**
     * Sets the roleSet value for this User.
     * 
     * @param roleSet
     */
    public void setRoleSet(t1708e.asm.diduduadi.service.test.Role[] roleSet) {
        this.roleSet = roleSet;
    }

    public t1708e.asm.diduduadi.service.test.Role getRoleSet(int i) {
        return this.roleSet[i];
    }

    public void setRoleSet(int i, t1708e.asm.diduduadi.service.test.Role _value) {
        this.roleSet[i] = _value;
    }


    /**
     * Gets the salt value for this User.
     * 
     * @return salt
     */
    public java.lang.String getSalt() {
        return salt;
    }


    /**
     * Sets the salt value for this User.
     * 
     * @param salt
     */
    public void setSalt(java.lang.String salt) {
        this.salt = salt;
    }


    /**
     * Gets the status value for this User.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this User.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the token value for this User.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this User.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the username value for this User.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this User.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            this.age == other.getAge() &&
            ((this.commentSet==null && other.getCommentSet()==null) || 
             (this.commentSet!=null &&
              java.util.Arrays.equals(this.commentSet, other.getCommentSet()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.gender == other.getGender() &&
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.postSet==null && other.getPostSet()==null) || 
             (this.postSet!=null &&
              java.util.Arrays.equals(this.postSet, other.getPostSet()))) &&
            ((this.ratingSet==null && other.getRatingSet()==null) || 
             (this.ratingSet!=null &&
              java.util.Arrays.equals(this.ratingSet, other.getRatingSet()))) &&
            ((this.roleSet==null && other.getRoleSet()==null) || 
             (this.roleSet!=null &&
              java.util.Arrays.equals(this.roleSet, other.getRoleSet()))) &&
            ((this.salt==null && other.getSalt()==null) || 
             (this.salt!=null &&
              this.salt.equals(other.getSalt()))) &&
            this.status == other.getStatus() &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        _hashCode += getAge();
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += getGender();
        _hashCode += getId();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPostSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPostSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPostSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getRoleSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoleSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoleSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalt() != null) {
            _hashCode += getSalt().hashCode();
        }
        _hashCode += getStatus();
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "user"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("age");
        elemField.setXmlName(new javax.xml.namespace.QName("", "age"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commentSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "comment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "post"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("roleSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roleSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "role"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salt"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
