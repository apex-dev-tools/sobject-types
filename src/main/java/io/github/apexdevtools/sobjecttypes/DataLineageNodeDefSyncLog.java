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
public class DataLineageNodeDefSyncLog extends SObject {
	public static SObjectType$<DataLineageNodeDefSyncLog> SObjectType;
	public static SObjectFields$<DataLineageNodeDefSyncLog> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataSpace;
	public String DevName;
	public Id Id;
	public Boolean IsDeleted;
	public String LastFailureReason;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ObjectType;
	public Datetime OperationTime;
	public String OperationType;
	public Id OwnerId;
	public Name Owner;
	public String Payload;
	public String RecordIdentifier;
	public String SyncStatus;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DataLineageNodeDefSyncLogFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public DataLineageNodeDefSyncLogHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DataLineageNodeDefSyncLogShare[] Shares;

	public DataLineageNodeDefSyncLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataLineageNodeDefSyncLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataLineageNodeDefSyncLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataLineageNodeDefSyncLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataLineageNodeDefSyncLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
