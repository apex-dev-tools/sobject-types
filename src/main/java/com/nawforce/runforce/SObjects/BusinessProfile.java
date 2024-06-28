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
public class BusinessProfile extends SObject {
	public static SObjectType$<BusinessProfile> SObjectType;
	public static SObjectFields$<BusinessProfile> Fields;

	public Id AccountId;
	public Account Account;
	public String BusinessOperatingName;
	public String BusinessStructure;
	public String BusinessTaxIdentifier;
	public Integer ConsecWorkersCompCoverage;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer CreditTypesUsed;
	public String CurrencyIsoCode;
	public String Division;
	public Boolean HasDishonoredPolicies;
	public Boolean HasSufferedBankruptcy;
	public Boolean HasUncorrectedSafetyViolations;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SystemModstamp;
	public Integer WorkersCompClaims;
	public Integer WorkersCompMedicalClaims;

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
	public BusinessProfileFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public BusinessProfileHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public BusinessProfile clone$() {throw new java.lang.UnsupportedOperationException();}
	public BusinessProfile clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BusinessProfile clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BusinessProfile clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BusinessProfile clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
