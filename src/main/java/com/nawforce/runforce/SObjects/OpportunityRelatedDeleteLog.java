/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class OpportunityRelatedDeleteLog extends SObject {
	public static SObjectFields$<OpportunityRelatedDeleteLog> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataType;
	public String DeleteLog;
	public String Division;
	public String FieldName;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public String Parent;
	public String SobjectType;
	public Datetime SystemModstamp;
	public Object Value;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;

	public OpportunityRelatedDeleteLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public OpportunityRelatedDeleteLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityRelatedDeleteLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityRelatedDeleteLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityRelatedDeleteLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
