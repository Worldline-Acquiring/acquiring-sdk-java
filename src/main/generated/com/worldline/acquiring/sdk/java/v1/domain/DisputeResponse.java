/*
 * This file was automatically generated.
 */

package com.worldline.acquiring.sdk.java.v1.domain;

public class DisputeResponse {

    private DisputeCaseWithEntries dispute;

    private String requestId;

    /**
     * A dispute represents a chargeback case. It contains details on the dispute and a
     * history of entries that were done against the dispute during the lifecycle of the dispute.
     * <p>
     * Each dispute has a unique {@code disputeId} that identifies it. You can use this {@code disputeId} to
     * retrieve the details of the dispute and its history via the <a href="#operation/getDispute">Retrieve Dispute</a> endpoint,
     * or to retrieve specific documents related to the dispute via the <a href="#operation/getDisputeDocument">Retrieve Dispute Document</a>
     * endpoint.
     * <p>
     * We return both the {@code schemeReason}, which is the reason provided by the card scheme for the
     * dispute, and the {@code unifiedReason}, which is our mapping of the scheme reason to a unified reason
     * that we use across all schemes. This allows you to easily filter disputes based on the
     * {@code unifiedReason}, while still having the {@code schemeReason} available for reference. The
     * {@code unifiedCategory} is a high level category of the dispute reason, that we use to group similar
     * {@code unifiedReason} values together.
     * <p>
     * The {@code disputeStatus} field represents the current status of the dispute. The possible values
     * for this field are specific to each card scheme, but we also provide a {@code disputeStatusCategory}
     * field that groups the different {@code disputeStatus} values into a few high level categories that
     * are consistent across all schemes. This allows you to easily filter disputes based on the
     * {@code disputeStatusCategory}, while still having the {@code disputeStatus} available for reference.
     * <p>
     * The {@code disputeStage} field represents the current stage of the dispute in the dispute lifecycle.
     * The possible values for this field represent the different stages that a dispute can be in during
     * its lifecycle, such as &quot;DISPUTE&quot;, &quot;PRE_ARBITRATION&quot;, &quot;ARBITRATION&quot;, etc.
     * <p>
     * The {@code originalDisputeAmount} object represents the original amount of the dispute when it was first
     * created. This amount can change during the lifecycle of the dispute, for example if the cardholder
     * disputes only part of the original transaction amount, or if there are fees applied to the dispute.
     * The {@code merchantBalanceAmount} field represents the current amount that's charged to or credited
     * back to the merchant for this dispute. This amount can be different from the {@code originalDisputeAmount}
     * due to partial disputes, fees, or if the dispute was challenged by the merchant and is currently
     * being reviewed by the card scheme.
     * <p>
     * The {@code disputeReferences} object contains a set of references related to the dispute, such as the
     * acquirer dispute reference and the scheme dispute reference. These references can be used when
     * communicating with the acquirer or the card scheme about the dispute.
     * <p>
     * The {@code DisputeDateTimeData} object contains a set of date time fields related to the
     * dispute, such as the opened date, response due date, closed date, etc. These fields can provide more
     * context on the timeline of the dispute. When the {@code disputeStatus} is &quot;EVIDENCE_REQUESTED&quot;, the
     * {@code responseDueDate} field indicates the deadline to respond to the dispute.
     * <p>
     * The {@code originalTransactionData} object contains data related to the original transaction that led to the
     * dispute, such as transaction references, transaction amount, payment method data, etc. This information
     * can be useful to understand the context of the dispute and to provide evidence when challenging the
     * dispute.
     * <p>
     * The {@code merchantData} object contains data related to the merchant involved in the dispute, such as merchant
     * name, merchant category code, acquirer ID, etc. This information can also be useful to understand the
     * context of the dispute and to provide evidence when challenging the dispute.
     * <p>
     * Optionally the full history of entries for the dispute is included by setting the {@code includeEntries}
     * parameter to {@code true} when retrieving the dispute details. Each entry in the history represents a step
     * in the lifecycle of the dispute, such as when the dispute was opened, when evidence was requested by the
     * acquirer, when evidence was provided by the merchant, when a credit adjustment was made by the acquirer,
     * etc. The history is ordered from the oldest entry to the most recent one.
     */
    public DisputeCaseWithEntries getDispute() {
        return dispute;
    }

