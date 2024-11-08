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
public class AirTravelEnrgyUse extends SObject {
	public static SObjectType$<AirTravelEnrgyUse> SObjectType;
	public static SObjectFields$<AirTravelEnrgyUse> Fields;

	public Id AirTravelEmssnFctrId;
	public AirTravelEmssnFctr AirTravelEmssnFctr;
	public String CalculationDetail;
	public Date CarbonFootprintReportDate;
	public Decimal Ch4PassengerKmInKgCo2e;
	public Decimal Ch4PassengerMileInKgCo2e;
	public Decimal Co2PassengerKmInKg;
	public Decimal Co2PassengerMileInKg;
	public String CostCenter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DestinationCity;
	public String DestinationCountry;
	public Date EndDate;
	public String HaulLength;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal N2oPassengerKmInKgCo2e;
	public Decimal N2oPassengerMileInKgCo2e;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id Scope3CrbnFtprntId;
	public Scope3CrbnFtprnt Scope3CrbnFtprnt;
	public Decimal Scope3EmissionsInTco2e;
	public Id Scope3EmssnSrcId;
	public Scope3EmssnSrc Scope3EmssnSrc;
	public Decimal SegmentDistance;
	public Decimal SegmentDistanceInMiles;
	public String SegmentDistanceUnit;
	public String SourceCity;
	public String SourceCountry;
	public Date StartDate;
	public Decimal SuplScope3Emissions;
	public Id SupplierId;
	public Supplier Supplier;
	public Datetime SystemModstamp;
	public String TravelerBaseCity;
	public String TravelerBaseCountry;
	public String TravelerName;
	public Decimal VendorProvidedEmissionsInTco2e;

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
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public AirTravelEnrgyUseFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public AirTravelEnrgyUseHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AirTravelEnrgyUseShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public AirTravelEnrgyUse clone$() {throw new java.lang.UnsupportedOperationException();}
	public AirTravelEnrgyUse clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AirTravelEnrgyUse clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AirTravelEnrgyUse clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AirTravelEnrgyUse clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
