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
