/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ConversationEntryCopy extends SObject {
	public static SObjectType$<ConversationEntryCopy> SObjectType;
	public static SObjectFields$<ConversationEntryCopy> Fields;

	public Long ClientDuration;
	public Datetime ClientTimestamp;
	public String ConversationEntryIdentifier;
	public Id ConversationId;
	public Conversation Conversation;
	public Id ConversationParticipantId;
	public ConversationParticipant ConversationParticipant;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EntryPayload;
	public String EntryType;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Modality;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ParentConvEntryCopyId;
	public ConversationEntryCopy ParentConvEntryCopy;
	public Datetime SystemModstamp;
	public Datetime TranscriptedTimestamp;
	public Integer Version;
	public String VisibilityStrategy;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ConversationEntryCopyShare[] Shares;

	public ConversationEntryCopy clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConversationEntryCopy clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConversationEntryCopy clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConversationEntryCopy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConversationEntryCopy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
