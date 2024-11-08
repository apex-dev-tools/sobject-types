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
public class BldgEnrgyIntensity extends SObject {
	public static SObjectType$<BldgEnrgyIntensity> SObjectType;
	public static SObjectFields$<BldgEnrgyIntensity> Fields;

	public Decimal AnnualEnergyIntensityInKwhM2;
	public Decimal AnnualEnergyIntensityInKwhSqft;
	public Boolean AreSysGenEnrgyUseRecIncluded;
	public Decimal AveragePowerUsageEffectiveness;
	public Date AveragingWindowEndDate;
	public Date AveragingWindowStartDate;
	public String BldgEnergyIntensityIdentifier;
	public String BuildingAssetType;
	public String BuildingSize;
	public Id BuildingSizeCategoryId;
	public BldgSizeCategory BuildingSizeCategory;
	public String BusinessRegion;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EmissionFactorDataSource;
	public String EmissionFactorUpdateYear;
	public String ExternalIdentifier;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsRecordLocked;
	public Datetime LastCalculatedDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal MaximumBuildingSizeInM2;
	public Decimal MaximumBuildingSizeInSqft;
	public Decimal MinimumBuildingSizeInM2;
	public Decimal MinimumBuildingSizeInSqft;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ReferenceDataLoadLogId;
	public ReferenceDataLoadLog ReferenceDataLoadLog;
	public String RegionalDivision;
	public Boolean ShouldLockDtastUpdtForRec;
	public String State;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public BldgEnrgyIntensityVal[] EnergyIntensityValues;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public BldgEnrgyIntensityFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public BldgEnrgyIntensityHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public StnryAssetCrbnFtprnt[] RegionalStationaryAssetCarbonFootprints;
	public BldgEnrgyIntensityShare[] Shares;
	public StnryAssetCrbnFtprnt[] StationaryAssetCarbonFootprints;
	public StnryAssetEnvrSrc[] StationaryAssetEmissionSources2;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public BldgEnrgyIntensity clone$() {throw new java.lang.UnsupportedOperationException();}
	public BldgEnrgyIntensity clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BldgEnrgyIntensity clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BldgEnrgyIntensity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BldgEnrgyIntensity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
