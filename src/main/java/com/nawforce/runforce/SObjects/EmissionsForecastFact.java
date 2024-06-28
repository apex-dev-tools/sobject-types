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
public class EmissionsForecastFact extends SObject {
	public static SObjectType$<EmissionsForecastFact> SObjectType;
	public static SObjectFields$<EmissionsForecastFact> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal ActualEmissions;
	public Decimal ActualEmissionsIntensity;
	public Decimal ActualEnergyConsumption;
	public Decimal ActualLocationBasedEmissions;
	public Decimal ActualMarketBasedEmissions;
	public Decimal ActualRenewableEnergyCnsmpPct;
	public Id AdvAcctForecastSetPartnerId;
	public AdvAcctForecastSetPartner AdvAcctForecastSetPartner;
	public Decimal CarbonCreditCost;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id EmissionsActivityId;
	public EmissionsActivity EmissionsActivity;
	public Decimal FinalForecastedEmissions;
	public Decimal ForcstEmssnIntensityRdctnPct;
	public Decimal ForcstRenewableEnergyCnsmpPct;
	public Decimal ForecastedEmissions;
	public Decimal ForecastedEmissionsIntensity;
	public Decimal ForecastedEmissionsOverride;
	public Decimal ForecastedEnergyConsumption;
	public Decimal ForecastedLocationBasedEmssn;
	public Decimal ForecastedMarketBasedEmssn;
	public Decimal Headcount;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Decimal NetEmissionsForecast;
	public Decimal OtherApplnForecastedEmissions;
	public Id OwnerId;
	public Name Owner;
	public Id PeriodId;
	public Period Period;
	public Decimal PlannedCarbonCredits;
	public Decimal PlannedCarbonCreditsInvst;
	public Decimal PlnOperationalEmissionsRdctn;
	public Decimal PlnSupplierEmissionsRdctn;
	public Decimal ProcurementSpend;
	public Decimal RequiredCarbonCredits;
	public Decimal RequiredCarbonCreditsInvst;
	public Decimal Revenue;
	public String Status;
	public Datetime SystemModstamp;
	public Decimal TargetCompensatedEmissions;
	public Decimal TargetEmissions;
	public Decimal TargetRenewableEnergyPct;
	public Decimal TotalFloorArea;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastFactAdj[] AdvAcctForecastFactAdjustments;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public EmissionsForecastFactFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public EmissionsForecastFactHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public EmissionsForecastFactShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public EmissionsForecastFact clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmissionsForecastFact clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmissionsForecastFact clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmissionsForecastFact clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmissionsForecastFact clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
