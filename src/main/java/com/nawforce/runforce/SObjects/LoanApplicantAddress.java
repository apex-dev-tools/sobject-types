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
public class LoanApplicantAddress extends SObject {
	public static SObjectType$<LoanApplicantAddress> SObjectType;
	public static SObjectFields$<LoanApplicantAddress> Fields;

	public String AddressExtIdentifier;
	public String AddressOwnership;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoanApplicantId;
	public LoanApplicant LoanApplicant;
	public Id LoanApplicationId;
	public ResidentialLoanApplication LoanApplication;
	public Decimal MonthlyRentPayment;
	public String Name;
	public Integer ResidenceAdditionalMonthCount;
	public Address ResidenceAddress;
	public String ResidenceCity;
	public String ResidenceCountry;
	public String ResidenceCountryCode;
	public String ResidenceGeocodeAccuracy;
	public Decimal ResidenceLatitude;
	public Decimal ResidenceLongitude;
	public String ResidencePostalCode;
	public String ResidenceState;
	public String ResidenceStateCode;
	public String ResidenceStreet;
	public Integer ResidenceYearCount;
	public String ResidencyType;
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
	public LoanApplicantAddressFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public LoanApplicantAddressHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public LoanApplicantAddress clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantAddress clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantAddress clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantAddress clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantAddress clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
