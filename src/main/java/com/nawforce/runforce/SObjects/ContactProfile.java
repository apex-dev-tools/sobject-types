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
public class ContactProfile extends SObject {
	public static SObjectType$<ContactProfile> SObjectType;
	public static SObjectFields$<ContactProfile> Fields;

	public Date AdvancementGraduationDate;
	public Id BirthCountryId;
	public GeoCountry BirthCountry;
	public String BirthPlace;
	public String BirthSex;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public String Ethnicity;
	public String GenerationalCohort;
	public String HighestEducationLevel;
	public String HousingStatus;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsFirstGenerationStudent;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LivingArrangementType;
	public String Location;
	public String MilitaryBranch;
	public String MilitaryService;
	public String Name;
	public Id PrimaryCitizenshipId;
	public GeoCountry PrimaryCitizenship;
	public String PrimaryCitizenshipType;
	public String Race;
	public String ResidenceSubType;
	public String ResidenceType;
	public Id SecondaryCitizenshipId;
	public GeoCountry SecondaryCitizenship;
	public String SecondaryCitizenshipType;
	public Datetime SystemModstamp;
	public String TribalAffiliationType;
	public String Website;

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
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ContactProfileFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ContactProfileHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public ContactProfile clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContactProfile clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContactProfile clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContactProfile clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContactProfile clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
