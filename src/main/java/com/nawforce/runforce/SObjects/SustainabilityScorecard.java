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
public class SustainabilityScorecard extends SObject {
	public static SObjectType$<SustainabilityScorecard> SObjectType;
	public static SObjectFields$<SustainabilityScorecard> Fields;

	public String AllocationStatus;
	public Decimal CompanyAnnualExpenditure;
	public Decimal CompanyAnnualExpenditureEmssn;
	public Decimal CompanyEmissionsAllocationPct;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String EmissionAllocationType;
	public Date EndDate;
	public Decimal FinalScorecardEmissions;
	public Id Id;
	public Boolean IsCurrentSupplierScorecard;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Decimal PercentageBasedEmissions;
	public Date ReportingDueDate;
	public String ScienceBasedTargetStatus;
	public Decimal Scope1Emissions;
	public Decimal Scope2LocationBasedEmissions;
	public Decimal Scope2MarkedBasedEmissions;
	public Decimal Scope3Emissions;
	public String Scope3EmssnCalculationMeasure;
	public String ScopestoIncludeinCalc;
	public Date StartDate;
	public String Status;
	public Decimal SupplierAnnualRevenue;
	public Decimal SupplierAnnualRevenueEmissions;
	public String SupplierClassification;
	public Id SupplierContactId;
	public Contact SupplierContact;
	public String SupplierEmssnRdctnCmtType;
	public Id SupplierId;
	public Supplier Supplier;
	public Decimal SupplierProvidedEmissions;
	public String SupplierReportingScope;
	public String SupplierTier;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
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
	public SustainabilityScorecardFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public SustainabilityScorecardHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SustainabilityScorecardShare[] Shares;
	public Scope3PcmtItem[] SustainabilityScorecards;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public SustainabilityScorecard clone$() {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityScorecard clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityScorecard clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityScorecard clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityScorecard clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
