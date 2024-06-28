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
public class HealthcareFacility extends SObject {
	public static SObjectType$<HealthcareFacility> SObjectType;
	public static SObjectFields$<HealthcareFacility> Fields;

	public Id AccountId;
	public Account Account;
	public String AvailabilityExceptions;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id FacilityTypeId;
	public CodeSetBundle FacilityType;
	public Id Id;
	public Boolean IsAlwaysOpen;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer LicensedBedCount;
	public Id LocationId;
	public Location Location;
	public String LocationType;
	public String Name;
	public Id ParentHealthcareFacilityId;
	public HealthcareFacility ParentHealthcareFacility;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public ClinicalEncounter[] CE_DestinationFacility;
	public ClinicalEncounter[] CE_Facility;
	public ClinicalEncounter[] CE_PreviousFacility;
	public CareRequestDrug[] CareRequestDrugs;
	public CareTask[] CareTaskLocations;
	public ClinicalServiceRequestDetail[] ClinSvcReqDetail_Detail;
	public ClinicalEncounterFacility[] Clinical_Encounter_Healthcare_Facility;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public ClinicalServiceRequest[] Facilities;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public HealthcareFacilityFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public HealthcareFacility[] HealthcareFacilityParent;
	public HealthcarePractitionerFacility[] HealthcarePractitionerFacilities;
	public HealthcareProviderService[] HealthcareProviderGroup;
	public HealthcareFacilityNetwork[] Healthcare_Facility_Networks;
	public HealthcareFacilityHistory[] Histories;
	public Identifier[] Identifiers;
	public MedicationDispense[] MedicationDispense_DeliveryLocation;
	public MedicationDispense[] MedicationDispense_HealthcareFacilities;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public PatientImmunization[] Patient_Immunization_Facility;
	public PatientMedicalProcedure[] Patient_Medical_Procedure_Facility;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public CareRequestExtension[] ServicingFacilityCareRequestExtensions;
	public CareRequestItem[] ServicingFacilityCareRequestItems;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public HealthcareFacility clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthcareFacility clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareFacility clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareFacility clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareFacility clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