    /**
     * A dispute represents a chargeback case. It contains details on the dispute and a
     * history of entries that were done against the dispute during the lifecycle of the dispute.
     * <p>
     * Each dispute has a unique {@code disputeId} that identifies it. You can use this {@code disputeId} to
     * retrieve the details of the dispute and its history via the <a href="#operation/getDispute">Retrieve Dispute</a> endpoint,
     * or to retrieve specific documents related to the dispute via the <a href="#operation/getDisputeDocument">Retrieve Dispute Document</a>
     * endpoint.
     * <p>
     * We return both the {@code schemeReason}, which is the reason provided by the card scheme for the
     * dispute, and the {@code unifiedReason}, which is our mapping of the scheme reason to a unified reason
     * that we use across all schemes. This allows you to easily filter disputes based on the
     * {@code unifiedReason}, while still having the {@code schemeReason} available for reference. The
     * {@code unifiedCategory} is a high level category of the dispute reason, that we use to group similar
     * {@code unifiedReason} values together.
     * <p>
     * The {@code disputeStatus} field represents the current status of the dispute. The possible values
     * for this field are specific to each card scheme, but we also provide a {@code disputeStatusCategory}
     * field that groups the different {@code disputeStatus} values into a few high level categories that
     * are consistent across all schemes. This allows you to easily filter disputes based on the
     * {@code disputeStatusCategory}, while still having the {@code disputeStatus} available for reference.
     * <p>
     * The {@code disputeStage} field represents the current stage of the dispute in the dispute lifecycle.
     * The possible values for this field represent the different stages that a dispute can be in during
     * its lifecycle, such as &quot;DISPUTE&quot;, &quot;PRE_ARBITRATION&quot;, &quot;ARBITRATION&quot;, etc.
     * <p>
     * The {@code originalDisputeAmount} object represents the original amount of the dispute when it was first
     * created. This amount can change during the lifecycle of the dispute, for example if the cardholder
     * disputes only part of the original transaction amount, or if there are fees applied to the dispute.
     * The {@code merchantBalanceAmount} field represents the current amount that's charged to or credited
     * back to the merchant for this dispute. This amount can be different from the {@code originalDisputeAmount}
     * due to partial disputes, fees, or if the dispute was challenged by the merchant and is currently
     * being reviewed by the card scheme.
     * <p>
     * The {@code disputeReferences} object contains a set of references related to the dispute, such as the
     * acquirer dispute reference and the scheme dispute reference. These references can be used when
     * communicating with the acquirer or the card scheme about the dispute.
     * <p>
     * The {@code DisputeDateTimeData} object contains a set of date time fields related to the
     * dispute, such as the opened date, response due date, closed date, etc. These fields can provide more
     * context on the timeline of the dispute. When the {@code disputeStatus} is &quot;EVIDENCE_REQUESTED&quot;, the
     * {@code responseDueDate} field indicates the deadline to respond to the dispute.
     * <p>
     * The {@code originalTransactionData} object contains data related to the original transaction that led to the
     * dispute, such as transaction references, transaction amount, payment method data, etc. This information
     * can be useful to understand the context of the dispute and to provide evidence when challenging the
     * dispute.
     * <p>
     * The {@code merchantData} object contains data related to the merchant involved in the dispute, such as merchant
     * name, merchant category code, acquirer ID, etc. This information can also be useful to understand the
     * context of the dispute and to provide evidence when challenging the dispute.
     * <p>
     * Optionally the full history of entries for the dispute is included by setting the {@code includeEntries}
     * parameter to {@code true} when retrieving the dispute details. Each entry in the history represents a step
     * in the lifecycle of the dispute, such as when the dispute was opened, when evidence was requested by the
     * acquirer, when evidence was provided by the merchant, when a credit adjustment was made by the acquirer,
     * etc. The history is ordered from the oldest entry to the most recent one.
     */
    public void setDispute(DisputeCaseWithEntries value) {
        this.dispute = value;
    }

