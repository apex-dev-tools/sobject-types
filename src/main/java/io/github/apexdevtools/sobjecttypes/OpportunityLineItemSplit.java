/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class OpportunityLineItemSplit extends SObject {
	public static SObjectType$<OpportunityLineItemSplit> SObjectType;
	public static SObjectFields$<OpportunityLineItemSplit> Fields;

	public String ArchivedTerritoryName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OpportunityLineItemId;
	public OpportunityLineItem OpportunityLineItem;
	public String Split;
	public Decimal SplitAmount;
	public String SplitNote;
	public Id SplitOwnerId;
	public User SplitOwner;
	public Decimal SplitPercentage;
	public Id SplitTypeId;
	public OpptyLineItemSplitType SplitType;
	public Datetime SystemModstamp;
	public Id Territory2Id;
	public Territory2 Territory2;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public OpportunityLineItemSplitHistory[] Histories;

	public OpportunityLineItemSplit clone$() {throw new java.lang.UnsupportedOperationException();}
	public OpportunityLineItemSplit clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityLineItemSplit clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityLineItemSplit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityLineItemSplit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
