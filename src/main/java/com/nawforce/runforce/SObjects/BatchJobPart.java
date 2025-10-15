/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class BatchJobPart extends SObject {
	public static SObjectType$<BatchJobPart> SObjectType;
	public static SObjectFields$<BatchJobPart> Fields;

	public Id BatchJobId;
	public BatchJob BatchJob;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndTime;
	public String ErrorDescription;
	public Blob FailedRecFileBody;
	public String FailedRecFileContentType;
	public Integer FailedRecFileLength;
	public String FailedRecFileName;
	public Integer FailedRecordCount;
	public Id Id;
	public Integer InputRecordCount;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer OutputRecordCount;
	public Id ParentBatchJobPartId;
	public BatchJobPart ParentBatchJobPart;
	public Blob RecordFileBody;
	public String RecordFileContentType;
	public Integer RecordFileLength;
	public String RecordFileName;
	public Integer RetryCount;
	public Datetime StartTime;
	public String Status;
	public Datetime SystemModstamp;
	public String Type;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public BatchJobPartFailedRecord[] BatchJobPart;
	public BatchJobPart[] ChildBatchJobParts;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public BatchJobPartFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public BatchJobPartHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public BatchJobPart clone$() {throw new java.lang.UnsupportedOperationException();}
	public BatchJobPart clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BatchJobPart clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BatchJobPart clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BatchJobPart clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
