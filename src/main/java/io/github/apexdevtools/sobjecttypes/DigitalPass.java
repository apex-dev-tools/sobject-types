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
public class DigitalPass extends SObject {
	public static SObjectType$<DigitalPass> SObjectType;
	public static SObjectFields$<DigitalPass> Fields;

	public Id AccountId;
	public Account Account;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DigitalPassTemplateId;
	public DigitalPassTemplate DigitalPassTemplate;
	public Datetime ExpiryDate;
	public String ExternalUniqueIdentifier;
	public Id Id;
	public String InputPayload;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastSyncDate;
	public Datetime LastViewedDate;
	public Id LoyaltyProgramMemberId;
	public LoyaltyProgramMember LoyaltyProgramMember;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PartyId;
	public Name Party;
	public Id SourceRecordReferenceId;
	public Name SourceRecordReference;
	public String Status;
	public String SyncErrorMessage;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public DigitalPassHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DigitalPassShare[] Shares;

	public DigitalPass clone$() {throw new java.lang.UnsupportedOperationException();}
	public DigitalPass clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DigitalPass clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DigitalPass clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DigitalPass clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