    /**
     * A dispute represents a chargeback case. It contains details on the dispute and a
     * history of entries that were done against the dispute during the lifecycle of the dispute.
     * <p>
     * Each dispute has a unique {@code disputeId} that identifies it. You can use this {@code disputeId} to
     * retrieve the details of the dispute and its history via the <a href="#operation/getDispute">Retrieve Dispute</a> endpoint,
     * or to retrieve specific documents related to the dispute via the <a href="#operation/getDisputeDocument">Retrieve Dispute Document</a>
     * endpoint.
     * <p>
     * We return both the {@code schemeReason}, which is the reason provided by the card scheme for the
     * dispute, and the {@code unifiedReason}, which is our mapping of the scheme reason to a unified reason
     * that we use across all schemes. This allows you to easily filter disputes based on the
     * {@code unifiedReason}, while still having the {@code schemeReason} available for reference. The
     * {@code unifiedCategory} is a high level category of the dispute reason, that we use to group similar
     * {@code unifiedReason} values together.
     * <p>
     * The {@code disputeStatus} field represents the current status of the dispute. The possible values
     * for this field are specific to each card scheme, but we also provide a {@code disputeStatusCategory}
     * field that groups the different {@code disputeStatus} values into a few high level categories that
     * are consistent across all schemes. This allows you to easily filter disputes based on the
     * {@code disputeStatusCategory}, while still having the {@code disputeStatus} available for reference.
     * <p>
     * The {@code disputeStage} field represents the current stage of the dispute in the dispute lifecycle.
     * The possible values for this field represent the different stages that a dispute can be in during
     * its lifecycle, such as &quot;DISPUTE&quot;, &quot;PRE_ARBITRATION&quot;, &quot;ARBITRATION&quot;, etc.
     * <p>
     * The {@code originalDisputeAmount} object represents the original amount of the dispute when it was first
     * created. This amount can change during the lifecycle of the dispute, for example if the cardholder
     * disputes only part of the original transaction amount, or if there are fees applied to the dispute.
     * The {@code merchantBalanceAmount} field represents the current amount that's charged to or credited
     * back to the merchant for this dispute. This amount can be different from the {@code originalDisputeAmount}
     * due to partial disputes, fees, or if the dispute was challenged by the merchant and is currently
     * being reviewed by the card scheme.
     * <p>
     * The {@code disputeReferences} object contains a set of references related to the dispute, such as the
     * acquirer dispute reference and the scheme dispute reference. These references can be used when
     * communicating with the acquirer or the card scheme about the dispute.
     * <p>
     * The {@code DisputeDateTimeData} object contains a set of date time fields related to the
     * dispute, such as the opened date, response due date, closed date, etc. These fields can provide more
     * context on the timeline of the dispute. When the {@code disputeStatus} is &quot;EVIDENCE_REQUESTED&quot;, the
     * {@code responseDueDate} field indicates the deadline to respond to the dispute.
     * <p>
     * The {@code originalTransactionData} object contains data related to the original transaction that led to the
     * dispute, such as transaction references, transaction amount, payment method data, etc. This information
     * can be useful to understand the context of the dispute and to provide evidence when challenging the
     * dispute.
     * <p>
     * The {@code merchantData} object contains data related to the merchant involved in the dispute, such as merchant
     * name, merchant category code, acquirer ID, etc. This information can also be useful to understand the
     * context of the dispute and to provide evidence when challenging the dispute.
     * <p>
     * Optionally the full history of entries for the dispute is included by setting the {@code includeEntries}
     * parameter to {@code true} when retrieving the dispute details. Each entry in the history represents a step
     * in the lifecycle of the dispute, such as when the dispute was opened, when evidence was requested by the
     * acquirer, when evidence was provided by the merchant, when a credit adjustment was made by the acquirer,
     * etc. The history is ordered from the oldest entry to the most recent one.
     */
    public DisputeResponse withDispute(DisputeCaseWithEntries value) {
        this.dispute = value;
        return this;
    }

    /**
     * The unique Worldline identifier for the request that resulted in this response.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * The unique Worldline identifier for the request that resulted in this response.
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * The unique Worldline identifier for the request that resulted in this response.
     */
    public DisputeResponse withRequestId(String value) {
        this.requestId = value;
        return this;
    }
}
