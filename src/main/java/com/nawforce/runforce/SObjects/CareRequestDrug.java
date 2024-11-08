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
public class CareRequestDrug extends SObject {
	public static SObjectType$<CareRequestDrug> SObjectType;
	public static SObjectFields$<CareRequestDrug> Fields;

	public Integer ApprovedUnits;
	public String AuthApprovalIdentifier;
	public String AuthorizationRefIdentifier;
	public Id CareRequestCaseId;
	public Case CareRequestCase;
	public Id CareRequestId;
	public CareRequest CareRequest;
	public String ClinicalDetermination;
	public String ClinicalDeterminationNote;
	public Id ClinicalDeterminationReasonId;
	public CodeSet ClinicalDeterminationReason;
	public String Code;
	public String CodeType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer DaysSupply;
	public Datetime DecisionDate;
	public Integer DeniedUnits;
	public Address DispenserAddress;
	public String DispenserCity;
	public String DispenserCountry;
	public String DispenserCountryCode;
	public String DispenserFaxNumber;
	public String DispenserGeocodeAccuracy;
	public String DispenserIdentifier;
	public Decimal DispenserLatitude;
	public Decimal DispenserLongitude;
	public String DispenserName;
	public String DispenserPhoneNumber;
	public String DispenserPostalCode;
	public String DispenserState;
	public String DispenserStateCode;
	public String DispenserStreet;
	public String DispenserTaxIdentifier;
	public Datetime DispenserVerbalNotificationDateTime;
	public Datetime DispenserWrittenNotificationDateTime;
	public Id DispensingPharmacyId;
	public Name DispensingPharmacy;
	public String Division;
	public String Dose;
	public String DrugAdministrationSetting;
	public Id DrugCodeId;
	public Name DrugCode;
	public String Frequency;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MedicationCodeId;
	public Medication MedicationCode;
	public Id MedicationRefObjectId;
	public Name MedicationRefObject;
	public String ModifiedCode;
	public String ModifiedCodeType;
	public Integer ModifiedDaysSupply;
	public String ModifiedDose;
	public String ModifiedFrequency;
	public String ModifiedName;
	public String ModifiedSig;
	public String ModifiedStrength;
	public Integer ModifiedTherapyDuration;
	public Integer ModifiedUnits;
	public String Name;
	public Date PrescriptionDate;
	public Date PrescriptionFillDate;
	public Integer PrescriptionFills;
	public String PrescriptionNumber;
	public String Priority;
	public String RequestType;
	public String ServiceCategory;
	public String ServiceCategoryCode;
	public Id ServicingFacilityId;
	public Name ServicingFacility;
	public Id ServicingProviderId;
	public HealthcareProvider ServicingProvider;
	public String Sig;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String Status;
	public String StatusReason;
	public String Strength;
	public Datetime SystemModstamp;
	public Integer TherapyDuration;
	public Integer Units;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CareProcessingError[] CareProcessingErrorReferenceObject;
	public CareRequestReviewer[] CareRequestReviewers;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CareRequestDrugFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CareRequestDrugHistory[] Histories;
	public Identifier[] Identifiers;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CareRequestDrug clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareRequestDrug clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestDrug clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestDrug clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestDrug clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
