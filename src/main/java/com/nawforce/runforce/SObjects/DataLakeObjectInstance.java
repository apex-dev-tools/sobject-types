/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DataLakeObjectInstance extends SObject {
	public static SObjectType$<DataLakeObjectInstance> SObjectType;
	public static SObjectFields$<DataLakeObjectInstance> Fields;

	public String AccelerationEnabled;
	public String AccelerationSchedule;
	public String Billable;
	public String Category;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataLakeObjectRef;
	public String DataLakeObjectStatus;
	public String DeletionRecordsDataLakeObject;
	public String Description;
	public String ExternalName;
	public String ExternalObjectErrorCode;
	public String ExternalObjectErrorStatus;
	public String HydrationStatus;
	public Id Id;
	public Boolean IsDeleted;
	public Datetime LastDataChangeStatusDateTime;
	public String LastDataChangeStatusErrorCode;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastRefreshDate;
	public String LastSyncedFingerprint;
	public Datetime LastViewedDate;
	public String Name;
	public String ProblemRecordsDataLakeObject;
	public String Storage;
	public String SyncStatus;
	public Datetime SystemModstamp;
	public Integer TotalNumberOfFields;
	public Long TotalRecords;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DataLakeObjectInstanceFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public DataLakeObjectInstanceHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public DataLakeObjectInstance clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataLakeObjectInstance clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataLakeObjectInstance clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataLakeObjectInstance clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataLakeObjectInstance clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
