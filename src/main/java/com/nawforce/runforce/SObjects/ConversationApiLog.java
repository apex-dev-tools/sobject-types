/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ConversationApiLog extends SObject {
	public static SObjectType$<ConversationApiLog> SObjectType;
	public static SObjectFields$<ConversationApiLog> Fields;

	public String Action;
	public String Context;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Operation;
	public Id OwnerId;
	public Name Owner;
	public String Parameter;
	public Id RequestedById;
	public User RequestedBy;
	public Datetime RequestedDate;
	public String RequestedEntityIdentifier;
	public String RequestedEntityType;
	public String Status;
	public String StatusHistory;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ConversationApiLogShare[] Shares;

	public ConversationApiLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConversationApiLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConversationApiLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConversationApiLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConversationApiLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
