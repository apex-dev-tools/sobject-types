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
public class PersonEducation extends SObject {
	public static SObjectType$<PersonEducation> SObjectType;
	public static SObjectFields$<PersonEducation> Fields;

	public String CertificateIdentifier;
	public Datetime CompletionDate;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EducationLevel;
	public Datetime GraduationDate;
	public Id HealthcareProviderId;
	public HealthcareProvider HealthcareProvider;
	public Id Id;
	public String Identifier;
	public String IdentifierIssuer;
	public Id IndividualId;
	public Individual Individual;
	public Address InstitutionAddress;
	public String InstitutionCity;
	public String InstitutionCountry;
	public String InstitutionCountryCode;
	public String InstitutionGeocodeAccuracy;
	public Decimal InstitutionLatitude;
	public Decimal InstitutionLongitude;
	public String InstitutionPostalCode;
	public String InstitutionState;
	public String InstitutionStateCode;
	public String InstitutionStreet;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String ProgramName;
	public Datetime StartDate;
	public String Status;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;
	public String VerificationStatus;
	public Datetime VerifiedDate;

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
	public PersonEducationFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public PersonEducationHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public PersonEducationShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public PersonEducation clone$() {throw new java.lang.UnsupportedOperationException();}
	public PersonEducation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PersonEducation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PersonEducation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PersonEducation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
