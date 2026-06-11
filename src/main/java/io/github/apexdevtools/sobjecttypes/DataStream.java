/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
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
public class DataStream extends SObject {
	public static SObjectType$<DataStream> SObjectType;
	public static SObjectFields$<DataStream> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataStreamStatus;
	public String DeletionRecordsDataLakeObject;
	public String Description;
	public String ExternalRecordIdentifier;
	public String ExternalStreamErrorCode;
	public String FullRefreshIntervalDays;
	public Id Id;
	public String ImportRunStatus;
	public Boolean IsDeleted;
	public Boolean IsNewFieldsAvailable;
	public Boolean IsRefreshDeliveryHourAutomatic;
	public Datetime LastDataChangeStatusDateTime;
	public String LastDataChangeStatusErrorCode;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Long LastNumberOfRowsAddedCount;
	public Datetime LastReferencedDate;
	public Datetime LastRefreshDate;
	public Datetime LastViewedDate;
	public String Name;
	public String ProblemRecordsDataLakeObject;
	public Integer RefreshDayOfMonth;
	public Integer RefreshDayOfWeek;
	public String RefreshFrequency;
	public String RefreshHours;
	public String RefreshMode;
	public String StreamType;
	public Datetime SystemModstamp;
	public Long TotalNumberOfRowsAdded;
	public Long TotalRowsProcessed;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DataStreamFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public DataStreamHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public DataStream clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataStream clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataStream clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataStream clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataStream clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
