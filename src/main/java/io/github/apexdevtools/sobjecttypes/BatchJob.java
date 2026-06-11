/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class BatchJob extends SObject {
	public static SObjectType$<BatchJob> SObjectType;
	public static SObjectFields$<BatchJob> Fields;

	public String AdditionalInformation;
	public Id BatchJobDefinitionId;
	public BatchJobDefinition BatchJobDefinition;
	public String BatchJobDefinitionName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndTime;
	public String ErrorDescription;
	public String ExecutionStage;
	public String ExternalReference;
	public Id Id;
	public Boolean IsDebugOn;
	public Boolean IsDebugRecipeDeleted;
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
	public Integer TotalInputRecordCount;
	public Integer TotalProcessedRecordCount;
	public String Type;
	public String UtilisedExecutionLimit;
	public String UtilisedWritebackLimit;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
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
	public RatingRequestBatchJob[] RatingRequestBatchJobs;
	public BatchJobShare[] Shares;

	public BatchJob clone$() {throw new java.lang.UnsupportedOperationException();}
	public BatchJob clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BatchJob clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BatchJob clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BatchJob clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
