/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class FulfillmentOrderItemTax extends SObject {
	public static SObjectType$<FulfillmentOrderItemTax> SObjectType;
	public static SObjectFields$<FulfillmentOrderItemTax> Fields;

	public Decimal Amount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id FulfillmentOrderId;
	public FulfillmentOrder FulfillmentOrder;
	public Id FulfillmentOrderItemAdjustId;
	public FulfillmentOrderItemAdjustment FulfillmentOrderItemAdjust;
	public String FulfillmentOrderItemTaxNumber;
	public Id FulfillmentOrderLineItemId;
	public FulfillmentOrderLineItem FulfillmentOrderLineItem;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Rate;
	public Datetime SystemModstamp;
	public Date TaxEffectiveDate;
	public String Type;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public FulfillmentOrderItemTaxFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public FulfillmentOrderItemTax clone$() {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderItemTax clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderItemTax clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderItemTax clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderItemTax clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
