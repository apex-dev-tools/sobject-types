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
public class StnryAssetWaterActvty extends SObject {
	public static SObjectType$<StnryAssetWaterActvty> SObjectType;
	public static SObjectFields$<StnryAssetWaterActvty> Fields;

	public String ActivitySourceType;
	public String ActivityType;
	public String CostCenter;
	public Decimal CostPerUnit;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataGapFillingMethodName;
	public String Description;
	public Date EndDate;
	public Id EnvironmentalRiskId;
	public EnvironmentalRisk EnvironmentalRisk;
	public Decimal FinalWaterQuantity;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsRecordLocked;
	public Boolean IsSystemGeneratedRecord;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Decimal ProposedWaterQuantity;
	public Decimal Quantity;
	public Decimal QuantityInM3;
	public String QuantityUnit;
	public Id ServiceProviderId;
	public Supplier ServiceProvider;
	public Date StartDate;
	public Id StnryAssetEnvrSrcId;
	public StnryAssetEnvrSrc StnryAssetEnvrSrc;
	public Id StnryAssetWaterFtprntId;
	public StnryAssetWaterFtprnt StnryAssetWaterFtprnt;
	public Datetime SystemModstamp;
	public Decimal TotalCost;
	public String TreatmentType;
	public Date WaterFtprntReportDate;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public StnryAssetWaterActvtyFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public StnryAssetWaterActvtyHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public StnryAssetWaterActvtyShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public StnryAssetWaterActvty clone$() {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWaterActvty clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWaterActvty clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWaterActvty clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWaterActvty clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
