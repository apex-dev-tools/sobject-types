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
public class PersonLifeEvent extends SObject {
	public static SObjectType$<PersonLifeEvent> SObjectType;
	public static SObjectFields$<PersonLifeEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Datetime EventDate;
	public String EventDescription;
	public Address EventLocation;
	public String EventLocationCity;
	public String EventLocationCountry;
	public String EventLocationCountryCode;
	public String EventLocationGeocodeAccuracy;
	public Decimal EventLocationLatitude;
	public Decimal EventLocationLongitude;
	public String EventLocationPostalCode;
	public String EventLocationState;
	public String EventLocationStateCode;
	public String EventLocationStreet;
	public String EventType;
	public Datetime ExpirationDate;
	public String ExpirationDescription;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsExpired;
	public Boolean IsTentative;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PrimaryPersonId;
	public Contact PrimaryPerson;
	public Id RelatedPersonId;
	public Contact RelatedPerson;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SystemModstamp;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public Case[] Cases;
	public Claim[] Claims;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public PersonLifeEventFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AuthFormRequestRecord[] FormRequestRecordRelatedRecords;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public PersonLifeEventHistory[] Histories;
	public InfoAuthorizationRequest[] InfoAuthRequestSourceRecords;
	public MultipartyInfoAuthRequest[] MultipartyInfoAuthRequestSourceRecords;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public PersonLifeEventShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public PersonLifeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PersonLifeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PersonLifeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PersonLifeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PersonLifeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
