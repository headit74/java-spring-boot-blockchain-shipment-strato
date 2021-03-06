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
import com.blockchain.shipmentstrato.model.strato.SendTransaction;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

/**
 * Send a list of users some ether (value in Wei)
 */
@Schema(description = "Send a list of users some ether (value in Wei)")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public class PostUsersSendListRequest {

  @JsonProperty("password")

  private String password = null;

  @JsonProperty("resolve")

  private Boolean resolve = null;

  @JsonProperty("txs")

  private List<SendTransaction> txs = new ArrayList<>();
  public PostUsersSendListRequest password(String password) {
    this.password = password;
    return this;
  }

  

  /**
  * Get password
  * @return password
  **/
  @Schema(required = true, description = "")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public PostUsersSendListRequest resolve(Boolean resolve) {
    this.resolve = resolve;
    return this;
  }

  

  /**
  * Get resolve
  * @return resolve
  **/
  @Schema(required = true, description = "")
  public Boolean isResolve() {
    return resolve;
  }
  public void setResolve(Boolean resolve) {
    this.resolve = resolve;
  }
  public PostUsersSendListRequest txs(List<SendTransaction> txs) {
    this.txs = txs;
    return this;
  }

  public PostUsersSendListRequest addTxsItem(SendTransaction txsItem) {
    this.txs.add(txsItem);
    return this;
  }

  /**
  * Get txs
  * @return txs
  **/
  @Schema(required = true, description = "")
  public List<SendTransaction> getTxs() {
    return txs;
  }
  public void setTxs(List<SendTransaction> txs) {
    this.txs = txs;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUsersSendListRequest postUsersSendListRequest = (PostUsersSendListRequest) o;
    return Objects.equals(this.password, postUsersSendListRequest.password) &&
        Objects.equals(this.resolve, postUsersSendListRequest.resolve) &&
        Objects.equals(this.txs, postUsersSendListRequest.txs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, resolve, txs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUsersSendListRequest {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    resolve: ").append(toIndentedString(resolve)).append("\n");
    sb.append("    txs: ").append(toIndentedString(txs)).append("\n");
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
