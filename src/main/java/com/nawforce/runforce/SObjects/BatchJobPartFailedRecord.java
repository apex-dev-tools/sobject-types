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
public class BatchJobPartFailedRecord extends SObject {
	public static SObjectType$<BatchJobPartFailedRecord> SObjectType;
	public static SObjectFields$<BatchJobPartFailedRecord> Fields;

	public Id BatchJobId;
	public BatchJob BatchJob;
	public Id BatchJobPartId;
	public BatchJobPart BatchJobPart;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ErrorDescription;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Record;
	public Id ResubmittedBatchJobId;
	public BatchJob ResubmittedBatchJob;
	public String Status;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public BatchJobPartFailedRecordFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public BatchJobPartFailedRecordHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public BatchJobPartFailedRecord clone$() {throw new java.lang.UnsupportedOperationException();}
	public BatchJobPartFailedRecord clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BatchJobPartFailedRecord clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BatchJobPartFailedRecord clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BatchJobPartFailedRecord clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
