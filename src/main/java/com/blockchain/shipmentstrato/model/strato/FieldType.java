/*
 * STRATO API
 * This Swagger interactive documentation makes STRATO API calls to OAuth-protected STRATO demo node. Click 'Authorize' to sign-in with the test account.
 *
 * OpenAPI spec version: 4.5.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.blockchain.shipmentstrato.model.strato;

import java.util.Objects;
import com.blockchain.shipmentstrato.model.strato.SolidityType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Represents a Solidity Field Type
 */
@Schema(description = "Represents a Solidity Field Type")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public class FieldType {

  @JsonProperty("fieldTypeAtBytes")

  private Integer fieldTypeAtBytes = null;

  @JsonProperty("fieldTypeType")

  private SolidityType fieldTypeType = null;
  public FieldType fieldTypeAtBytes(Integer fieldTypeAtBytes) {
    this.fieldTypeAtBytes = fieldTypeAtBytes;
    return this;
  }

  

  /**
  * Get fieldTypeAtBytes
  * minimum: -2147483648
  * maximum: 2147483647
  * @return fieldTypeAtBytes
  **/
  @Schema(required = true, description = "")
  public Integer getFieldTypeAtBytes() {
    return fieldTypeAtBytes;
  }
  public void setFieldTypeAtBytes(Integer fieldTypeAtBytes) {
    this.fieldTypeAtBytes = fieldTypeAtBytes;
  }
  public FieldType fieldTypeType(SolidityType fieldTypeType) {
    this.fieldTypeType = fieldTypeType;
    return this;
  }

  

  /**
  * Get fieldTypeType
  * @return fieldTypeType
  **/
  @Schema(required = true, description = "")
  public SolidityType getFieldTypeType() {
    return fieldTypeType;
  }
  public void setFieldTypeType(SolidityType fieldTypeType) {
    this.fieldTypeType = fieldTypeType;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldType fieldType = (FieldType) o;
    return Objects.equals(this.fieldTypeAtBytes, fieldType.fieldTypeAtBytes) &&
        Objects.equals(this.fieldTypeType, fieldType.fieldTypeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldTypeAtBytes, fieldTypeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldType {\n");
    
    sb.append("    fieldTypeAtBytes: ").append(toIndentedString(fieldTypeAtBytes)).append("\n");
    sb.append("    fieldTypeType: ").append(toIndentedString(fieldTypeType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
