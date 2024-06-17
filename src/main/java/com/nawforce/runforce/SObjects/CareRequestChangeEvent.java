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
public class CareRequestChangeEvent extends SObject {
	public static SObjectType$<CareRequestChangeEvent> SObjectType;
	public static SObjectFields$<CareRequestChangeEvent> Fields;

	public Datetime AcknowledgementLetterSentDate;
	public Datetime ActualAdmissionDate;
	public Datetime ActualDischargeDate;
	public String AdmissionNotes;
	public String AdmissionSource;
	public String AdmissionType;
	public Datetime AorReceivedDate;
	public Datetime AorRequestedDate;
	public String AppealRequestReasonType;
	public Datetime AppointedRepVerbalContactDate;
	public Datetime AppointedRepWrittenContactDate;
	public Id AppointedRepresentativeId;
	public Account AppointedRepresentative;
	public Integer ApprovedLengthOfStay;
	public String ApprovedLevelOfCare;
	public Id CareRequestCaseId;
	public Case CareRequestCase;
	public Object ChangeEventHeader;
	public String ClaimNumber;
	public String ClinicalCaseType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CriteriaMet;
	public Integer CumulativeLengthOfStay;
	public String CurrencyIsoCode;
	public String CurrentLevelOfCare;
	public Datetime DecisionDate;
	public Integer DecisionDaysRemaining;
	public String DecisionLetter;
	public String DecisionNotes;
	public String DecisionReason;
	public String DecisionReasonDescription;
	public Integer DeniedLengthOfStay;
	public String DeniedLevelOfCare;
	public String DispositionNotes;
	public String Division;
	public Datetime DueDate;
	public Datetime EffectiveFrom;
	public Datetime EffectiveTo;
	public Datetime ExpirationDate;
	public Datetime ExtensionRequestReceivedDate;
	public String ExternalComplaintIdentifier;
	public String FacilityRecordNumber;
	public String FacilityRoomBedType;
	public String FacilityRoomNumber;
	public String FinalLevelOfCare;
	public Id FirstReviewerId;
	public User FirstReviewer;
	public String FirstReviewerNotes;
	public Id GeneralPractitionerId;
	public Contact GeneralPractitioner;
	public Datetime GeneralPractitionerVerbalNotifiedDate;
	public Datetime GeneralPractitionerWrittenNotifiedDate;
	public String GrievanceType;
	public Id Id;
	public Datetime InfoReceivedDate;
	public Datetime InfoRequestedDate;
	public Date InitialDenialNotificationDate;
	public Time InitialDenialNotificationTime;
	public Boolean IsExtendedRequest;
	public Boolean IsReadmission;
	public Boolean IsServiceOrMedicationReceived;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MedicalDirectorId;
	public User MedicalDirector;
	public String MedicalDirectorNotes;
	public String MemberCondition;
	public Datetime MemberContactDateTime;
	public Date MemberDateOfBirth;
	public String MemberFirstName;
	public String MemberGender;
	public String MemberGroupNumber;
	public Id MemberId;
	public Account Member;
	public String MemberIdentificationNumber;
	public String MemberLastName;
	public Id MemberPrimaryPlanId;
	public MemberPlan MemberPrimaryPlan;
	public String MemberPrognosis;
	public Id MemberSecondaryPlanId;
	public MemberPlan MemberSecondaryPlan;
	public String MemberStatus;
	public Datetime MemberVerbalNotificationDate;
	public Datetime MemberWrittenNotificationDate;
	public Datetime ModificationDate;
	public Integer ModifiedLengthOfStay;
	public String ModifiedLevelOfCare;
	public String Name;
	public Datetime NextReviewDate;
	public Id OriginalDenialMedicalDirectorId;
	public User OriginalDenialMedicalDirector;
	public String ParProvider;
	public String PlaceOfService;
	public Datetime PractitionerContactDateTime;
	public String QuantityType;
	public Datetime ReceivedDate;
	public Date ReconsiderationDenialNotificationDate;
	public Time ReconsiderationDenialNotificationTime;
	public Id ReferenceCareRequestCaseId;
	public Case ReferenceCareRequestCase;
	public String ReferenceCaseNumber;
	public String ReopenReason;
	public String ReopenReasonDescription;
	public Datetime ReopenedDate;
	public String ReplayId;
	public Datetime RequestPractitionerVerbalNotifiedDate;
	public Datetime RequestPractitionerWrittenNotifiedDate;
	public Datetime RequestedDate;
	public Integer RequestedLengthOfStay;
	public String RequestedLevelOfCare;
	public String RequesterType;
	public Id RequestingPractitionerId;
	public Contact RequestingPractitioner;
	public String RequestingPractitionerLicense;
	public String RequestingPractitionerSpecialty;
	public Datetime ResolutionDate;
	public Datetime ResolutionLetterSentDate;
	public String ResolutionNotes;
	public Datetime ReviewDate;
	public String RootCauseNotes;
	public Datetime ScheduledAdmissionDate;
	public Datetime ScheduledDischargeDate;
	public Date ServiceDate;
	public Id ServicingFacilityId;
	public Account ServicingFacility;
	public Id ServicingPractitionerId;
	public Contact ServicingPractitioner;
	public String ServicingPractitionerLicense;
	public String ServicingPractitionerSpecialty;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;

	public CareRequestChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareRequestChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
