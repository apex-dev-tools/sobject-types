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
public class BusinessLicense extends SObject {
	public static SObjectType$<BusinessLicense> SObjectType;
	public static SObjectFields$<BusinessLicense> Fields;

	public Id AccountId;
	public Account Account;
	public Id BusinessTypeId;
	public BusinessType BusinessType;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id HealthcareProviderId;
	public HealthcareProvider HealthcareProvider;
	public Id Id;
	public String Identifier;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsPrimaryLicense;
	public Date IssueDate;
	public String Issuer;
	public String JurisdictionCountry;
	public String JurisdictionOther;
	public String JurisdictionState;
	public String JurisdictionType;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LicenseClass;
	public String LicenseNumber;
	public String LineOfAuthority;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime PeriodEnd;
	public Datetime PeriodStart;
	public Id RegulatoryAuthorizationTypeId;
	public RegulatoryAuthorizationType RegulatoryAuthorizationType;
	public String ResidenceStatus;
	public Date SourceSystemUpdateDate;
	public String Status;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;
	public String VerificationStatus;
	public Date VerifiedDate;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AuthApplicationPlace[] ApplAuthorization;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public AuthApplicationAsset[] AuthApplicationAssetLicense;
	public BusinessLicenseApplication[] BusinessLicenseApplicationPermit;
	public CareProviderAdverseAction[] CareProviderAdverseActions;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public Visit[] Contexts;
	public DistributorAuthorization[] DistributorAuthorizations;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public BusinessLicenseFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public BusinessLicenseHistory[] Histories;
	public IndividualApplication[] IndividualApplicationPermit;
	public InsuranceContract[] InsuranceContracts;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RegulatoryCodeViolation[] RegCodeResponseContext;
	public RegulatoryTrxnFee[] RegulatoryTrxnFees;
	public BusinessLicenseShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public BusinessLicense clone$() {throw new java.lang.UnsupportedOperationException();}
	public BusinessLicense clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLicense clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLicense clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLicense clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
