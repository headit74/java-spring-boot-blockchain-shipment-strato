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
import com.blockchain.shipmentstrato.model.strato.NamedTuple;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Chain Input Info
 */
@Schema(description = "Chain Input Info")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public class ChainInput {

  @JsonProperty("src")

  private String src = null;

  @JsonProperty("contract")

  private String contract = null;

  @JsonProperty("label")

  private String label = null;

  @JsonProperty("balances")

  private List<NamedTuple> balances = new ArrayList<>();

  @JsonProperty("args")

  private Map<String, String> args = new HashMap<>();

  @JsonProperty("members")

  private List<NamedTuple> members = new ArrayList<>();

  @JsonProperty("metadata")

  private Map<String, String> metadata = null;
  public ChainInput src(String src) {
    this.src = src;
    return this;
  }

  

  /**
  * Get src
  * @return src
  **/
  @Schema(required = true, description = "")
  public String getSrc() {
    return src;
  }
  public void setSrc(String src) {
    this.src = src;
  }
  public ChainInput contract(String contract) {
    this.contract = contract;
    return this;
  }

  

  /**
  * Get contract
  * @return contract
  **/
  @Schema(description = "")
  public String getContract() {
    return contract;
  }
  public void setContract(String contract) {
    this.contract = contract;
  }
  public ChainInput label(String label) {
    this.label = label;
    return this;
  }

  

  /**
  * Get label
  * @return label
  **/
  @Schema(required = true, description = "")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }
  public ChainInput balances(List<NamedTuple> balances) {
    this.balances = balances;
    return this;
  }

  public ChainInput addBalancesItem(NamedTuple balancesItem) {
    this.balances.add(balancesItem);
    return this;
  }

  /**
  * Get balances
  * @return balances
  **/
  @Schema(required = true, description = "")
  public List<NamedTuple> getBalances() {
    return balances;
  }
  public void setBalances(List<NamedTuple> balances) {
    this.balances = balances;
  }
  public ChainInput args(Map<String, String> args) {
    this.args = args;
    return this;
  }

  
  public ChainInput putArgsItem(String key, String argsItem) {
    this.args.put(key, argsItem);
    return this;
  }
  /**
  * Get args
  * @return args
  **/
  @Schema(required = true, description = "")
  public Map<String, String> getArgs() {
    return args;
  }
  public void setArgs(Map<String, String> args) {
    this.args = args;
  }
  public ChainInput members(List<NamedTuple> members) {
    this.members = members;
    return this;
  }

  public ChainInput addMembersItem(NamedTuple membersItem) {
    this.members.add(membersItem);
    return this;
  }

  /**
  * Get members
  * @return members
  **/
  @Schema(required = true, description = "")
  public List<NamedTuple> getMembers() {
    return members;
  }
  public void setMembers(List<NamedTuple> members) {
    this.members = members;
  }
  public ChainInput metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  
  public ChainInput putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }
  /**
  * Get metadata
  * @return metadata
  **/
  @Schema(description = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChainInput chainInput = (ChainInput) o;
    return Objects.equals(this.src, chainInput.src) &&
        Objects.equals(this.contract, chainInput.contract) &&
        Objects.equals(this.label, chainInput.label) &&
        Objects.equals(this.balances, chainInput.balances) &&
        Objects.equals(this.args, chainInput.args) &&
        Objects.equals(this.members, chainInput.members) &&
        Objects.equals(this.metadata, chainInput.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(src, contract, label, balances, args, members, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChainInput {\n");
    
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
