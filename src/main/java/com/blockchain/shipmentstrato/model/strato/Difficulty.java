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
 * Difficulty
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-07T11:36:15.752447+08:00[Asia/Shanghai]")public class Difficulty {

  @JsonProperty("unDifficulty")

  private Integer unDifficulty = null;
  public Difficulty unDifficulty(Integer unDifficulty) {
    this.unDifficulty = unDifficulty;
    return this;
  }

  

  /**
  * Get unDifficulty
  * @return unDifficulty
  **/
  @Schema(required = true, description = "")
  public Integer getUnDifficulty() {
    return unDifficulty;
  }
  public void setUnDifficulty(Integer unDifficulty) {
    this.unDifficulty = unDifficulty;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Difficulty difficulty = (Difficulty) o;
    return Objects.equals(this.unDifficulty, difficulty.unDifficulty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unDifficulty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Difficulty {\n");
    
    sb.append("    unDifficulty: ").append(toIndentedString(unDifficulty)).append("\n");
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
