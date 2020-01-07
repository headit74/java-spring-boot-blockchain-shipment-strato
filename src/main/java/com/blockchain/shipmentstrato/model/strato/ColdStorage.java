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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ColdStorage
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public class ColdStorage {

  @JsonProperty("address")

  private String address = null;

  @JsonProperty("chain_id")

  private String chainId = null;

  @JsonProperty("binary_values")

  private String binaryValues = null;
  public ColdStorage address(String address) {
    this.address = address;
    return this;
  }

  

  /**
  * Note: This is a Primary Key.
  * @return address
  **/
  @Schema(description = "Note: This is a Primary Key.")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public ColdStorage chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

  

  /**
  * Note: This is a Primary Key.
  * @return chainId
  **/
  @Schema(description = "Note: This is a Primary Key.")
  public String getChainId() {
    return chainId;
  }
  public void setChainId(String chainId) {
    this.chainId = chainId;
  }
  public ColdStorage binaryValues(String binaryValues) {
    this.binaryValues = binaryValues;
    return this;
  }

  

  /**
  * Get binaryValues
  * @return binaryValues
  **/
  @Schema(description = "")
  public String getBinaryValues() {
    return binaryValues;
  }
  public void setBinaryValues(String binaryValues) {
    this.binaryValues = binaryValues;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColdStorage coldStorage = (ColdStorage) o;
    return Objects.equals(this.address, coldStorage.address) &&
        Objects.equals(this.chainId, coldStorage.chainId) &&
        Objects.equals(this.binaryValues, coldStorage.binaryValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, chainId, binaryValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColdStorage {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    binaryValues: ").append(toIndentedString(binaryValues)).append("\n");
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