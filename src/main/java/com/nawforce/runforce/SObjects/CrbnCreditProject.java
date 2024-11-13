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
public class CrbnCreditProject extends SObject {
	public static SObjectType$<CrbnCreditProject> SObjectType;
	public static SObjectFields$<CrbnCreditProject> Fields;

	public String AdditionalBenefits;
	public String Country;
	public String CrbnCrMethodology;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DeveloperAccountId;
	public Supplier DeveloperAccount;
	public String ExternalIdentifier;
	public String FundedBy;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MitigationType;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String ProjRegistryIdentifier;
	public String ProjectType;
	public String ProjectUrl;
	public String Region;
	public String StandardsAgencyName;
	public Datetime SystemModstamp;
	public Decimal TotalCrbnCrAllocInTco2e;
	public Decimal TotalCrbnCrAvlInTco2e;
	public Decimal TotalCrbnCrPurchInTco2e;
	public Decimal TotalSpend;
	public String VerifiedBy;
	public String VoluntaryRegistryName;

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
	public CrbnCreditProjectFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CrbnCreditProjectHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public CrbnCreditProjectShare[] Shares;
	public SustainabilityCredit[] SustainabilityCredits;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CrbnCreditProject clone$() {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditProject clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditProject clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditProject clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditProject clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
