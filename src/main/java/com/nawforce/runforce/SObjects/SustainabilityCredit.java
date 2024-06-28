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
public class SustainabilityCredit extends SObject {
	public static SObjectType$<SustainabilityCredit> SObjectType;
	public static SObjectFields$<SustainabilityCredit> Fields;

	public Decimal CostPerUnit;
	public Id CrbnCreditProjectId;
	public CrbnCreditProject CrbnCreditProject;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal CreditsAllocated;
	public Decimal CreditsAvailable;
	public Date CreditsIssueDate;
	public Decimal CreditsPurchased;
	public Date CreditsRetiredDate;
	public String CreditsUnit;
	public String CurrencyIsoCode;
	public String Description;
	public String ExternalIdentifier;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Date PurchaseDate;
	public String Status;
	public Id SupplierId;
	public Supplier Supplier;
	public Id SustainabilityPurchaseId;
	public SustainabilityPurchase SustainabilityPurchase;
	public Datetime SystemModstamp;
	public Decimal TotalCost;
	public String VintageYear;

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
	public SustainabilityCreditFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public SustainabilityCreditHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SustainabilityCreditShare[] Shares;
	public CrbnCreditDistribution[] SustainabilityCreditCrbnCrAllocs;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public SustainabilityCredit clone$() {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityCredit clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityCredit clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityCredit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityCredit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
