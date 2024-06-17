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
public class StnryAssetWaterFtprnt extends SObject {
	public static SObjectType$<StnryAssetWaterFtprnt> SObjectType;
	public static SObjectFields$<StnryAssetWaterFtprnt> Fields;

	public Decimal CnsmpIntsVariancePct;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal DchgIntsVariancePct;
	public Decimal EmployeeCnsmpIntsInM3;
	public Decimal EmployeeCount;
	public Decimal EmployeeDchgIntsInM3;
	public Decimal EmployeeWdrwIntsInM3;
	public Date EndDate;
	public Decimal ExtremeStressCnsmpPct;
	public Decimal ExtremeStressWdrwPct;
	public Decimal FlAreaCnsmpIntsInM3M2;
	public Decimal FlAreaCnsmpIntsInM3Sqft;
	public Decimal FlAreaDchgIntsInM3M2;
	public Decimal FlAreaDchgIntsInM3Sqft;
	public Decimal FlAreaWdrwIntsInM3M2;
	public Decimal FlAreaWdrwIntsInM3Sqft;
	public String FootprintStage;
	public Decimal HighStressCnsmpPct;
	public Decimal HighStressWdrwPct;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Decimal OccupiedFloorArea;
	public String OccupiedFloorAreaUnit;
	public Id OwnerId;
	public Name Owner;
	public Id PreviousYearWaterFtprntId;
	public StnryAssetWaterFtprnt PreviousYearWaterFtprnt;
	public Decimal ProdtVolumeCnsmpIntsInM3;
	public Decimal ProdtVolumeDchgIntsInM3;
	public Decimal ProdtVolumeWdrwIntsInM3;
	public String ReportingYear;
	public Date StartDate;
	public Id StnryAssetEnvrSrcId;
	public StnryAssetEnvrSrc StnryAssetEnvrSrc;
	public Datetime SystemModstamp;
	public Decimal TotalConsumptionInMl;
	public Decimal TotalCost;
	public Decimal TotalDischargeInMl;
	public Decimal TotalFloorArea;
	public String TotalFloorAreaUnit;
	public Decimal TotalStorageInMl;
	public Decimal TotalUnitsManufactured;
	public Decimal TotalWithdrawalInMl;
	public Decimal WaterInventoryRecCount;
	public Decimal WdrwIntsVariancePct;

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
	public StnryAssetWaterFtprntFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public StnryAssetWaterFtprntHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public StnryAssetWaterFtprntShare[] Shares;
	public StnryAssetWaterActvty[] StationaryAssetWaterActivities;
	public StnryAssetWtrFtprntItm[] StationaryAssetWaterFootprintItems;
	public StnryAssetWaterFtprnt[] StationaryAssetWaterFootprints;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public StnryAssetWaterFtprnt clone$() {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWaterFtprnt clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWaterFtprnt clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWaterFtprnt clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWaterFtprnt clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
