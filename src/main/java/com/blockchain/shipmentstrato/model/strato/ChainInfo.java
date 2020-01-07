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
import com.blockchain.shipmentstrato.model.strato.ChainSignature;
import com.blockchain.shipmentstrato.model.strato.UnsignedChainInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ChainInfo
 */
@Schema(description = "ChainInfo")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public class ChainInfo {

  @JsonProperty("info")

  private UnsignedChainInfo info = null;

  @JsonProperty("signature")

  private ChainSignature signature = null;
  public ChainInfo info(UnsignedChainInfo info) {
    this.info = info;
    return this;
  }

  

  /**
  * Get info
  * @return info
  **/
  @Schema(required = true, description = "")
  public UnsignedChainInfo getInfo() {
    return info;
  }
  public void setInfo(UnsignedChainInfo info) {
    this.info = info;
  }
  public ChainInfo signature(ChainSignature signature) {
    this.signature = signature;
    return this;
  }

  

  /**
  * Get signature
  * @return signature
  **/
  @Schema(description = "")
  public ChainSignature getSignature() {
    return signature;
  }
  public void setSignature(ChainSignature signature) {
    this.signature = signature;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChainInfo chainInfo = (ChainInfo) o;
    return Objects.equals(this.info, chainInfo.info) &&
        Objects.equals(this.signature, chainInfo.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChainInfo {\n");
    
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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