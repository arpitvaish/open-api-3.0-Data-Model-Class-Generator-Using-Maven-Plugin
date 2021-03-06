/*
 * Taxation Domain Model
 * Domain model for Tax data for Reporting Engine
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.example.dataModel;

import java.util.Objects;
import java.util.Arrays;
import com.example.dataModel.CollectionData;
import com.example.dataModel.ReportData;
import com.example.dataModel.TaxData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * TaxDetailsInner
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-14T08:48:09.049340900+05:30[Asia/Calcutta]")
public class TaxDetailsInner {
  @JsonProperty("reportData")
  private ReportData reportData = null;

  @JsonProperty("taxData")
  private TaxData taxData = null;

  @JsonProperty("collectionData")
  private CollectionData collectionData = null;

  public TaxDetailsInner reportData(ReportData reportData) {
    this.reportData = reportData;
    return this;
  }

   /**
   * Get reportData
   * @return reportData
  **/
  @Schema(description = "")
  public ReportData getReportData() {
    return reportData;
  }

  public void setReportData(ReportData reportData) {
    this.reportData = reportData;
  }

  public TaxDetailsInner taxData(TaxData taxData) {
    this.taxData = taxData;
    return this;
  }

   /**
   * Get taxData
   * @return taxData
  **/
  @Schema(description = "")
  public TaxData getTaxData() {
    return taxData;
  }

  public void setTaxData(TaxData taxData) {
    this.taxData = taxData;
  }

  public TaxDetailsInner collectionData(CollectionData collectionData) {
    this.collectionData = collectionData;
    return this;
  }

   /**
   * Get collectionData
   * @return collectionData
  **/
  @Schema(description = "")
  public CollectionData getCollectionData() {
    return collectionData;
  }

  public void setCollectionData(CollectionData collectionData) {
    this.collectionData = collectionData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxDetailsInner taxDetailsInner = (TaxDetailsInner) o;
    return Objects.equals(this.reportData, taxDetailsInner.reportData) &&
        Objects.equals(this.taxData, taxDetailsInner.taxData) &&
        Objects.equals(this.collectionData, taxDetailsInner.collectionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportData, taxData, collectionData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDetailsInner {\n");
    
    sb.append("    reportData: ").append(toIndentedString(reportData)).append("\n");
    sb.append("    taxData: ").append(toIndentedString(taxData)).append("\n");
    sb.append("    collectionData: ").append(toIndentedString(collectionData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
