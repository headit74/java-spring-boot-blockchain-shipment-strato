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
 * GitInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public class GitInfo {

  @JsonProperty("gitInfoHash")

  private String gitInfoHash = null;

  @JsonProperty("gitInfoBranch")

  private String gitInfoBranch = null;

  @JsonProperty("gitInfoCommitCount")

  private String gitInfoCommitCount = null;

  @JsonProperty("gitInfoCommitDate")

  private String gitInfoCommitDate = null;

  @JsonProperty("gitInfoDescribe")

  private String gitInfoDescribe = null;

  @JsonProperty("gitInfoDirty")

  private Boolean gitInfoDirty = null;

  @JsonProperty("gitInfoDirtyTracked")

  private Boolean gitInfoDirtyTracked = null;
  public GitInfo gitInfoHash(String gitInfoHash) {
    this.gitInfoHash = gitInfoHash;
    return this;
  }

  

  /**
  * Get gitInfoHash
  * @return gitInfoHash
  **/
  @Schema(required = true, description = "")
  public String getGitInfoHash() {
    return gitInfoHash;
  }
  public void setGitInfoHash(String gitInfoHash) {
    this.gitInfoHash = gitInfoHash;
  }
  public GitInfo gitInfoBranch(String gitInfoBranch) {
    this.gitInfoBranch = gitInfoBranch;
    return this;
  }

  

  /**
  * Get gitInfoBranch
  * @return gitInfoBranch
  **/
  @Schema(required = true, description = "")
  public String getGitInfoBranch() {
    return gitInfoBranch;
  }
  public void setGitInfoBranch(String gitInfoBranch) {
    this.gitInfoBranch = gitInfoBranch;
  }
  public GitInfo gitInfoCommitCount(String gitInfoCommitCount) {
    this.gitInfoCommitCount = gitInfoCommitCount;
    return this;
  }

  

  /**
  * Get gitInfoCommitCount
  * @return gitInfoCommitCount
  **/
  @Schema(required = true, description = "")
  public String getGitInfoCommitCount() {
    return gitInfoCommitCount;
  }
  public void setGitInfoCommitCount(String gitInfoCommitCount) {
    this.gitInfoCommitCount = gitInfoCommitCount;
  }
  public GitInfo gitInfoCommitDate(String gitInfoCommitDate) {
    this.gitInfoCommitDate = gitInfoCommitDate;
    return this;
  }

  

  /**
  * Get gitInfoCommitDate
  * @return gitInfoCommitDate
  **/
  @Schema(required = true, description = "")
  public String getGitInfoCommitDate() {
    return gitInfoCommitDate;
  }
  public void setGitInfoCommitDate(String gitInfoCommitDate) {
    this.gitInfoCommitDate = gitInfoCommitDate;
  }
  public GitInfo gitInfoDescribe(String gitInfoDescribe) {
    this.gitInfoDescribe = gitInfoDescribe;
    return this;
  }

  

  /**
  * Get gitInfoDescribe
  * @return gitInfoDescribe
  **/
  @Schema(required = true, description = "")
  public String getGitInfoDescribe() {
    return gitInfoDescribe;
  }
  public void setGitInfoDescribe(String gitInfoDescribe) {
    this.gitInfoDescribe = gitInfoDescribe;
  }
  public GitInfo gitInfoDirty(Boolean gitInfoDirty) {
    this.gitInfoDirty = gitInfoDirty;
    return this;
  }

  

  /**
  * Get gitInfoDirty
  * @return gitInfoDirty
  **/
  @Schema(required = true, description = "")
  public Boolean isGitInfoDirty() {
    return gitInfoDirty;
  }
  public void setGitInfoDirty(Boolean gitInfoDirty) {
    this.gitInfoDirty = gitInfoDirty;
  }
  public GitInfo gitInfoDirtyTracked(Boolean gitInfoDirtyTracked) {
    this.gitInfoDirtyTracked = gitInfoDirtyTracked;
    return this;
  }

  

  /**
  * Get gitInfoDirtyTracked
  * @return gitInfoDirtyTracked
  **/
  @Schema(required = true, description = "")
  public Boolean isGitInfoDirtyTracked() {
    return gitInfoDirtyTracked;
  }
  public void setGitInfoDirtyTracked(Boolean gitInfoDirtyTracked) {
    this.gitInfoDirtyTracked = gitInfoDirtyTracked;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitInfo gitInfo = (GitInfo) o;
    return Objects.equals(this.gitInfoHash, gitInfo.gitInfoHash) &&
        Objects.equals(this.gitInfoBranch, gitInfo.gitInfoBranch) &&
        Objects.equals(this.gitInfoCommitCount, gitInfo.gitInfoCommitCount) &&
        Objects.equals(this.gitInfoCommitDate, gitInfo.gitInfoCommitDate) &&
        Objects.equals(this.gitInfoDescribe, gitInfo.gitInfoDescribe) &&
        Objects.equals(this.gitInfoDirty, gitInfo.gitInfoDirty) &&
        Objects.equals(this.gitInfoDirtyTracked, gitInfo.gitInfoDirtyTracked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gitInfoHash, gitInfoBranch, gitInfoCommitCount, gitInfoCommitDate, gitInfoDescribe, gitInfoDirty, gitInfoDirtyTracked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitInfo {\n");
    
    sb.append("    gitInfoHash: ").append(toIndentedString(gitInfoHash)).append("\n");
    sb.append("    gitInfoBranch: ").append(toIndentedString(gitInfoBranch)).append("\n");
    sb.append("    gitInfoCommitCount: ").append(toIndentedString(gitInfoCommitCount)).append("\n");
    sb.append("    gitInfoCommitDate: ").append(toIndentedString(gitInfoCommitDate)).append("\n");
    sb.append("    gitInfoDescribe: ").append(toIndentedString(gitInfoDescribe)).append("\n");
    sb.append("    gitInfoDirty: ").append(toIndentedString(gitInfoDirty)).append("\n");
    sb.append("    gitInfoDirtyTracked: ").append(toIndentedString(gitInfoDirtyTracked)).append("\n");
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
