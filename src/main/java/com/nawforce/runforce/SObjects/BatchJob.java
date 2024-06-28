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
public class BatchJob extends SObject {
	public static SObjectType$<BatchJob> SObjectType;
	public static SObjectFields$<BatchJob> Fields;

	public Id BatchJobDefinitionId;
	public BatchJobDefinition BatchJobDefinition;
	public String BatchJobDefinitionName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndTime;
	public String ErrorDescription;
	public String ExternalReference;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String ProcessGroup;
	public Integer RetryCount;
	public String RuntimeParameter;
	public Datetime StartTime;
	public String Status;
	public Datetime SystemModstamp;
	public String Type;

	public AttachedContentDocument[] AttachedContentDocuments;
	public BatchJobPart[] BatchJobs;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public BatchJobFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public BatchJobHistory[] Histories;
	public InsuranceAsyncBulkRequestItem[] InsuranceAsyncBulkRequestItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public BatchJobShare[] Shares;

	public BatchJob clone$() {throw new java.lang.UnsupportedOperationException();}
	public BatchJob clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BatchJob clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BatchJob clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BatchJob clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
